//5. Crear una tabla de tamaño 7x7 y rellenarla de forma que los elementos de la diagonal principal sean
//1 y el resto 0.
package matrices;

import java.util.Scanner;

public class ejercicio5b5 {
    public static void main(String[] args) {
        Scanner en= new Scanner(System.in);
        int m[][]=new int[7][7];
        for (int i = 0; i < 7; i++) {
            m[i][i]=1;
        }
        System.out.println("Imprimiendo...");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    
}
