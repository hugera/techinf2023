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
public class EXE02 {
     public static void main(String[] args) {
        // Declaração das variáveis
        String nome, endereco, telefone;

        // Solicita ao usuário que insira o nome, endereço e telefone
        nome = JOptionPane.showInputDialog("Digite seu nome:");
        endereco = JOptionPane.showInputDialog("Digite seu endereço:");
        telefone = JOptionPane.showInputDialog("Digite seu telefone:");

        // Exibe os dados inseridos pelo usuário
        JOptionPane.showMessageDialog(null, 
            "Nome: " + nome + "\n" +
            "Endereço: " + endereco + "\n" +
            "Telefone: " + telefone);
    }
}


