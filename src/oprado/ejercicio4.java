/*
 ejercicio 4
una compañia de venta de autos usados, paga a su personal de 
ventas un salario de 1000 mensuales, mas comision de 150 por
cada auto vendido, mas el 5% de valor del auto. Cada mes se 
ingresan los datos pertinentes. Hace un programa que calcule e 
imprima el salario mensual del vendedor en cuestion
 */
package oprado;

import java.util.Scanner;

/**
 *
 * @author arturo
 */
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int salario = 1000;
        int nCarrosVend;
        float cCarro, sTotal;
        
        System.out.println("Digite el total de autos vendidos: ");
        nCarrosVend = entrada.nextInt();
        System.out.println("Digite el costo del auto: ");
        cCarro = entrada.nextFloat();
        
        sTotal = salario + (nCarrosVend*150) + (0.05f*cCarro*nCarrosVend);
        System.out.println("\nEl salario del empleado es: " + sTotal);
    }
}
