/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ENQUANTO;

import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class Num_MEDIA {
    
    public static void main(String[] args) {
        int quantidadeNumeros = 0;
        float soma = 0;
       
        String input = JOptionPane.showInputDialog("Digite um número (ou deixe em branco para encerrar):");

        // Loop para solicitar os números até que o usuário deixe em branco
        while (!input.equals("")) {
            float numero = Float.parseFloat(input);
            soma += numero;
            quantidadeNumeros++;
           
            input = JOptionPane.showInputDialog("Digite um número (ou deixe em branco para encerrar):");
        }
        
        float media = quantidadeNumeros > 0 ? soma / quantidadeNumeros : 0;

        // Exibe o resultado em uma caixa de diálogo JOptionPane
        JOptionPane.showMessageDialog(null, "A média dos números é: " + media);
    }
}

