//14. Leer dos series de 5 enteros, que estarán ordenados crecientemente. Copiar (fusionar) las dos tablas en
//una tercera, de forma que sigan ordenados.
package arreglos;

import java.util.Scanner;

public class arreglo14 {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        int n1[] = new int[10];
        int n2[] = new int[10];
        int n3[] = new int[40];
        System.out.println("LLene el primer arreglo");
        for (int i = 0; i < 5; i++) {
            n1[i] = en.nextInt();
        }
        System.out.println("Llene el segundo arreglo");
        for (int i = 0; i < 5; i++) {
            n2[i] = en.nextInt();
        }
        for (int j = 0; j < 40; j++) { 

            if (n1[j] < n2[j]) {
                n3[j]=n1[j];
                n3[j+1]=n2[j];

            }
        }
        System.out.println("Mostrando arreglo..");
        for (int i = 0; i < 40; i++) {
            System.out.println(n3[i]);
        }

    }

}
