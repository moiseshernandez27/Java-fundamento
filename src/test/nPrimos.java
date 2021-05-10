//Realizar un programa que nos pida n y decir cuantos numeros primos hay entre 1 y n
package test;

import javax.swing.JOptionPane;

public class nPrimos {

    public static void main(String[] args) {
        int n;
        int contador_primos = 0;
        boolean primos = true;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese"));
        int j = 2;
        for (int i = 0; i < n; i++) {
            while (j <= i - 1 && primos == true) {
                if (i % j == 0) {
                    primos = false;
                }
                j++;
                if (primos == true) {
                    contador_primos++;
                }
            }
            }
            System.out.println(++contador_primos);

        }

    }
