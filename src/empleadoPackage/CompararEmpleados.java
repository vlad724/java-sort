/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleadoPackage;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

class compararNombre implements Comparator<Empleado> {

    private Collator collator;

    public compararNombre() {
        this.collator = Collator.getInstance(new Locale("es"));
        collator.setStrength(Collator.TERTIARY);
    }

   
    @Override
    public int compare(Empleado a, Empleado b) {
        // si se quiere ordenar de manera descendiente se cambia a por a y b por a ejemplo: b.getNombre(), a.getNombre()
        return collator.compare(a.getNombre(), b.getNombre());
    }
}
