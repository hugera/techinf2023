package PARA;

import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class Retorne_Imp {
    public static void main(String[] args) {
        float impares = 0;

        for (int i = 1; i <= 900; i++) {
            String input = JOptionPane.showInputDialog(null, "Digite um número:");
            float numero = Float.parseFloat(input);

            if (numero % 2 != 0) {
                impares++;
            }
        }

        JOptionPane.showMessageDialog(null, "A quantidade de números ímpares é: " + impares);
    }
}

