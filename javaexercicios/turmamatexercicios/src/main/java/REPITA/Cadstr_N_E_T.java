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
public class Cadstr_N_E_T {
    

    public static void main(String[] args) {
        String nome, endereco, telefone;
        
        
       float opcao;
        
        do {
            JOptionPane.showMessageDialog(null, "--------CADASTRO--------\n");
            nome = JOptionPane.showInputDialog("Informe o nome: ");
            endereco = JOptionPane.showInputDialog("Informe o endereco: ");
            telefone = JOptionPane.showInputDialog("Informe o telefone: ");
    
            opcao = Float.parseFloat(JOptionPane.showInputDialog("Digite 1 para continuar e Digite 0 para sair"));

        } while (opcao != 0);
    }
}


