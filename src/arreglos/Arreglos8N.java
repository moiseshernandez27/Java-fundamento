//LEER 8 NUMEROS INT GUARDARLOS EN UN ARREGLOY MOSTRAR PRMERO CON ULTIMO ETC  
package arreglos;

import java.util.Scanner;

public class Arreglos8N {

    public static void main(String[] args) {
        int numeros[] = new int[8];

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los numeros");
        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + ". Ingrese el numero: ");
            numeros[i] = entrada.nextInt();
            
        }

        System.out.println("Numeros en orden Ascendente-Descendente: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]+"-"+numeros[7- i]);
            
        }

    }
}
