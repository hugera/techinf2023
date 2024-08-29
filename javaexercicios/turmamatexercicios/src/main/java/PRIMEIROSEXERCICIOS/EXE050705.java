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
public class EXE050705 {
    public static void main (String [] args) {
       
    String contrato = JOptionPane.showInputDialog ("Informe o n° contrato: ") ;
    float numreserva = Float.parseFloat(JOptionPane.showInputDialog ("Informe o numreserva:" )) ;
    String passageiro = JOptionPane.showInputDialog ("Digite Nome Passageiro: ") ;
    String ciaaerea = JOptionPane.showInputDialog ("Informe o nome Ciaaerea: ") ;
    float totalcompra = Float.parseFloat(JOptionPane.showInputDialog ("Informe o Valor Total Compra: ")) ;
   
   JOptionPane.showMessageDialog (null,"contrato: "+contrato+"\nnumreserva"+numreserva+"\npassageiro"+passageiro
           +"\nciaaerea"+ciaaerea+"\ntotalcompra"+totalcompra);
           
  
    }
}
