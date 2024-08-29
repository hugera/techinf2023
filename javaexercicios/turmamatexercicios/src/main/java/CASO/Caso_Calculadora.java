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
public class Caso_Calculadora {
   public static void main(String[] args) {
        // Lê o número da operação diretamente da caixa de diálogo
        String operacaoString = JOptionPane.showInputDialog("Selecione a operação desejada:\n1. Adição\n2. Subtração\n3. Multiplicação\n4. Divisão");
     
        int operacao = Integer.parseInt(operacaoString);
      
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        // Variável para armazenar o resultado da operação
        double resultado = 0;

        // Usa o switch-case para determinar a operação e realizar o cálculo
        switch (operacao) {
            case 1:
                resultado = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "O resultado da adição é: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                JOptionPane.showMessageDialog(null, "O resultado da subtração é: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " + resultado);
                break;
            case 4:
                // Verifica se o segundo número não é zero antes de realizar a divisão
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + resultado);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro: Divisão por zero!");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                break;
        }
    }
} 

