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
public class Media_Pond {

    public static void main(String[] args) {
        float nota1, nota2, nota3, nota4, media;
        float opcao;
        
        do {
            nota1 = Float.parseFloat(JOptionPane.showInputDialog("Escreva a primeira nota: "));
            nota2 = Float.parseFloat(JOptionPane.showInputDialog("Escreva a segunda nota: "));
            nota3 = Float.parseFloat(JOptionPane.showInputDialog("Escreva a terceira nota: "));
            nota4 = Float.parseFloat(JOptionPane.showInputDialog("Escreva a quarta nota: "));
            
            media = (nota1*1 + nota2*2 + nota3*3 + nota4*4) / (1 + 2 + 3 + 4);
            
            JOptionPane.showMessageDialog(null, "Todas as notas: " + nota1 + ", " + nota2 + ", " + nota3 + ", " + nota4 + "\n"
                                               + "Média ponderada: " + media);
            
            opcao = Float.parseFloat(JOptionPane.showInputDialog("Digite 1 para continuar e Digite 0 para sair: "));
            
        } while (opcao != 0);
    }
}


