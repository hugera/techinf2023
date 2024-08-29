/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ENQUANTO;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class Numeros_Prim {
     public static void main(String[] args) {
        
        float num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número: "));
        float num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número: "));
        
        String mensagem = "Números primos entre " + num1 + " e " + num2 + ":\n";
               
        float num = num1;
        
        // Laço
        
        while (num <= num2) {
            
// Saber se o numero é primo
           
            boolean primo = true;
            if (num <= 1) {
                primo = false;
            } else {
                for (double i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        primo = false;
                        break;
                    }
                }
            }
            
            // Se num for primo, mostre na mensagem
            if (primo) {
                mensagem += (int)num + " ";
            }
            
            // Incremento pra verificar o próximo
            
            num++;
        }
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
