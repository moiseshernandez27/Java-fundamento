//PIDE UN NUMERO(ENTRE 0 Y 10) Y MOSTRAR LA TABLA DE MULTIPLICACION
package test;

import javax.swing.JOptionPane;

public class tablaMultiplicar {
    public static void main(String[] args) {
        int numero;int contador=0;int resultado;
        
            numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero para ver la tabla"));
            while(contador<=9){
                contador++;
                resultado=numero*contador;
                System.out.println(numero + " x " + contador + " = "+ resultado);
            }
    }
}
