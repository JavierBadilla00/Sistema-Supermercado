/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_supermercado;

import java.util.Date;

/**
 *
 * @author Javie
 */
public class Venta {
    String ID;
    Date Fecha;
    String ID_Cliente;
    String ID_Producto;
    int Precio;
    int Cantidad;
    int Total;

    public Venta(String ID, Date Fecha, String ID_Cliente, String ID_Producto, int Precio, int Cantidad, int Total) {
        this.ID = ID;
        this.Fecha = Fecha;
        this.ID_Cliente = ID_Cliente;
        this.ID_Producto = ID_Producto;
        this.Precio = Precio;
        this.Cantidad = Cantidad;
        this.Total = Total;
    }

    public Venta() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(String ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public String getID_Producto() {
        return ID_Producto;
    }

    public void setID_Producto(String ID_Producto) {
        this.ID_Producto = ID_Producto;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

    @Override
    public String toString() {
        return "Venta{" + "ID=" + ID + ", Fecha=" + Fecha + ", ID_Cliente=" + ID_Cliente + ", ID_Producto=" + ID_Producto + ", Precio=" + Precio + ", Cantidad=" + Cantidad + ", Total=" + Total + '}';
    }
    
          
    
}
