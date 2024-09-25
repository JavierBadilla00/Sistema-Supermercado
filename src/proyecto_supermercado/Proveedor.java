/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_supermercado;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Javie
 */
public class Proveedor {
    
    String ID;
    String Nombre;
    

    public Proveedor(String ID, String Nombre) {
        this.ID = ID;
        this.Nombre = Nombre;
    }

    public Proveedor() {
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

    @Override
    public String toString() {
        return "Proveedor{" + "ID=" + ID + ", Nombre=" + Nombre + '}';
    }
    
  
}


