/*
ejercicio 3: Guillermo tiene (N) dolares.
Luis tiene la mitad de lo que tiene Guillermo
Juan tiene la mitad de lo que posee Luis y Guillermo juntos
Hacer un program que calc e impr la cant de dinero que tienen
los tres.
*/
package oprado;

import java.util.Scanner;

/**
 *
 * @author arturo
 */
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float guillermo, luis,juan,total;
        System.out.println("Digite la cantidad que tiene guillermo: ");
        guillermo = entrada.nextFloat();
        
        luis = guillermo / 2; // luis tiene la mitad que guillermo
        juan = (guillermo+luis) /2; // juan tiene la mitad de ambos
        
        total = guillermo+luis+juan;
        System.out.println("\nLa cantidad de dinero entre tres es: "+total);
    }
}
