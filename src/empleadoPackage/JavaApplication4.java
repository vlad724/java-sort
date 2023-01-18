/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleadoPackage;

import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author vla.lopez
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       ArrayList<Empleado> empleados = new ArrayList<>();
       
       Empleado e1 = new Empleado("Andres", "Aguirre", 60, 1500);
       Empleado e2 = new Empleado("Cristian", "Carrasco", 50, 2000);
       Empleado e3 = new Empleado("Bastian", "Bastias", 42, 1000);
       
       empleados.add(e1);
       empleados.add(e2);
       empleados.add(e3);
       
        // Ordena por salario con el metodo propio de la interfaz Comparable llamado compareTo
       Collections.sort(empleados);
       
       // Ordena por apellido utilizando Comparator de la clase CompararEmpleados
       //Collections.sort(empleados, new compararNombre());
       
        // Ordena por edad utilizando Comparator de la clase CompararEmpleados
       //Collections.sort(empleados, new compararEdadEmpleados());
       
        
        for(Empleado aux: empleados){
            System.out.println(aux);
        }
       
    }
    
}
