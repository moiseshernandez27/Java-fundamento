//Pedir 10 numeros, mostrar la media de los numeros positivos,la media de los negativos y la cantidad de ceros
package test;

import javax.swing.JOptionPane;

public class Video36 {

    public static void main(String[] args) {
        int numero;
        int suma_pos = 0;
        int suma_neg = 0;
        int conteo_neg = 0;
        int conteo_pos = 0;
        int conteo_cer = 0;
        float media_pos;
        float media_neg;

        for (int i = 1; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los numeros"));
            if (numero == 0) {//SI EL NUMERO ES CERO
                conteo_cer++;
            } else if (numero >= 0) {//SI EL NUMERO ES POSITIVO
                suma_pos = suma_pos + numero;//SUMAMOS PARA LUEGO SACAR LA MEDIA
                conteo_pos++;//SUMAMOS UN CONTADOR PARA DIVIDIR
            } else {//SI EL NUMERO ES NEGATIVO
                suma_neg = suma_neg + numero;
                conteo_neg++;
            }
        }
        if (conteo_pos == 0) {
            JOptionPane.showMessageDialog(null, "No se puede digitar");
        } else if (conteo_pos > 0) {
            media_pos = (float) suma_pos / conteo_pos;
            JOptionPane.showMessageDialog(null, "Su media de los numeros positivos es: " + media_pos);
        }
        if (conteo_neg == 0) {
            JOptionPane.showMessageDialog(null, "No se puede digitar");
        } else if (conteo_neg > 0) {
            media_neg = (float) suma_neg / conteo_neg;
            JOptionPane.showMessageDialog(null, "Su media de los numeros negativos es: " + "-" + media_neg);
        }
        JOptionPane.showMessageDialog(null, "La cantidad de ceros es: " + conteo_cer);
    }

}
