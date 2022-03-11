/*
ejercicio 8
contruir un program que calc y muestre por pantalla
las raices de la ecuacion de segundo grado de 
coeficientes reales.
 */
package oprado;

import java.util.Scanner;

/**
 *
 * @author arturo
 */
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a,b,c,result1,result2;
        System.out.println("Digite el valor de a: ");
        a = entrada.nextDouble();
        System.out.println("Digite el valor de b ");
        b = entrada.nextDouble();
        System.out.println("Digite el valor de c ");
        c = entrada.nextDouble();
        
        result1 = (-b+Math.sqrt(Math.pow(b, 2) - (4*a*c))) / (2*a);
        result2 = (-b-Math.sqrt(Math.pow(b, 2) - (4*a*c))) / (2*a);
        System.out.println("\nLa raiz 1 es: " + result1);
        System.out.println("La raiz 2 es: " + result2);
    }
}
