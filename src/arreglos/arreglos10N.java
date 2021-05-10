/*
Crear un programa que lea por teclado 10 numeros enteros y desplace N posiciones(ingresadas por el usuario
 */
package arreglos;

import java.util.Scanner;

public class arreglos10N {

    public static void main(String[] args) {
        //DATOS YA INGRESADOS
        int n[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner en = new Scanner(System.in);
        System.out.println("Mostrando valores iniciales");
        int pos;
        for (int i = 0; i < 10; i++) {
            System.out.println(n[i]);
        }
        System.out.print("Ingrese la posicion que quiere mover: ");
        pos = en.nextInt();
        System.out.println("Cambiando posicion...");
        System.out.println("Imprimiendo nuevos valores...");
        //DESPLAZAR NUMERO 
        for (int i = 0; i <= pos; i++) {
            for (int p = 8; p >= 0; p--) {
                n[p + 1] = n[p];
            }
        }
        //MOSTRAR NUMEROS
        for (int i = 0; i < 10; i++) {
            System.out.println(n[i]);
        }
    }

}
