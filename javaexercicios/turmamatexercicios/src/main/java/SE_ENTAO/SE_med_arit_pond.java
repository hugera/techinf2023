/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SE_ENTAO;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class SE_med_arit_pond {
     public static void main(String[] args) {
        // Entrada dos valores
        float valor1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        float valor2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor: "));
        
        // Escolha do tipo de média
        String[] opcoes = {"Média Aritmética", "Média Ponderada (30% / 70%)"};
        int escolhaMedia = JOptionPane.showOptionDialog(null, "Escolha o tipo de média a ser calculada:", "Tipo de Média", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        
        // Cálculo da média
        float media;
        if (escolhaMedia == 0) {
            // Média Aritmética
            media = (valor1 + valor2) / 2;
        } else {
            // Média Ponderada (30% / 70%)
            media = (0.3f * valor1) + (0.7f * valor2);
        }
        
        // Exibição da média
        JOptionPane.showMessageDialog(null, "A média calculada é: " + media);
    }
}
