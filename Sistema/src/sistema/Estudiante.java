/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

/**
 *
 * @author Kenny Camba
 */
public class Estudiante {
    
    private String nombre;
    private final int matricula;
    private int edad;
    
    public Estudiante(String nombre, int matricula, int edad){
        this.nombre = nombre;
        this.matricula = matricula;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getMatricula(){
        return matricula;
    }
    
    public double promedio(){
        return 0.0;
    }
    
    public boolean addNota(){
        return true;
    }
    
    public boolean setNota(){
        return true;
    }
    
    public boolean estaAprobado() {
        return true;
    }
    
}