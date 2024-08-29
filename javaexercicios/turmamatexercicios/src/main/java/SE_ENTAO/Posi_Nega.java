/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SE_ENTAO;

import javax.swing.JOptionPane;

/**Input" indica que esses caracteres são fornecidos como entrada para o programa Java
 *
 * @author hugao
 */
public class Posi_Nega {
     public static void main(String[] args) {
        // Declaração da variável
        double numero;
        
        // Entrada do número
        String input = JOptionPane.showInputDialog("Informe um número: ");
        numero = Double.parseDouble(input);
        
        // Verificação se o número é positivo ou negativo
        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "O número inserido é positivo.");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "O número inserido é negativo.");
        } else {
            JOptionPane.showMessageDialog(null, "O número inserido é zero.");
        }
    }
}

