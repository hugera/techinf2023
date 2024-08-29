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
public class SE_Salario_Ajustado {
    public static void main(String[] args) {
        // Declaração das variáveis
        String nome;
        int matricula;
        float salarioAtual, salarioReajustado;
        
        // Entrada de dados
        nome = JOptionPane.showInputDialog("Digite o nome do funcionário:");
        matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula do funcionário:"));
        salarioAtual = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário atual do funcionário:"));
        
        // Cálculo do salário reajustado
        if (salarioAtual <= 950.00) {
            salarioReajustado = salarioAtual + (salarioAtual * 0.25f); // Reajuste de 25%
        } else {
            salarioReajustado = salarioAtual + (salarioAtual * 0.10f); // Reajuste de 10%
        }
        
        // Exibição dos resultados
        JOptionPane.showMessageDialog(null, 
            "Nome: " + nome + "\n" +
            "Matrícula: " + matricula + "\n" +
            "Salário não ajustado: R$ " + salarioAtual + "\n" +
            "Salário ajustado: R$ " + salarioReajustado
        );
    }
}

