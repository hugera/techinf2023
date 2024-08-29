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
public class SE_palindromo {
   public static void main(String[] args) {
        // Entrada do número de 5 dígitos
        String input = JOptionPane.showInputDialog("Digite um número de 5 dígitos: ");
        
        // Conversão da entrada para float
        float num = Float.parseFloat(input);
        
        // Extrai os dígitos do número
        int d1 = (int)(num / 10000); // Extrai o primeiro dígito
        int d2 = (int)((num % 10000) / 1000); // Extrai o segundo dígito
        int d3 = (int)((num % 1000) / 100);
        int d4 = (int)((num % 100) / 10); // Extrai o quarto dígito
        int d5 = (int)(num % 10); // Extrai o quinto dígito

        // Verifica se o número é um palíndromo
        if ((d1 == d5) && (d2 == d4)) {
            JOptionPane.showMessageDialog(null, "O número é um palíndromo.");
        } else {
            JOptionPane.showMessageDialog(null, "O número não é um palíndromo.");
        }
    }
} 

