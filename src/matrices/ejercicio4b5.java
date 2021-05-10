
package matrices;
//Crear y cargar una tabla de tamaño 3x3, trasponerla y mostrarla.

import java.util.Scanner;

public class ejercicio4b5 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        int tabla[][]=new int [3][3];
        System.out.println("Cargue la primera tabla");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("A["+i+"]["+j+"]: ");
                tabla[i][j]=en.nextInt();
            }
        }
        System.out.println("Imprimiendo primera tabla");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabla[i][j]+" ");
                
            }
            System.out.println();            
        }
        System.out.println("Nueva tabla");
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabla[j][i]+" ");                
            }
             System.out.println();
         }
    }
}
