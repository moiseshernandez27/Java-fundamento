//leer 5 numeros Y MOSTRARLOS EN EL MISMO ORDEN
package arreglos;

import java.util.Scanner;

public class LeernArray {

    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner entrada=new Scanner(System.in);
        System.out.println("Guardando numeros");
        for(int i=4;i>=0;i--){
            System.out.print((i+1)+". Ingrese el numero");
            numeros[i] =entrada.nextInt();
        }
        System.out.println("Imprimiendo valores...");
        for(int i : numeros){
        System.out.println(i);
        }
    }

}
