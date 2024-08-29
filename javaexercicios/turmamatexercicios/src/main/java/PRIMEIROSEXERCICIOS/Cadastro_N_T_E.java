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
public class Cadastro_N_T_E {
   public static void main(String[] args) {
        String Nome="";
        String Endereco="";
        String Telefone ="";
        
        Nome  =  JOptionPane.showInputDialog("Informe o nome: ");
        Endereco = JOptionPane.showInputDialog("Informar o Endereço: ");
        Telefone = JOptionPane.showInputDialog("Informe o Telefone: ");
       
        JOptionPane.showMessageDialog(null,"Nome: "+Nome+"\nEndereço: "+Endereco+
                "\nTelefone: "+Telefone);
    }
    
} 

