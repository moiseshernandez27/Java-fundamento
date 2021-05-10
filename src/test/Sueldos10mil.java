//Pedir 10 sueldos, mostrar su suma y cuantos hay mayores de 1000$
package test;

import java.util.Scanner;

public class Sueldos10mil {
    public static void main(String[] args) {
        int sueldos; int mil=0;int suma=0;
        Scanner pantalla= new Scanner(System.in);
        for(int i=1;i<=10;i++){
            System.out.println("Ingrese los sueldos");
            sueldos=Integer.parseInt(pantalla.nextLine());
            suma +=sueldos;
//            ++contadorsueldo;
//            System.out.println("Total Sueldo " + suma); 
            if(sueldos>=1000){
                ++mil;
                System.out.println("Cantidad de sueldos mayores a mil: " + mil);
                 System.out.println("Total Sueldo " + suma); 
            }
        }
    }
}
