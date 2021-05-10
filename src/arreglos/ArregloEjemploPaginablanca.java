//13. Leer 10 enteros. Guardar en otra tabla los elementos pares de la primera, y a continuación los elementos
//impares.
package arreglos;

import java.util.Scanner;

public class ArregloEjemploPaginablanca {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        System.out.println("digite el numero de filas");
        int nfilas = en.nextInt();
        System.out.println("digite el numero de columnas");
        int ncol = en.nextInt();
        int matriz[][] = new int[nfilas][ncol];

        for (int i = 0; i < ncol; i++) {
            for (int j = 0; j < nfilas; j++) {
                System.out.println("ingrese");
                matriz[i][j] = en.nextInt();
            }
        }
        System.out.println("Imprimiendo matriz");
        for (int i = 0; i < nfilas; i++) {
            for (int j = 0; j < ncol; j++) {
                System.out.println("matriz = " + matriz[i][j]);
            }
            System.out.println("");
        }

    }
}
