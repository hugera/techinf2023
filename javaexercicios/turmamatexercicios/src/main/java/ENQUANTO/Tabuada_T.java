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
public class Tabuada_T {
   
    public static void main(String[] args) {
       
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número para ver sua tabuada:"));
        int i = 1;

        String tabuada = "";

        // Imprime a tabuada usando um loop while
        while (i <= 10) {
            
            int resultado = numero * i;
            tabuada += numero + " x " + i + " = " + resultado + "\n";
            i++;
        }
       
        JOptionPane.showMessageDialog(null, "Tabuada de " + numero + ":\n" + tabuada);
    }
}

