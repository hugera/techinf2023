 package PARA;

import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class Media_Arit {
     
    public static void main(String[] args) {
       
        float soma = 0;
        float media;
        int cont;

        for (cont = 0; cont < 10; cont++) {
            String input = JOptionPane.showInputDialog(null, "Digite um número:");
            float numero = Float.parseFloat(input);
            soma += numero;
        }

        media = soma / cont;

        JOptionPane.showMessageDialog(null, "A média aritmética é: " + media);
    }
}

