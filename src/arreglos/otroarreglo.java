//EJERCICIO 12 ARREGLO Leer por teclado una tabla de 10 elementos numéricos enteros y una posición (entre 0 y 9). Eliminar el
//elemento situado en la posición dada sin dejar huecos.
package arreglos;

import java.util.Scanner;

public class otroarreglo {
    public static void main(String[] args) {
        int arreglo[]=new int[10];
        int pos;
        Scanner en= new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+". Ingrese el numero: ");
            arreglo[i]=en.nextInt();
        }
        System.out.println("Ingrese la posicion que desea eliminar¨0-9¨");
        pos=en.nextInt();
        for (int i = 8; i > pos; i--) {
            arreglo[i]=(i-1);
        }
        System.out.println("Nuevo arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
