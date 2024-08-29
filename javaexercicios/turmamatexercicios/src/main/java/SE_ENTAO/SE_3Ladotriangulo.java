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
public class SE_3Ladotriangulo {
    public static void main(String[] args) {
        // Entrada dos valores
        float lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do primeiro lado do triângulo: "));
        float lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do segundo lado do triângulo: "));
        float lado3 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do terceiro lado do triângulo: "));
        
        // Verificação se é possível formar um triângulo
        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            JOptionPane.showMessageDialog(null, "É possível formar um triângulo com os valores fornecidos.");
        } else {
            JOptionPane.showMessageDialog(null, "Não é possível formar um triângulo com os valores fornecidos.");
        }
    }
}

