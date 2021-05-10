package test;

import javax.swing.JOptionPane;

public class numeros10Crecientes {

    public static void main(String[] args) {
        int n[] = new int[10];
        for (int i = 0; i < 10; i++) {
            n[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + " .Ingrese los 10 numeros"));
        }
        for (int i = 0; i < 9; i++) {
            if (n[i] < n[i + 1]) {
                JOptionPane.showMessageDialog(null,"El arreglo va de forma creciente");
            }
        }
        for (int i = 0; i < 9; i++) {
            if (n[i] > n[i + 1]) {
                JOptionPane.showMessageDialog(null,"El arreglo va de forma decreciente");
            }
        }
        for (int i = 0; i < 9; i++) {
            if (n[i]==n[i+1]) {
                JOptionPane.showMessageDialog(null, "Todos los numeros son iguales");
            }
            else{JOptionPane.showMessageDialog(null, "Los numeros estan desordenados");}
        }
    }

}
