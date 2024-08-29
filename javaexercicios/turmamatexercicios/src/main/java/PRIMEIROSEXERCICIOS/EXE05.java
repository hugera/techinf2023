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
public class EXE05 {
    public static void main(String[] args) {
        // Solicita ao usuário que insira o saldo anterior e o reajuste percentual
        String inputSaldoAnterior = JOptionPane.showInputDialog("Digite o saldo anterior:");
        String inputReajuste = JOptionPane.showInputDialog("Digite o reajuste percentual (%):");

        // Converte as entradas do usuário para double
        double saldoAnterior = Double.parseDouble(inputSaldoAnterior);
        double reajuste = Double.parseDouble(inputReajuste) / 100; // Convertendo para proporção

        // Calcula o novo saldo com o reajuste
        double novoSaldo = saldoAnterior * (1 + reajuste);

        // Exibe o saldo anterior e o novo saldo
        JOptionPane.showMessageDialog(null, 
            "Saldo anterior: R$ " + saldoAnterior + "\n" +
            "Reajuste percentual: " + inputReajuste + "%\n" +
            "Novo saldo: R$ " + novoSaldo);
    }
}
