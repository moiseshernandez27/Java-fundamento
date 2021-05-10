
package test;

import javax.swing.JOptionPane;

public class Horas {
    public static void main(String[] args) {
        int horasTotales, semana, dias,meses, horas;
        horasTotales=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de horas totales"));
        meses=(horasTotales/720);
        semana=(horasTotales/280);
        dias=(horasTotales/24);
        JOptionPane.showMessageDialog(null,horasTotales + " horas respresentan "
                + meses + " mes/meses " + semana +" semana/s "+dias+" dia/s");
        
        
    }
}
