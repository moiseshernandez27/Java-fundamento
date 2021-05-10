/*
 Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer mediante el teclado 8 números.
Después se debe pedir un número y una posición, insertarlo en la posición indicada, desplazando los que estén
detrás.
 */
package arreglos;

import java.util.Scanner;

public class correrArreglo {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int t[] = new int[10];
        int elemento, posicion;
        // leemos 8 números
        System.out.println("Leyendo datos...");
        for (int i = 0; i < 8; i++) {
            System.out.print("Introduzca número: ");
            t[i] = Entrada.nextInt();
        }
        // pedimos el nuevo elemento y la posición
        System.out.print("Nuevo elemento: ");
        elemento = Entrada.nextInt();
        System.out.print("Posición donde insertar (de 0 a 8): ");
        posicion = Entrada.nextInt();
        // supondremos que la posición estará entre 0 y 8.
        // un valor distinto podría dar un error en tiempo de ejecución
        // una posible mejora, propuesta para el lector, es comprobar esto.

        // ahora desplazaremos los elementos de la tabla
        // desde posición hasta el último (en este caso 7)
        for (int i = 7; i >= posicion; i--) {
            t[i + 1] = t[i];
        }
        //insertamos el nuevo elemento
        t[posicion] = elemento;
        System.out.println("La tabla queda:");
        for (int i = 0; i < 9; i++) {
            System.out.println(t[i]);
        }
    }

}
