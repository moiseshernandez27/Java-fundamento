//PARTICIPACION 10%     PRIMER EXAMEN 25%       SEGUNDO EXAMEN 25%      EXAMEN FINAL 40%    CALCULE NOTA FINAL       
package test;

import javax.swing.JOptionPane;

public class ClasificacionFinal {

    public static void main(String[] args) {
        float participacion, primer, segundo, examenFinal, notaFinal;
        participacion = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese su nota en participacion"));
        primer = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota obtenida en el primer parcial"));
        segundo = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota obtenida en el segundo parcial"));
        examenFinal = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota obtenida en el examen final"));
        notaFinal = ((participacion * 0.10F) + (primer * 0.25F) + (segundo * 0.25F) + (examenFinal * 0.40F));
//        JOptionPane.showInputDialog("Su nota final es: " + notaFinal);
        if (notaFinal >= 6.0) {
            JOptionPane.showMessageDialog(null, "***FELICIDADES USTED APROBÓ LA MATERIA***");
        } else {
            JOptionPane.showMessageDialog(null, "Lo sentimos, usted desaprobó, su nota final es: " + notaFinal);
        }

    }
}
