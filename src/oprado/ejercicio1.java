/*
ejercicio 1 hacer un program que calc e impr la suma de 3 calificaciones
*/
package oprado;

import java.util.Scanner;

/**
 *
 * @author arturo
 */
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float n1,n2,n3,result;
        
        //guardamos las 3 notas 
        System.out.println("Digite 3 calificaciones:  ");
        n1 = entrada.nextFloat();
        n2 = entrada.nextFloat();
        n3 = entrada.nextFloat();
        
        result = n1+n2+n3;
        System.out.println("\nLa suma es: " + result);
    }
    
}
