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
public class EXE050705_fitavideo {
    
    public static void main (String[] args) {
        
        String nome = JOptionPane.showInputDialog ("Digite o nome: ") ;
        double cpf = Double.parseDouble(JOptionPane.showInputDialog ("Digite o CPF: ")) ;
        String endereco = JOptionPane.showInputDialog ("Digite o endereco: ") ;
        long telefone = Long.parseLong(JOptionPane.showInputDialog ("Digite o Telefone: ")) ;  
        String fitaalugada = JOptionPane.showInputDialog ("Informe a fita alugada: ") ;
        String tempoaluguel = JOptionPane.showInputDialog ("Informe o tempo de aluguel: " ) ;
        
        JOptionPane.showMessageDialog (null,"nome"+nome+"\ncpf: "+cpf+"\nendereco: "+endereco+
                "\ntelefone: "+telefone+"\nfitaalugada: "+
                fitaalugada+"\ntempoaluguel: "+tempoaluguel) ;
    }
}
