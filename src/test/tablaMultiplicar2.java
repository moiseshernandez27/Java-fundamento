/*
REALIZAR UNA TABALA DE MULTIPLICAR DEL 1 AL 10
 */
package test;

import java.util.Scanner;

public class tablaMultiplicar2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int multi;
        int nu=1;
        System.out.println("TABLA DE MULTIPLICAR");
            
        for (int i = 1; i < 11; i++) {
            multi=nu*i;
            System.out.println(multi);
        }
    }
    
}
