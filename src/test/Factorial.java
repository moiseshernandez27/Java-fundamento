//Pedir un numero y calcular su factorial
package test;

import javax.swing.JOptionPane;

public class Factorial {
    public static void main(String[] args) {
        int n;int f=1;
        
        n=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero a factorizar"));
        for(int i=n;i>0;i--){
            f=f*i;
            System.out.println("El valor factorial es = " + f + "!");
        }
        
    }
}
