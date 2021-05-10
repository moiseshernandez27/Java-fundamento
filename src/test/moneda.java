/*
Realiza una moneda que de cara o sello
 */
package test;
public class moneda {
    public static void main(String[] args) {
        double num;
        int contadorCara=0;
        int contadorSello=0;
        for (int i = 0; i < 1000; i++) {
        num=Math.random()*1;
        if (num<0.5) {
            //System.out.println("Cara");
            ++contadorCara;
        }
        else{ ++contadorSello;}
       
        }
        System.out.println("CARA: "+contadorCara);
        System.out.println("Sello: "+contadorSello);
    }
    
}
