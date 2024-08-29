/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CASO;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class Descriçao_Produ {
    public static void main(String[] args) {
        
        int codigoProduto = Integer.parseInt(JOptionPane.showInputDialog("Insira o código do produto (de 1 a 5):"));
       
        String descricaoProduto;

        switch (codigoProduto) {
            case 1:
                descricaoProduto = "Produto A";
                break;
            case 2:
                descricaoProduto = "Produto B";
                break;
            case 3:
                descricaoProduto = "Produto C";
                break;
            case 4:
                descricaoProduto = "Produto D";
                break;
            case 5:
                descricaoProduto = "Produto E";
                break;
            default:
                descricaoProduto = "Código de produto inválido!";
                break;
        }
     
        JOptionPane.showMessageDialog(null, "A descrição do produto com código " + codigoProduto + " é: " + descricaoProduto);
    }
}

