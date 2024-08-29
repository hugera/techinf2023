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
public class Preço_Final {
    public static void main(String[] args) {
        // Lê o preço do produto diretamente da caixa de diálogo
        float preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o preço do produto:"));

        // Verifica se o preço é maior que R$ 100,00 para aplicar o desconto
        if (preco > 100.00) {
            // Calcula o valor do desconto
            float desconto = preco * 0.10f; // 10% de desconto

            // Calcula o preço final com desconto
            float precoFinal = preco - desconto;

            JOptionPane.showMessageDialog(null, "Preço final do produto com desconto: R$" + precoFinal);
        } else {
            JOptionPane.showMessageDialog(null, "Preço final do produto: R$" + preco);
        }
    }
}
