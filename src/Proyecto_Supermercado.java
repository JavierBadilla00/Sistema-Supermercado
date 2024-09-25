/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyecto_supermercado.ConexionACCESS;
import proyecto_supermercado.Venta;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jorge
 */

public class Proyecto_Supermercado {
    
     static ArrayList <Venta> listaVenta = new ArrayList<>();
    
     private static DefaultTableModel modelo;

    public static void main(String[] args) {
        modelo = new DefaultTableModel();
        CargarVentas();
    }

    private static void CargarVentas() {
        listaVenta.clear();
        modelo.setRowCount(0);
        Document documento = new Document();
        String destino = "Reporte_Ventas.pdf";
        
        try (Connection conn = ConexionACCESS.getConnection()) {
            String sql = "SELECT * FROM Ventas";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            
            PdfWriter.getInstance(documento, new FileOutputStream(destino));
            documento.open();
            
            Phrase p = new Phrase("-REPORTE DE VENTAS-\n\n");
            documento.add(p);
            
            
            PdfPTable table = new PdfPTable(7);

          
            table.addCell("ID");
            table.addCell("Fecha");
            table.addCell("Cliente");
            table.addCell("Producto");
            table.addCell("Precio");
            table.addCell("Cantidad");
            table.addCell("Total");
            

            while (resultSet.next()) {
                String ID = resultSet.getString("ID");
                Date Fecha = resultSet.getDate("Fecha");
                String Cliente = resultSet.getString("ID_Cliente");
                String Producto = resultSet.getString("Producto_ID");
                int Precio = resultSet.getInt("Precio");
                int Cantidad = resultSet.getInt("Cantidad");
                int Total = resultSet.getInt("Total");

               
                Venta v = new Venta(ID, Fecha, Cliente, Producto, Precio, Cantidad, Total);
                listaVenta.add(v);
                modelo.addRow(new Object[]{ID, Fecha, Cliente, Producto, Precio, Cantidad, Total});

               
                table.addCell(ID);
                table.addCell(Fecha.toString());
                table.addCell(Cliente);
                table.addCell(Producto);
                table.addCell(String.valueOf(Precio));
                table.addCell(String.valueOf(Cantidad));
                table.addCell(String.valueOf(Total));
            }
            
           
            documento.add(table);
            documento.close();
            
            JOptionPane.showMessageDialog(null, "Reporte generado exitosamente: " + destino);
            
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Proyecto_Supermercado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Proyecto_Supermercado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
