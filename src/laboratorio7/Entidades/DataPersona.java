/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio7.Entidades;

/**
 *
 * @author marco
 */
public class DataPersona {

    private String nombre;
    private String dni;
    private int sexo;

    public DataPersona(String nombre, String dni, int sexo) {
        this.nombre = nombre;
        this.dni = dni;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getSexo() {
        return sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

}
