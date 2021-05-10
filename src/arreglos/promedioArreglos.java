//LEER 5 NUMEROS POR ARREGLO SEPARAR POR POSITIVOS NEGATIVOS Y CEROS
package arreglos;

import javax.swing.JOptionPane;

public class promedioArreglos {

    public static void main(String[] args) {
        float numeros[] = new float[5];
        float posi = 0;
        float nega = 0;
        float cero = 0;
        float suma_pos=0;
        float suma_nega=0;
        float media_pos;
        float media_nega;
        for (int i = 0; i < 5; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Ingrese el numero"));
            if (numeros[i] > 0) {
                suma_pos += numeros[i];
                posi++;
            } else if (numeros[i] < 0) {
                suma_nega += numeros[i];
                nega++;
            } else {
                cero++;
            }
            
        }
        JOptionPane.showMessageDialog(null, "Numeros positivos: " + posi + "\nNumeros negativos: " + nega + "\nCero: " + cero);
            media_pos=(float)suma_pos/posi;
            media_nega=(float)suma_nega/nega;
            JOptionPane.showMessageDialog(null, "Media de los positivos: "+media_pos+"\nMedia de los negativos: "+media_nega);

    }
}
