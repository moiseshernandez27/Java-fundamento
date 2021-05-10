/*Un obrero necesita calcular su salario semanal que obtiene de la siguiente manera:
-si trabaja 40 horas o menos le pagan 16$
-si trabaja mas de 40 las extras a 20$
 */
package test;

import javax.swing.JOptionPane;

public class EjercicioObrero {
    public static void main(String[] args) {
      int horasT;
      int horasM=40;
//      int horasX=horasT;
      horasT=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las horas trabajadas esta semana"));
      int horasX=horasT-horasM;
      if(horasT <= 40){
          JOptionPane.showMessageDialog(null, "Su sueldo es: " + (horasT*16) + "$" );
      }
      else if(horasT >40){JOptionPane.showMessageDialog(null, "Su sueldo es: " + ((horasM*16) + (horasX*20)) + "$" );}
    }
  
    
}
