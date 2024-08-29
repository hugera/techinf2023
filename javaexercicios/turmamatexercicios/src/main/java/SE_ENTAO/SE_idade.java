/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SE_ENTAO;

import javax.swing.JOptionPane;

/**A variável input, do tipo String, é responsável por armazenar a 
 * entrada fornecida pelo usuário através da caixa de diálogo JOptionPane
 *
 * @author hugao
 */
public class SE_idade {
    public static void main(String[] args) {
        // Entrada da idade
        String input = JOptionPane.showInputDialog("Informe a idade: ");
        
        // Conversão da entrada para float
        float idade = Float.parseFloat(input);
        
        // Verificação se a idade é maior ou igual a 18
        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "A pessoa é maior de idade.");
        } else {
            JOptionPane.showMessageDialog(null, "A pessoa não é maior de idade.");
        }
    }
}

