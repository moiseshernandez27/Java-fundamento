//Pedir numero N y contar desde 1 hasta N
package test;

import javax.swing.JOptionPane;

public class MostrarNumero {
    public static void main(String[] args) {
        int N; int contador=0;
        N= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero"));
        while(contador<N){
            contador++;
         JOptionPane.showInputDialog(contador);
        }
    }
}
