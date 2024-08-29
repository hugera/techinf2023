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
public class SE_vlrfinalproduto {
    public static void main(String[] args) {
        // Entrada do valor do produto
        float valorProduto = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do produto: "));
        
        // Entrada da condição de pagamento
        String condicaoPagamento = JOptionPane.showInputDialog("Digite a condição de pagamento (V para à vista ou P para a prazo): ").toUpperCase();
        
        // Cálculo do valor final do produto
        float valorFinal = 0;
        if (condicaoPagamento.equals("V")) {
            // À vista com 10% de desconto
            valorFinal = valorProduto * 0.9f;
        } else if (condicaoPagamento.equals("P")) {
            // A prazo com 15% de juros
            valorFinal = valorProduto * 1.15f;
        }
        
        // Exibição do valor final do produto
        JOptionPane.showMessageDialog(null, "O valor final do produto é: R$" + valorFinal);
    }
}
