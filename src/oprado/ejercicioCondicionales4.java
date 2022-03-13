/*
en MegaPlaza se hace un 20% de descuento a los clientes
cuya compra supere los $300 ¿cual sera la cantidad 
que pagara una persona por su compra?
 */
package oprado;

import javax.swing.JOptionPane;

/**
 *
 * @author arturo
 */
public class ejercicioCondicionales4 {

    public static void main(String[] args) {
        float prComp, desc;

        prComp = Float.parseFloat(JOptionPane.showInputDialog("Digite el precio de compra: "));

        if (prComp > 300) {
            desc = prComp * 0.20f;
            prComp -= desc;
    JOptionPane.showMessageDialog(null, "el precio de compra es " + prComp); 
        }else{
    JOptionPane.showMessageDialog(null, "el precio de compra es " + prComp); 
           
        }

    }

}
