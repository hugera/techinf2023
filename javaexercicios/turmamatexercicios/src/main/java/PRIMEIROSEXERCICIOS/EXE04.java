/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRIMEIROSEXERCICIOS;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class EXE04 {
    public static void main(String[] args) {
        // Solicita ao usuário que insira os quatro números
        String input1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String input2 = JOptionPane.showInputDialog("Digite o segundo número:");
        String input3 = JOptionPane.showInputDialog("Digite o terceiro número:");
        String input4 = JOptionPane.showInputDialog("Digite o quarto número:");

        // Converte as entradas do usuário para double
        double numero1 = Double.parseDouble(input1);
        double numero2 = Double.parseDouble(input2);
        double numero3 = Double.parseDouble(input3);
        double numero4 = Double.parseDouble(input4);
        
        // Calcula a média ponderada
        double mediaPonderada = (numero1 * 1 + numero2 * 2 + numero3 * 3 + numero4 * 4) / (1 + 2 + 3 + 4);

        // Exibe os números informados e a média ponderada
        JOptionPane.showMessageDialog(null, 
            "Números informados: " + numero1 + ", " + numero2 + ", " + numero3 + ", " + numero4 + "\n" +
            "Média ponderada: " + mediaPonderada);
    }
}

