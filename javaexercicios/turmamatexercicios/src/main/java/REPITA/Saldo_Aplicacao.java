/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package REPITA;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class Saldo_Aplicacao {

    public static void main(String[] args) {
        float opcao, saldoAplicacao, saldoAnterior = 0, saldoAtualizado;
        
        do {
            saldoAplicacao = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da aplicação: "));
            
            saldoAtualizado = saldoAplicacao + saldoAnterior;
            
            JOptionPane.showMessageDialog(null, "O saldo anterior antes da atualização: " + saldoAnterior + "\n"
                                                + "O valor da aplicação: " + saldoAplicacao + "\n"
                                                + "O valor atualizado: " + saldoAtualizado);
            
            saldoAnterior = saldoAtualizado;
            
            opcao = Float.parseFloat(JOptionPane.showInputDialog("""
                                                                 [0] SAIR
                                                                 [1] CONTINUAR
                                                                 Informe a opcão : """));
            
        } while (opcao != 0);
    }
}


