/*
 ejercicio 5 
la calificacion final de un estudiante de computacion se calcula
con base a las calificaciones de cuatro aspectos de su rendimiento
academico: participacion, primer examen parcial, segunda examen,
y examen final con ponderaciones del 10%, 25%, 25% y 40%.
Hacer un programa que calcule e imprima la calificacion final 
obtenida por estudiante
 */
package oprado;

import java.util.Scanner;

/**
 *
 * @author arturo
 */
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float part,priExam,segExam,exaFinal ,nFinal;
        //pedir nota de participacion
        System.out.println("Digite la nota de participación: ");
        part = entrada.nextFloat();
        System.out.println("Digite la nota del primer examen: ");
        priExam = entrada.nextFloat();
        System.out.println("Digite la nota del segundo examen: ");
        segExam = entrada.nextFloat();
        System.out.println("Digite la nota del examen final: ");
        exaFinal = entrada.nextFloat();
        //los calculos
        part *=  0.10f;
        priExam *=0.25f;
        segExam *= 0.25f;
        exaFinal *=0.40f;
        //suma de las notas 
        nFinal = part + priExam + segExam + exaFinal;
        // resultado de pantalla
        System.out.println("\nLa nota del estudiante es: " + nFinal);
    }
}
