/*
DADAS LAS EDADES Y ALTURA DE 5 ALUMNOOS,*MOSTRAR LA EDAD Y *LA ESTATURA MEDIA *CANTIDAD DE ALUMNOS MAYORES A 18
*ALUMNOS QUE MIDEN MAS DE 1.78
 */
package test;

import javax.swing.JOptionPane;

public class AlumnosPromedio {

    public static void main(String[] args) {
        int edad;
        float altura;
        float mediaAltura=0;
        int mas18 = 0;
        int mas178 = 0;
        int edadMedia=0;
        int edadsuma = 0;
        for (int i = 1; i <= 5; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante " + i));
            edadsuma += edad;
            if (edad >= 18) {
                mas18++;
            }
            altura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura del estudiante "+ i ));
            mediaAltura += altura;
            if (altura >= 1.78) {
                mas178++;
            }
            mediaAltura = (float) (mediaAltura/5);
            edadMedia=(edadsuma/5);
        }
        JOptionPane.showInputDialog("La media de edad de sus estudiantes es " + edadMedia +
                "\nLa estatura promedio es " + mediaAltura + "\nHay "+ mas18+" estudiantes mayores de edad"
        + "\nHay "+mas178+" de mas de 1.78 mts");
        //LA ALTURA NO ME DIO BIEN
    }
}
