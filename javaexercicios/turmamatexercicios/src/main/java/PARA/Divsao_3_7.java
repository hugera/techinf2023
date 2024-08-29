package PARA;

import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class Divsao_3_7 {
    
    public static void main(String[] args) {
        
        float soma = 0;
        float numero;

        for (int i = 1; i <= 5; i++) {
            String input = JOptionPane.showInputDialog(null, "Digite o " + i + "º número:");
            numero = Float.parseFloat(input);

            if (numero % 3 == 0 && numero % 7 == 0) {
                soma += numero;
            }
        }

        JOptionPane.showMessageDialog(null, "A soma dos números divisíveis por 3 e 7 ao mesmo tempo é: " + soma);
    }
}

