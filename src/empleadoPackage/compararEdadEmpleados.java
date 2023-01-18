/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleadoPackage;

import java.util.Comparator;

/**
 *
 * @author vla.lopez
 */
public class compararEdadEmpleados implements Comparator<Empleado>{

    @Override
    public int compare(Empleado a, Empleado b) {
        if(a.getEdad()>=b.getEdad()){
            return 0;
        }else if(a.getEdad()<=b.getEdad()){
            return -1;
        }else{
            return 1;
        }
    }
    
}
