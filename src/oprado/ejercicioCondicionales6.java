/*
hacer un programa que capture 2 numeros para distinguirlos si son par o impar
 */
package oprado;

import javax.swing.JOptionPane;

/**
 *
 * @author arturo
 */
public class ejercicioCondicionales6 {
    public static void main(String[] args) {
        int n1,n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("digite un numero :"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("digite un numero :"));
        
        if ((n1%2==0) && (n2%2==0)) { //operador AND &&
            JOptionPane.showMessageDialog(null, "ambos numeros son pares");
        }else if ((n1%2 !=0) && (n2%2 !=0)) {
            JOptionPane.showMessageDialog(null, "ambos numeros son impares");
            
        }else{
            JOptionPane.showMessageDialog(null, "un numero es par y otro impar");
            
        }
    }
    
}
