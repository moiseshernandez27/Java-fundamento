//12. Leer por teclado una tabla de 10 elementos numéricos enteros y una posición (entre 0 y 9). Eliminar el
//elemento situado en la posición dada sin dejar huecos.
package arreglos;

import java.util.Scanner;

public class arregloEjercicio12 {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        int nu[] = new int[5];
        int pos;
        //LLENANDO ARREGLO....
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresar elemento " + (i + 1) + ": ");
            nu[i] = en.nextInt();
        }
        System.out.println("");
        //INGRESANDO LA POSICION QUE SE ELIMINA 
        System.out.print("Ingrese la posicion que desea eliminar");
        pos = en.nextInt();
        //ELIMINANDO POSICION
        for (int i = pos; i < 4; i++) {
            nu[i] = nu[i + 1];

        }
        //IMPRIMIENDO NUEVOS VALORES
        System.out.println("Asi queda el arreglo...");
        for (int i = 0; i < 4; i++) {
            System.out.println(nu[i]);
        }
    }
}
