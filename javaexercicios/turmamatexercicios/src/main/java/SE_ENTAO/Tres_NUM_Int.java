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
public class Tres_NUM_Int {
   public static void main(String[] args) {
      
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));
        
        int maior = num1;

        // Verifica se o segundo número é maior que o atual
        if (num2 > maior) {
            maior = num2;
        }

        // Verifica se o terceiro número é maior que o atual
        if (num3 > maior) {
            maior = num3;
        }

        JOptionPane.showMessageDialog(null, "O maior número é: " + maior);
    }
} 

