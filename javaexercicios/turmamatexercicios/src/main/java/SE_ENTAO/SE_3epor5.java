/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SE_ENTAO;

import javax.swing.JOptionPane;

/**"String input" refere-se a uma variável ou parâmetro que contém uma sequência
 * de caracteres inserida pelo usuário ou obtida de outra fonte de entrada, como um arquivo. 
 * Input" indica que esses caracteres são fornecidos como entrada para o programa Java
 *
 * @author hugao
 */
public class SE_3epor5 {
   public static void main(String[] args) {
        // Entrada do número
        String input = JOptionPane.showInputDialog("Digite um número: ");
        float numero = Float.parseFloat(input);
        
        // Verificação se o número é divisível por 3 e por 5 ao mesmo tempo
        if (numero % 15 == 0) {
            JOptionPane.showMessageDialog(null, "O número é divisível por 3 e 5 ao mesmo tempo.");
        } else {
            JOptionPane.showMessageDialog(null, "O número não é divisível por 3 e 5 ao mesmo tempo.");
        }
    }
} 

