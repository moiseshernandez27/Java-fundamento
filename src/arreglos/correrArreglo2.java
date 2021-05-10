/*
Correr arreglo de modo que el ultimo numero termine primero
 */
package arreglos;

import java.util.Scanner;

public class correrArreglo2 {

    public static void main(String[] args) {
        int arreglo[] = new int[10];
        int pos;
        Scanner en = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print(i + 1 + ". Ingrese el numero: ");
            arreglo[i] = en.nextInt();
        }
        int ultimo = arreglo[9];
        
        for (int i = 8; i >= 0; i--) {
            arreglo[i + 1] = arreglo[i];
        }
        arreglo[0]=ultimo;
        System.out.println("Imprimiendo nuevos valores");
        for (int i = 0; i < 10; i++) {
            System.out.println(arreglo[i]);
        }

    }
}
