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
public class EXE01 {
    public static void main(String[] args) {
        int numero, antecessor, sucessor;
        char opcao;

        do {
            // Solicita ao usuário que insira um número
            String input = JOptionPane.showInputDialog("Digite um número inteiro:");
            numero = Integer.parseInt(input);
            
            // Calcula o antecessor e o sucessor do número
            antecessor = numero - 1;
            sucessor = numero + 1;

            // Exibe o número inserido, seu antecessor e seu sucessor
            JOptionPane.showMessageDialog(null, 
                "Número inserido: " + numero + "\n" +
                "Antecessor: " + antecessor + "\n" +
                "Sucessor: " + sucessor);

            // Pergunta ao usuário se deseja continuar
            opcao = JOptionPane.showInputDialog("Deseja continuar? (S/N)").toUpperCase().charAt(0);

        } while (opcao == 'S');

        // Se o usuário não quiser continuar, o loop termina
    }

}
