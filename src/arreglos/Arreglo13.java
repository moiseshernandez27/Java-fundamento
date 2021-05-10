//13. Leer 10 enteros. Guardar en otra tabla los elementos pares de la primera, y a continuación los elementos
//impares.
package arreglos;

import java.util.Scanner;

public class Arreglo13 {
    public static void main(String[] args) {
        Scanner en= new Scanner(System.in);
        int nu[]=new int[10];
        int par[]=new int[10];
        int impar[]=new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+". ingrese el valor");
            nu[i]=en.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (nu[i]%2==0) {
                par[i]=nu[i];
            }
            else if (nu[i]%2==1) {
                impar[i]=nu[i];
            }
        }
        System.out.println("Pares");
        for (int i = 0; i < 10; i++) {
            System.out.println(par[i]);
        }
        System.out.println("Impares");
        for (int i = 0; i < 10; i++) {
            System.out.println(impar[i]);
        }
    }
}
