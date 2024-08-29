/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRIMEIROSEXERCICIOS;

import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class livro_ {
        public static void main (String [] args){
         
            String nome = JOptionPane.showInputDialog ("Informe o nome: ");
            String nomelivro = JOptionPane.showInputDialog ("Informe o nome livro: ");
            String autor = JOptionPane.showInputDialog ("Informe o autor: ");
            String dataemprestimo = JOptionPane.showInputDialog ("Informe a data emprestimo: ");
            String datadevolucao = JOptionPane.showInputDialog ("Informe a data devolucao: ");

            JOptionPane.showMessageDialog (null,"nome: "+nome+ "\nnomelivro: "+nomelivro+ "\nautor: "+
                    autor+ "\ndataemprestimo: "+dataemprestimo+" \ndatadevolucao: "+datadevolucao);
                    
                    
                    }
}
