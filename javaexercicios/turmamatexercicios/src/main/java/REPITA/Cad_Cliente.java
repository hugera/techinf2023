/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package REPITA;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class Cad_Cliente {
 
    public static void main(String[] args) {
        
        int opcao, idade = 0;
        String nome = "";
        
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                 Menu de Clientes 
                                                                 
                                                                 1 - Cadastrar o Cliente
                                                                 2 - Mostrar o Cliente
                                                                 3 - Excluir o Cliente
                                                                 0 - Sair
                                                                 
                                                                 Informe a opção: """));
            
            switch (opcao) {
                case 1:
                    nome = JOptionPane.showInputDialog("Informe o Nome: ");
                    idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a Idade: "));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "O nome: " + nome + "\nIdade: " + idade);
                    break;
                case 3:
                    nome = "";
                    idade = 0;
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Estou saindo kkkk");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção não existe no menu, informe a opção correta");
                    break;
            }
        } while (opcao != 0);
    }
}
 

