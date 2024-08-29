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
public class SE_vlrmaior_menor {
    public static void main(String[] args) {
        // Entrada dos valores
        float valor1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        float valor2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor: "));
        
        // Determinação do maior valor
        float maior;
        if (valor1 > valor2) {
            maior = valor1;
        } else {
            maior = valor2;
        }
        
        // Exibição do maior valor
        JOptionPane.showMessageDialog(null, "O maior valor é: " + maior);
    }
}

