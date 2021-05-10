package test;

import javax.swing.JOptionPane;

public class JuegoAleatorio {

    public static void main(String[] args) {
        int n;
        int nAleatorio = 27;
        int intentos = 1;
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Descubra el numero del 0-100"));
        if (n < nAleatorio) {
            JOptionPane.showInputDialog(null, "El numero es mayor");
            ++intentos;
        }
        else if (n > nAleatorio) {
            JOptionPane.showInputDialog(null, "El numero es menor");
            ++intentos;
        }
        else if (n ==nAleatorio){
            JOptionPane.showInputDialog(null, "**FELICIDADES " + nAleatorio + " ERA EL NUMERO CORRECTO" +"NUMERO DE INTENTOS: " + intentos);
        }
    }
}
