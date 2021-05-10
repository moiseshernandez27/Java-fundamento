//PEDIR 10 NUMEROS Y MOSTRAR SI SE HA INTRODUCIDO ALGUNO NEGATIVO
package test;

import javax.swing.JOptionPane;

public class NumeroNegativo {

    public static void main(String[] args) {
        int numeros = 0;
        int negativos=0;
        for (int i = 1; i <= 5; i++) {
            numeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los numeros"));
         if(numeros<0){
                ++negativos;
            }
        }
         JOptionPane.showConfirmDialog(null, "Se ingresaron "+ negativos+" numeros negativos");
    }

}
