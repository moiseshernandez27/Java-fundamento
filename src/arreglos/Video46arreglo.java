//LEER LOS DATOS CORRESPONDIENTES A DOS TABLAS DE 12 ELEMENTOS Y MEZCLARLOS EN UNA TERCERA 3 Y 3
package arreglos;

import javax.swing.JOptionPane;

public class Video46arreglo {
    public static void main(String[] args) {
        int n=6;
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n*2];
        
        for(int i=0;i<6;i++){
            a[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1)+" .introduzca el numero para -A-"));
        }
        for(int i=0;i<6;i++){
            b[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1)+" .introduzca el numero para -B-"));
        }
        int j=0;
        for(int k=0;j<6;k++){
            c[j]=a[k];
            j++;
            c[j]=a[k+1];
            j++;
            c[j]=a[k+2];
            j++;
            c[j]=b[k];
            j++;
            c[j]=b[k+1];
            j++;
            c[j]=b[k+2];
            j++;
        }
        for(int i=0;i<11;i++){
            JOptionPane.showInputDialog(null,"El arreglo de -C- es: " + c[i]);
        }
        
        
        
    }
}
