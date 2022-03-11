/*
ejercicio 7  
contruir un program que, daddo un nuemro total de horas,
devuelva el numero de semanas, dias y horas equivalentes.
por ejemplo 1000 horas debe mostrar 5 semanas, 6 dias y 16 horas.
 */
package oprado;

import java.util.Scanner;

/**
 *
 * @author arturo
 */
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int hTotales,sem,dias,horas;
        System.out.println("Digite el numero de horas: ");
        hTotales = entrada.nextInt();
        
        sem = hTotales / 168;
        dias = hTotales%168 / 24;
        horas = hTotales%24;
        
        System.out.println("\nEl equivalente es: ");
        System.out.println("Semanas " +sem);
        System.out.println("Dias " + dias);
        System.out.println("Horas: " + horas);
        
    }
    
}
