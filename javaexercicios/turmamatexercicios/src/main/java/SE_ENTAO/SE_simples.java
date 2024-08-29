/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SE_ENTAO;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class SE_simples {
     public static void main(String[] args) {
        String Nome="",Status="";
        float Media=0.00f,N1=0f,N2=0f;
        
        Nome = JOptionPane.showInputDialog("Informe o nome:");
        N1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira Nota:"));
        N2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda Nota:"));
        
       Media = (N1+N2)/2;
       
       if(Media>=7){
           Status = "Aprovado";
       }
        
       JOptionPane.showMessageDialog(null,"O nome: "+Nome+"\nNota 1 = "+N1+
               " Nota 2 = "+N2+"\nMédia = "+Media+" com Status = "+Status);
       
    }
 
    
    
    
}


