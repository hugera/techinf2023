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
public class EXE010705 {
   public static void main(String[] args) {
        // Solicita ao usuário para inserir o primeiro número
        String input1 = JOptionPane.showInputDialog("Digite o primeiro número inteiro:");
        int numero1 = Integer.parseInt(input1);

        // Solicita ao usuário para inserir o segundo número
        String input2 = JOptionPane.showInputDialog("Digite o segundo número inteiro:");
        int numero2 = Integer.parseInt(input2);

        // Mostra os números antes da troca
        JOptionPane.showMessageDialog(null, "Números antes da troca:\nNúmero 1: " + numero1 + "\nNúmero 2: " + numero2);

        // Troca os valores dos números
        int temp = numero1;
        numero1 = numero2;
        numero2 = temp;

        // Mostra os números depois da troca
        JOptionPane.showMessageDialog(null, "Números depois da troca:\nNúmero 1: " + numero1 + "\nNúmero 2: " + numero2);
    }
} 

