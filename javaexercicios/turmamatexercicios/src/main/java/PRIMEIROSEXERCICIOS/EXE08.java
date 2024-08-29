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
public class EXE08 {
   public static void main(String[] args) {
        // Solicita ao usuário que insira o nome
        String nome = JOptionPane.showInputDialog("Digite seu nome:");

        // Solicita ao usuário que insira a idade
        String inputIdade = JOptionPane.showInputDialog("Digite sua idade:");
        int idade = Integer.parseInt(inputIdade);

        // Solicita ao usuário que insira o sexo
        String sexo = JOptionPane.showInputDialog("Digite seu sexo (M/F):");

        // Monta a mensagem com os dados pessoais
        String mensagem = "Nome: " + nome + "\n" +
                           "Idade: " + idade + " anos\n" +
                           "Sexo: " + sexo;

        // Exibe a mensagem com os dados pessoais
        JOptionPane.showMessageDialog(null, mensagem);
    }
} 

