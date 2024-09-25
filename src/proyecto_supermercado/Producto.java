/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_supermercado;

/**
 *
 * @author Javie
 */
public class Producto {
    
    String ID;
    String Nombre;
    String ProveedorID;
    int Precio;

    public Producto(String ID, String Nombre, String ProveedorID, int Precio) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.ProveedorID = ProveedorID;
        this.Precio = Precio;
    }

    public Producto() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getProveedorID() {
        return ProveedorID;
    }

    public void setProveedorID(String ProveedorID) {
        this.ProveedorID = ProveedorID;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "ID=" + ID + ", Nombre=" + Nombre + ", ProveedorID=" + ProveedorID + ", Precio=" + Precio + '}';
    }
   
    
}
