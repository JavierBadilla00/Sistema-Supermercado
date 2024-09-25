/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_supermercado;


/**
 *
 * @author Jorge
 */
public class Cliente {
    
    String Cedula;
    String Nombre;
    String Apellidos;
    String Telefono;
    String Direccion;

    public Cliente(String Cedula, String Nombre, String Apellidos, String Telefono, String Direccion) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
    }

    public Cliente() {
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Cedula=" + Cedula + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Telefono=" + Telefono + ", Direccion=" + Direccion + '}';
    }
    
    
    
    
    
}
