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
public class Tipo_Triangulo {
  public static void main(String[] args) {
      
        float lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o tamanho do primeiro lado do triângulo:"));
        float lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o tamanho do segundo lado do triângulo:"));
        float lado3 = Float.parseFloat(JOptionPane.showInputDialog("Digite o tamanho do terceiro lado do triângulo:"));

        // Verifica se os lados formam um triângulo válido
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            // Verifica se o triângulo é equilátero (três lados iguais)
            if (lado1 == lado2 && lado1 == lado3) {
                JOptionPane.showMessageDialog(null, "O triângulo é equilátero.");
            }
            // Verifica se o triângulo é isósceles (dois lados iguais)
            else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                JOptionPane.showMessageDialog(null, "O triângulo é isósceles.");
            }
            // Se não for equilátero nem isósceles, é escaleno (todos os lados diferentes)
            else {
                JOptionPane.showMessageDialog(null, "O triângulo é escaleno.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Os tamanhos dos lados não formam um triângulo válido.");
        }
    }  
}
