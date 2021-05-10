/*
 Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma.
 */
package matrices;

import java.util.Scanner;

public class ejercicio3b5 {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        int a[][], b[][], suma[][];
        a = new int[3][3];
        b = new int[3][3];
        suma = new int[3][3];
        System.out.println("Llenando matriz -A-");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese la posicion [" + i + "] + [" + j + "]");
                a[i][j] = en.nextInt();
            }
        }
            System.out.println("Llenando matriz -B-");
           for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese la posicion [" + i + "] + [" + j + "]");
                b[i][j] = en.nextInt();
            }
           }
           //SUMANDO LAS DOS MATRICES EN UNA TERCERA
            System.out.println("Llenando tercera matriz");
            for (int i = 0; i < 3; i++) {

                for (int j = 0; j < 3; j++) {
                    suma[i][j] = a[i][j] + b[i][j];
                }
            }
            //Mostrando resultados
            System.out.println("Imprimiendo suma");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(suma[i][j]+" ");
                }
                System.out.println(" ");
            }
           }
        }
    




    
