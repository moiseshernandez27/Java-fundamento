/*
8. Crear una matriz “marco” de tamaño 8x6: todos sus elementos deben ser 0 salvo los de los bordes que
deben ser 1. Mostrarla.
 */
package matrices;

import java.util.Scanner;

public class ejercicio8b5 {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        int matriz[][] = new int[8][6];
        int nu = 1;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = nu;
            }
        }
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 5; j++) {
                matriz[i][j] = 0;
            }
        }
        System.out.println("Imprimiendo matriz");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }

    }
}
