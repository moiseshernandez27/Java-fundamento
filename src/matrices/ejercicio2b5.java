/*
Crear y cargar una tabla de tamaño 4x4 y decir si es simétrica o no, es decir si se obtiene la
misma tabla al cambiar las filas por columnas.
 */
package matrices;

import java.util.Scanner;

public class ejercicio2b5 {
    public static void main(String[] args) {
        Scanner en= new Scanner(System.in);
        System.out.println("Ingrese el numero de filas");
        int f= en.nextInt();
        System.out.println("Ingrese el numero de columnas");
        int c= en.nextInt();
        int m[][]=new int [f][c];
        if (f==c) {
            System.out.println("***LA TABLA ES SIMETRICA***");
        }
        else{System.out.println("***LA TABLA NO ES ASIMETRICA***");}
    }
}
