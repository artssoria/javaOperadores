/*
ejercicio 6
hacer un program que calcule el cuadrado de una suma

(a+b)2 = a2 + b2 + 2ab

usando el metodo math.pow
 */
package oprado;

import java.util.Scanner;

/**
 *
 * @author arturo
 */
public class ejercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, result;
        System.out.println("Digite el valor de a: ");
        a = entrada.nextDouble();
        System.out.println("Digite el valor de b: ");
        b = entrada.nextDouble();

        result = Math.pow(a, 2) + Math.pow(b, 2) + (2*a*b);
        System.out.println("\nEl resultado es: " + result );
    }
}
