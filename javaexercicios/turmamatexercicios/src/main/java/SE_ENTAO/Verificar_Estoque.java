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
public class Verificar_Estoque {
     public static void main(String[] args) {
        
        int codigoProduto = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto:"));
        int quantidadeEstoque = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade em estoque:"));

        // Verifica o nível de estoque
        if (quantidadeEstoque < 10) {
            JOptionPane.showMessageDialog(null, "Estoque baixo");
        } else if (quantidadeEstoque >= 10 && quantidadeEstoque <= 20) {
            JOptionPane.showMessageDialog(null, "Estoque médio");
        } else {
            JOptionPane.showMessageDialog(null, "Estoque alto");
        }
    }
}

