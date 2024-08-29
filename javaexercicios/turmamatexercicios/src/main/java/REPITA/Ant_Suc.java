/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package REPITA;

import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class Ant_Suc {
        public static void main(String[] args) {
        int numero, antecessor, sucessor, opcao;
        
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Numero: "));
            antecessor = numero - 1;
            sucessor = numero + 1;
            
            JOptionPane.showMessageDialog(null, "Numero inserido: " + numero + "\nAntecessor: " + antecessor + "\nSucessor: " + sucessor);
            
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para continuar e Digite 0 para sair: "));
        } while (opcao != 0);
    }
}

