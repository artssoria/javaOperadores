/*
program que lea un caracter por telcado y compuebe si es 
una letra mayuscula
 */
package oprado;

import javax.swing.JOptionPane;

/**
 *
 * @author arturo
 */
public class ejercicioCondicionales3 {
    public static void main(String[] args) {
        char letra;
        
        letra = JOptionPane.showInputDialog("digite una letra : ").charAt(0);
        
        if (Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null, "Es una letra mayuscula");
        }else{
            JOptionPane.showMessageDialog(null, "Es una letra minuscula");
            
        }
    }
}
