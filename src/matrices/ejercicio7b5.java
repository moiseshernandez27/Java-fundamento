/*
utilizando dos tablas de tamaño 2x4 y 4x2, cargar la primera y trasponerla en la segunda.
*/
package matrices;

import java.util.Scanner;

public class ejercicio7b5 {
    public static void main(String[] args) {
          Scanner en = new Scanner(System.in);
        int m[][] = new int[2][4];
        int n[][] = new int[4][2];
        //LLENANDO MATRIZ 
        System.out.println("LLENE LA PRIMERA MATRIZ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + i + "] [" + j + "]:");
                m[i][j] = en.nextInt();
            }
        }
        //MOSTRANDO MATRIZ
        System.out.println("***MATRIZ***");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("");
        //TRANSPONIENDO MATRIZ
        System.out.println("TRANSPONIENDO...");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                n[i][j] = m[j][i];
            }
        }
        System.out.println("NUEVA MATRIZ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
