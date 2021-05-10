//EN CADA FACTURA FIGURA EL *CODIGO DEL ARTICULO *CANTIDAD VENDIDA EN LITROS *PRECIO POR LITRO
//CALCULAR FACTURACION TOTAL-CANTIDAD DE LITROS VENDIDOS ARTICULO1-FACTURAS DE MAS DE 600
package test;

import javax.swing.JOptionPane;

public class Detergentes {

    public static void main(String[] args) {
        int codigo, mas = 0;
        double litros;
        double totalPrecio = 0;
        double totalLitros1 = 0;
        double precioFinal=0;
        for (int i = 1; i <= 3; i++) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto vendido"));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los litros del producto vendido"));
            if (codigo == 1) {
                totalPrecio += litros * 5;
                totalLitros1 += litros;
                precioFinal=totalPrecio;
                if (precioFinal > 600) {
                    mas++;
                }
            } else if (codigo == 2) {
                totalPrecio += litros * 3;
            } else if (codigo == 3) {
                totalPrecio += litros * 1.25;
            }

        }
        JOptionPane.showInputDialog("Monto total pagado: " + totalPrecio + "$"
                + "\nCantidad de litros comprados:" + totalLitros1 + "$"
                + "\nCantidad de facturas de mas de 600: " + mas);

    }
}
