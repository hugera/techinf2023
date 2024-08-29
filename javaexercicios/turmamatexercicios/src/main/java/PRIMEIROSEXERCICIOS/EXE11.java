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
public class EXE11 {
     public static void main(String[] args) {
        // Solicita ao usuário que insira os dados do professor
        String nome = JOptionPane.showInputDialog("Nome:");
        String endereco = JOptionPane.showInputDialog("Endereço:");
        String cidade = JOptionPane.showInputDialog("Cidade:");
        String uf = JOptionPane.showInputDialog("UF:");
        String cep = JOptionPane.showInputDialog("CEP:");
        String telefone = JOptionPane.showInputDialog("Telefone:");
        String cpf = JOptionPane.showInputDialog("CPF:");
        String rg = JOptionPane.showInputDialog("Carteira de Identidade:");
        String dataNascimento = JOptionPane.showInputDialog("Data de Nascimento (dd/mm/aaaa):");
        String grauEscolaridade = JOptionPane.showInputDialog("Grau de Escolaridade:");
        String curso = JOptionPane.showInputDialog("Curso que leciona:");

        // Monta a mensagem com os dados do professor
        String mensagem = """
                          Cadastro do Professor:
                          Nome: """ + nome + "\n" +
                           "Endereço: " + endereco + "\n" +
                           "Cidade: " + cidade + "\n" +
                           "UF: " + uf + "\n" +
                           "CEP: " + cep + "\n" +
                           "Telefone: " + telefone + "\n" +
                           "CPF: " + cpf + "\n" +
                           "Carteira de Identidade: " + rg + "\n" +
                           "Data de Nascimento: " + dataNascimento + "\n" +
                           "Grau de Escolaridade: " + grauEscolaridade + "\n" +
                           "Curso que leciona: " + curso;

        // Exibe os dados do professor
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

