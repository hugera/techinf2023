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
public class EXE06 {
    public static void main(String[] args) {
        // Solicita ao usuário que insira a base e a altura do retângulo
        String inputBase = JOptionPane.showInputDialog("Digite a base do retângulo:");
        double base = Double.parseDouble(inputBase);

        String inputAltura = JOptionPane.showInputDialog("Digite a altura do retângulo:");
        double altura = Double.parseDouble(inputAltura);

        // Calcula o perímetro do retângulo
        double perimetro = 2 * (base + altura);

        // Calcula a área do retângulo
        double area = base * altura;

        // Calcula a diagonal do retângulo usando o teorema de Pitágoras
        double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

        // Monta a mensagem com as propriedades do retângulo
        String mensagem = """
                          Propriedades do ret\u00e2ngulo:
                          a - Per\u00edmetro: """ + perimetro + "\n" +
                           "b - Área: " + area + "\n" +
                           "c - Diagonal: " + diagonal;

        // Exibe a mensagem com as propriedades do retângulo
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

