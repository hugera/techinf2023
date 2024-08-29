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
public class Tabuad_3 {
    public static void main(String[] args) {
       
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número para ver sua tabuada:"));
        int i = 1;

        String tabuadaM = "";
        String tabuadaA = "";
        String tabuadaS = "";
        String tabuadaDiv = "";
        // Imprime a tabuada usando um loop while
        while (i <= 10) {
            
            int resultado = numero * i;
            int resultadoA = numero + i;
            int resultadoAS = numero - i;
            float resultadoDiv = numero/i;
            tabuadaM += numero + " x " + i + " = " + resultado + "\n";
            tabuadaA += numero + " + " + i + " = " + resultadoA + "\n";
            tabuadaS += numero + " - " + i + " = " + resultadoAS + "\n";
            tabuadaDiv += numero + " / " + i + " = " + resultadoDiv + "\n";
            i++;
        }
       
        JOptionPane.showMessageDialog(null, "Tabuada de Mutiplicação " + numero + ":\n" + tabuadaM);
        JOptionPane.showMessageDialog(null, "Tabuada de Adição " + numero + ":\n" + tabuadaA);
        JOptionPane.showMessageDialog(null, "Tabuada de Subtração " + numero + ":\n" + tabuadaS);
        JOptionPane.showMessageDialog(null, "Tabuada de Divisão " + numero + ":\n" + tabuadaDiv);   
        
    }
}


