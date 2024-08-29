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
public class EXE10 {
     public static void main(String[] args) {
        // Solicita ao usuário que insira a massa em quilogramas
        String inputMassa = JOptionPane.showInputDialog("Digite a massa em quilogramas:");
        double massa = Double.parseDouble(inputMassa);

        // Solicita ao usuário que insira a altura em metros
        String inputAltura = JOptionPane.showInputDialog("Digite a altura em metros:");
        double altura = Double.parseDouble(inputAltura);

        // Calcula o IMC
        double imc = massa / (altura * altura);

        // Exibe o IMC
        JOptionPane.showMessageDialog(null, "O IMC é: " + imc);
    }
}

