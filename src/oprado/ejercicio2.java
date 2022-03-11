/*
hacer un program que calc e impr el salario semanal
de un empleado a partir de sus horas semanales 
trabajas y de su salario por hora
 */
package oprado;

import java.util.Scanner;

/**
 *
 * @author arturo
 */
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horaSemanales;
        float salarioHoras, salarioTotal;
        
        System.out.println("Digite las horas semanales trabajadas: ");
        horaSemanales = entrada.nextInt();
        System.out.println("Digite el salario que gana por horas:  ");
        salarioHoras = entrada.nextFloat();
        
        salarioTotal = horaSemanales * salarioHoras;
        
        System.out.println("\nEl salario semanal es: " + salarioTotal);
    }
}
