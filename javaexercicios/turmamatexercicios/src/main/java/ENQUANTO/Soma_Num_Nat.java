/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ENQUANTO;

import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class Soma_Num_Nat {
    public static void main(String[] args){
        
          
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N:"));
        float soma = 0;
        int i = 1;

        while (i <= n) {
            soma += i;
            i++;
        }

        JOptionPane.showMessageDialog(null, "A soma dos primeiros " + n + " números naturais é: " + soma);
    }
}
              
                
        
                
    
    
  
    
    
            


