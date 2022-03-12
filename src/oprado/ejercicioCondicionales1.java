/*
hacer un program que lea un numero entero
y muestre si el numero es multiplo de 10
 */
package oprado;

import javax.swing.JOptionPane;

/**
 *
 * @author arturo
 */
public class ejercicioCondicionales1 {
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero multiplo de 10 "));
        if (numero%10==0) {
            JOptionPane.showMessageDialog(null, "el numero " + numero+ " es multiplo de 10");
            
        }else{
            JOptionPane.showMessageDialog(null, "el numero no es multiplo de 10");
          
        }
    }
}
