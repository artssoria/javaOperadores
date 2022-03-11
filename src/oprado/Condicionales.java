/*
la sentencia if:
if (){
instruccion1;
}else {
intruccion2;
}

*/
package oprado;

import javax.swing.JOptionPane;

/**
 *
 * @author arturo
 */
public class Condicionales {
    public static void main(String[] args) {
          int num, dat = 5;
          num = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
          if (num == dat) {
            JOptionPane.showMessageDialog(null, "El numero es 5");
        }else{
              JOptionPane.showMessageDialog(null, "El numero es diferente");
          }
    }
}
