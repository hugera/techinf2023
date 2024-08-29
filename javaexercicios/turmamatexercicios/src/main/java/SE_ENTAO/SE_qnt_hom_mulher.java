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
public class SE_qnt_hom_mulher {
   public static void main(String[] args) {
        // Entrada da quantidade de homens e mulheres
        int quantHomens = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de homens que compareceram na festa: "));
        int quantMulheres = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de mulheres que compareceram na festa: "));
        
        // Cálculo do total de pessoas e dos percentuais de homens e mulheres
        int totalPessoas = quantHomens + quantMulheres;
        float percentHomens = (quantHomens * 100.0f) / totalPessoas;
        float percentMulheres = (quantMulheres * 100.0f) / totalPessoas;
        
        // Verificação se houve mais homens ou mais mulheres na festa
        String mensagem = "";
        if (quantHomens > quantMulheres) {
            mensagem = "Houve mais homens na festa.";
        } else if (quantMulheres > quantHomens) {
            mensagem = "Houve mais mulheres na festa.";
        }
        
        // Exibição dos resultados
        JOptionPane.showMessageDialog(null, mensagem + "\nPercentual de homens: " + percentHomens + "%\nPercentual de mulheres: " + percentMulheres + "%");
    }
} 

