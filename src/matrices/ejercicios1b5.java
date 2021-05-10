/*
Crear una tabla bidimensional de tamaño 3x3 y rellenarla de la siguiente forma: la posición T[n,m]
debe contener n+m. Después se debe mostrar su contenido.
 */
package matrices;
public class ejercicios1b5 {
    public static void main(String[] args) {
        int m[][]= new int [3][3];
        for (int i = 0; i < 3; i++) {
            m[i][i]=i;          
         }
        for (int i = 0; i < 3; i++) {
            m[i][i]=i+1;
        }
        for (int i = 3; i <0; i--) {
            m[i][i]=m[i+1][i+1];
        }
//        for (int i = 1; i < 4; i++) {
//            m[i][i]=i;
//        }
        
        System.out.println("Imprimir");
        for (int j = 0; j < 3; j++) {
        for (int i = 0; i <3; i++) {
            System.out.print(m[i][j]);
        }
           System.out.println("");
        }
        System.out.println("");
    }
}
//**********************SIN COMPLETAR***********************************
