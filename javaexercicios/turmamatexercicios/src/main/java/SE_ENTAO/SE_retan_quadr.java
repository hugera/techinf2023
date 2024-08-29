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
public class SE_retan_quadr {
    public static void main(String[] args) {
        // Entrada da base do retângulo
        String inputBase = JOptionPane.showInputDialog("Digite o valor da base do retângulo: ");
        float base = Float.parseFloat(inputBase);
        
        // Entrada da altura do retângulo
        String inputAltura = JOptionPane.showInputDialog("Digite o valor da altura do retângulo: ");
        float altura = Float.parseFloat(inputAltura);

        // Verificação se o retângulo é também um quadrado
        if (base == altura) {
            JOptionPane.showMessageDialog(null, "O retângulo é também um quadrado.");
        } else {
            JOptionPane.showMessageDialog(null, "O retângulo não é um quadrado.");
        }
    }
} 

