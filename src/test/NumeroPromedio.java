package test;

import javax.swing.JOptionPane;

public class NumeroPromedio {
    public static void main(String[] args) {
        int numeros; int elementos=0; float media; int suma=0;
        numeros= Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        while(numeros >=0){
            suma=suma + numeros;
            ++elementos;   
            numeros= Integer.parseInt(JOptionPane.showInputDialog("ingrese otro numero"));
        }
       if(elementos==0){JOptionPane.showMessageDialog(null, "Ingreso numero negativo");}
       
    
    else{
    media=(float)suma/elementos;
    JOptionPane.showMessageDialog(null, "La media es " + media);
}
}    
}
