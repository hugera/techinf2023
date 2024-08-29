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
public class EX040705 {
      public static void main(String[] args) {
        // Declaração das variáveis
        float xBurguer, xFrango, xSalada, batata, sucos, refri, valorTotal;

        // Solicita a quantidade de cada item ao cliente
        xBurguer = Float.parseFloat(JOptionPane.showInputDialog("Digite quantos X-BURGUER você deseja:"));
        xFrango = Float.parseFloat(JOptionPane.showInputDialog("Digite quantos X-FRANGO você deseja:"));
        xSalada = Float.parseFloat(JOptionPane.showInputDialog("Digite quantos X-SALADA você deseja:"));
        batata = Float.parseFloat(JOptionPane.showInputDialog("Digite quantas BATATA FRITA você deseja:"));
        sucos = Float.parseFloat(JOptionPane.showInputDialog("Digite quantos SUCOS você deseja:"));
        refri = Float.parseFloat(JOptionPane.showInputDialog("Digite quantos REFRIGERANTES você deseja:"));

        // Cálculo do valor total
        valorTotal = (xBurguer * 2.50f) + (xFrango * 2.00f) + (xSalada * 1.50f) + (batata * 0.80f) + (sucos * 0.90f) + (refri * 1.20f);

        // Exibição do pedido e valor total
        JOptionPane.showMessageDialog(null, """
                                            ----- PEDIDOS -----
                                            
                                            X-Burguer: """ + xBurguer + "\n" +
                                            "X-Frango: " + xFrango + "\n" +
                                            "X-Salada: " + xSalada + "\n" +
                                            "Batata Frita: " + batata + "\n" +
                                            "Sucos: " + sucos + "\n" +
                                            "Refrigerantes: " + refri + "\n\n" +
                                            "----- VALOR TOTAL -----\n\n" +
                                            "O valor total a se pagar é de R$" + valorTotal);
    }
}

