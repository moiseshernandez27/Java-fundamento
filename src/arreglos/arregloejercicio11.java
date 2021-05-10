/*
LEER 5 ELEMENTOS NUMERICOS QUE SE INTRODUCIRAN ORDENADOS DE FORMA CRECIENTE ESTOS LOS GUARDAREMOS EN UNA 
TABLA DE 10 , LEER UN NUMERO N E INSERTARLO DE FORMA QUE CONTINUE ORDENADA
 */
package arreglos;

import java.util.Scanner;

public class arregloejercicio11 {

    public static void main(String[] args) {
        int nu[] = new int[10];
        int n;
        int pos = 0;
        Scanner en = new Scanner(System.in);
        //INGRESANDO NUMEROS
        System.out.println("Ingrese los 5 numeros de forma creciente");
        for (int i = 0; i < 5; i++) {
            nu[i] = en.nextInt();
        }
        //NUEVO NUMERO
        System.out.println("Ingrese el nuevo numero");
        n = en.nextInt();
        //CONTANDO LAS POSICIONES QUE TENGO QUE CORRER EL ARREGLO CON EL CONTADOR
        for (int i = 0; i < 5; i++) {
            if (n > nu[i]) {
                pos++;
            }
        }
        //CORRIENDO LOS VALORES UNA POSICION
        for (int i = 4; i >= pos; i--) {
            nu[i + 1] = nu[i];
        }
        //iMPRIMIENDO VALORES
        nu[pos] = n;
        System.out.println("Imprimiendo nuevos valores");
        for (int i = 0; i < 6; i++) {
            System.out.println(nu[i]);
        }

    }
}
