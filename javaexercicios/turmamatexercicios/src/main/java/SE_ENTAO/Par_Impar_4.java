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
public class Par_Impar_4 {
    public static void main(String[] args) {
       
        float numero = Float.parseFloat(JOptionPane.showInputDialog("Digite um número:"));

        // Verifica se o número é par ou ímpar
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número é par.");

            // Verifica se o número é divisível por 4
            if (numero % 4 == 0) {
                JOptionPane.showMessageDialog(null, "O número é divisível por 4.");
            } else {
                JOptionPane.showMessageDialog(null, "O número não é divisível por 4.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "O número é ímpar.");
        }
    }
}

