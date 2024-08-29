/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SE_ENTAO;

import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class CAPITAL_Brasil {
    public static void main(String[] args) {
        
        String Capital = JOptionPane.showInputDialog("Informe o nome da capital do Brasil: ");
        
        
        if (Capital.equals("Brasília")){
            JOptionPane.showMessageDialog(null,"Acertou!");
        }else if (Capital.equals("brasília")){
            JOptionPane.showMessageDialog(null,"É com B maiúsculo, vamos ser formais.");
        }else if (Capital.equals("brasilia")){
            JOptionPane.showMessageDialog(null,"B maiúsculo e tem acento, ok?"); 
        }else if (Capital.equals("Brasil")){
            JOptionPane.showMessageDialog(null,"KKKKKKKK esse é o nome do país");
        }else{
            JOptionPane.showMessageDialog(null,"EU DESISTO!");
        }
    }
    
}


