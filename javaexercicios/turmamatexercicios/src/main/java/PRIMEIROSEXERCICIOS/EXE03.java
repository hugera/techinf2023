/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRIMEIROSEXERCICIOS;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class EXE03 {
    public static void main(String[] args) {
        // Solicita ao usuário que insira um número
        String input = JOptionPane.showInputDialog("Digite um número:");

        // Converte a entrada do usuário para double
        double numero = Double.parseDouble(input);
        
        // Calcula a terça parte do número
        double tercaParte = numero / 3;

        // Exibe o número inserido e sua terça parte
        JOptionPane.showMessageDialog(null, 
            "Número inserido: " + numero + "\n" +
            "Terça parte: " + tercaParte);
    }
}

