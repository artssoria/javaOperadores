/*
pedir dos numeros  y decir cual es el mayot o sin son iguales
 */
package oprado;

import javax.swing.JOptionPane;

/**
 *
 * @author arturo
 */
public class ejercicioCondicionales2 {
    public static void main(String[] args) {
        int n1,n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
        
        if (n1 > n2) {
            JOptionPane.showMessageDialog(null, "El numero mayor es: " + n1);
        }else if (n2 > n1) {
            JOptionPane.showMessageDialog(null, "El numero mayor es: " + n2);
            
        }else{
            JOptionPane.showMessageDialog(null, "ambos numeros son iguales");
            
        }
            
        
        
    }
}
