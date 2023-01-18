/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleadoPackage;

/**
 *
 * @author vla.lopez
 */
public class Empleado implements Comparable<Empleado>{
     private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String toString(){
        return "Empleado con nombre: "+nombre+", apellido: "+apellido+", edad: "+edad+", tiene un salario de: "+salario;
    }

    @Override
    public int compareTo(Empleado e) {
        if(e.getSalario()>=salario){
            return 0;
        }else if(e.getSalario()<salario){
            return -1;
        }else{
            return 1;
        }
         
    }
    
   
    
    
    
}
