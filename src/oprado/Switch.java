package oprado;

import javax.swing.JOptionPane;

/**
 *
 * @author arturo
 */
public class Switch {

    public static void main(String[] args) {
        int dato;
        dato = Integer.parseInt(JOptionPane.showInputDialog("digite un numero entre 1 y 5"));
        switch (dato) {
            case 1:
                JOptionPane.showMessageDialog(null, "es el numero 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "es el numero 2");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "es el numero 4");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "es el numero 5");
                break;
            default:
                JOptionPane.showMessageDialog(null, "el numero que busca no esta");
                
        }

    }
}
