package oprado;

import javax.swing.JOptionPane;

/**
 *
 * @author arturo
 */
public class operadorTernario {

    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("El numero es par o impar"));

        JOptionPane.showMessageDialog(null, (numero % 2 == 0) ? "es par" : "es impar");
    }
}
