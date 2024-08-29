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
public class Apr_Reprv_Recu {
    public static void main(String[] args) {
       
        float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da primeira prova:"));
        float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da segunda prova:"));

      
        float media = (nota1 + nota2) / 2;

        
        if (media >= 7.0) {
            JOptionPane.showMessageDialog(null, "Parabéns! Você foi aprovado com média " + media);
        } else if (media >= 5.0) {
            JOptionPane.showMessageDialog(null, "Você está em recuperação com média " + media);
        } else {
            JOptionPane.showMessageDialog(null, "Infelizmente você foi reprovado com média " + media);
        }
    }
} 

