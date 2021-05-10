//UNA COMPAÑIA DE VENTA DE VEHICULOS USADOS, PAGA A SU PERSONAL DE VENTAS UN SALARIO
//DE 1000$ MENSUALES, MAS UNA COMISION DE 150 POR AUTO VENDIDO MAS EL 5% DEL VALOR DEL MISMO
//CALCULE EL SALARIO DE UN VENDEDOR DADO   
package arreglos;

import javax.swing.JOptionPane;

public class testArreglos {

    public static void main(String[] args) {
        int empleado;
        int sueldo = 1000;
        int autosCantidad;
        int precioAuto = 3000;
        empleado = Integer.parseInt(JOptionPane.showInputDialog("SELECCIONE EL EMPLEADO \n1-Moises\n2-Marina\n2-Kevin"));

        switch (empleado) {
            case 1:
                JOptionPane.showMessageDialog(null, "Bienvenido Moises");
                autosCantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Cantidad de autos que vendio este mes"));
                JOptionPane.showInputDialog("Su sueldo este mes sera " + (sueldo + (autosCantidad * 150) + (precioAuto * 5 / 100)) + "$");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Bienvenida Marina");
                autosCantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Cantidad de autos que vendio este mes"));
                JOptionPane.showInputDialog("Su sueldo este mes sera " + (sueldo + (autosCantidad * 150) + (precioAuto * 5 / 100)) + "$");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Bienvenido Kevin");
                autosCantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Cantidad de autos que vendio este mes"));
                JOptionPane.showInputDialog("Su sueldo este mes sera " + (sueldo + (autosCantidad * 150)) + (precioAuto * 5 / 100) + "$");
                break;
            default:
                JOptionPane.showInputDialog("Usted ha ingresado un valor incorrecto");

        }

    }
}
