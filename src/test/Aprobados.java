/*
DADA LA NOTA DE 6 ALUMNOS ESCRIBIR LA CANTIDAD DE APROBADO, CONDICIONADOS=4 Y REPROBADOS */
package test;

import javax.swing.JOptionPane;

public class Aprobados {

    public static void main(String[] args) {
        double nota;
        int aprobado = 0, condicionados = 0, reprobado = 0;
        for (int i = 1; i <= 5; i++) {
            nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de los alumnos"));
            if (nota < 4) {
                reprobado++;
            } else if (nota == 4) {
                condicionados++;
            } else if (nota > 4) {
                aprobado++;
            }
            JOptionPane.showMessageDialog(null, "Cantidad de alumnos reprobados: " + reprobado
                    + "\nCantidad de Alumnos condicionados: " + condicionados + "\nCantidad de alumnos aprobados: " + aprobado);
        }
    }
}
