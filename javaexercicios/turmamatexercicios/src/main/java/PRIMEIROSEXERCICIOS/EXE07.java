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
public class EXE07 {
    public static void main(String[] args) {
        // Solicita ao usuário que insira o raio da lata de óleo
        String inputRaio = JOptionPane.showInputDialog("Digite o raio da lata de óleo:");
        double raio = Double.parseDouble(inputRaio);

        // Solicita ao usuário que insira a altura da lata de óleo
        String inputAltura = JOptionPane.showInputDialog("Digite a altura da lata de óleo:");
        double altura = Double.parseDouble(inputAltura);

        // Calcula o volume da lata de óleo usando a fórmula
        double volume = 3.14159 * Math.pow(raio, 2) * altura;

        // Exibe o volume da lata de óleo
        JOptionPane.showMessageDialog(null, "O volume da lata de óleo é: " + volume);
    }
}


