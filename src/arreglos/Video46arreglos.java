//LEER POR EL TECLADO DOS TABLAS DE 5 NUMEROS Y MEZCLAR EN EL MISMO ORDEN
package arreglos;

import javax.swing.JOptionPane;

public class Video46arreglos {

    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = new int[5];
        for(int i=0;i<5;i++){
            a[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1)+" .Ingrese el numero para A"));
        }
        for(int i=0;i<5;i++){
            b[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1)+". Ingrese el numero para B"));
        }
        for(int i=0;i<5;i++){
            JOptionPane.showMessageDialog(null,"A= "+a[i]+"B= "+b[i]);
        }
        
    }
}
