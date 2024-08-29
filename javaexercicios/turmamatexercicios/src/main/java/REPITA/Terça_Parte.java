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
public class Terça_Parte {
    public static void main(String[] args) {
        
        float num, tercaParte;
        float opcao;
        
        do {
            num = Float.parseFloat(JOptionPane.showInputDialog("Digite um número: "));
            
            tercaParte = num / 3;
            
            JOptionPane.showMessageDialog(null, "O número é: " + num + "\n"
                                                + "A terça parte do número é: " + tercaParte);
            
            opcao = Float.parseFloat(JOptionPane.showInputDialog("Digite 1 para continuar e 0 para sair: "));
            
        } while (opcao != 0);
    }
}

