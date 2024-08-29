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
public class EXE09 {
    public static void main(String[] args) {
        // Solicita ao usuário que insira a base do triângulo
        String inputBase = JOptionPane.showInputDialog("Digite a base do triângulo:");
        double base = Double.parseDouble(inputBase);

        // Solicita ao usuário que insira a altura do triângulo
        String inputAltura = JOptionPane.showInputDialog("Digite a altura do triângulo:");
        double altura = Double.parseDouble(inputAltura);

        // Calcula a área do triângulo
        double area = (base * altura) / 2;

        // Exibe a área do triângulo
        JOptionPane.showMessageDialog(null, "A área do triângulo é: " + area);
    }
}

