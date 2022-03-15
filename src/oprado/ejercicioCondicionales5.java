/*
Un obrero necesita calcular su salario semanal,
el cual se obtienen de la siguente manera:
si trabaja 40 horas o menos se le paga $16 por hora.
si trabaja mas de 40 horas se le paga $16 por cada
horas una de las primeras 40 horas $20 por cada hora extra
 */
package oprado;

import javax.swing.JOptionPane;

/**
 *
 * @author arturo
 */
public class ejercicioCondicionales5 {

    public static void main(String[] args) {
        int horasTrabajadas;
        float salarioTotal;
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas"));
        if (horasTrabajadas <= 40) {
            salarioTotal = horasTrabajadas * 16;

        } else {
            salarioTotal = (40 * 16) + ((horasTrabajadas - 40) * 20);

        }
        JOptionPane.showMessageDialog(null, "el salario total es: " + salarioTotal);
    }
}
