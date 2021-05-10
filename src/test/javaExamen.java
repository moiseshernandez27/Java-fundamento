/*
n entrenador le ha propuesto a un atleta recorrer una ruta de cinco kilómetros durante 10 días
para determinar si es apto para la prueba de 5 kilómetros que se desarrollará en el Parque
Centenario. No se sabe si está apto y para eso nos piden que hagamos el siguiente sistema.
Nos ingresan por cada día de entrenamiento (se debe validar el dato):
- Tiempo de la prueba en minutos (entero mayor que 0 y menor a 100)
Para considerarlo apto debe cumplir las siguientes condiciones:
- Que en ninguna de las pruebas haga un tiempo mayor a 20 minutos. (Esto es
determinante.)
- Que al menos en una de las pruebas realice un tiempo menor de 15 minutos.
- Que su promedio sea menor o igual a 18 minutos.

Se pide:
- Diseñar un algoritmo para registrar los datos y decidir si…
*/
package test;

import java.util.Scanner;

public class javaExamen {
    public static void main(String[] args) {
        Scanner en= new Scanner(System.in);
        int minutos=0;
        int mayor20=0;
        int menor15=0;
        double promedio=0;
        int total=0;
             for (int i = 0; i < 10; i++) {
                 System.out.println("Cuantos minutos tardo en correr los 5 km en el dia ("+(i+1)+")");
                 minutos=en.nextInt();
                 if (minutos <=0 && minutos>=100) {
                     
                 }
                 else{System.out.println("Valores incorrectos");}
        }   
         
          
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Dia ("+(i+1)+"):Ingrese el tiempo de carrera:");
//            minutos=en.nextInt();
//            
//        }
    }
}
