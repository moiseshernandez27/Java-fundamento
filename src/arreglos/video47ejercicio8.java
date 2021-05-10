//Diseñar una aplicacion que declare una tabla de 10 elementos enteros, leer 8,pedir posicion y agregar 1
package arreglos;

import java.util.Scanner;


public class video47ejercicio8 {

    public static void main(String[] args) {
        int numeros[] = new int[10];
        int p;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese los 8 numeros");
        for (int i = 0; i < 8; i++) {
            numeros[i] =entrada.nextInt();
        }
        System.out.println("Contando numeros..");
        System.out.println("Ingrese la posicion");
        p=entrada.nextInt();
        System.out.println("ingrese el nuevo numero");
        numeros[p]=entrada.nextInt();
        System.out.println("SUSTITUYENDO");
               for (int i = 9; i >0; i--) {
            System.out.println(numeros[i]);
             

    }
    }
}
