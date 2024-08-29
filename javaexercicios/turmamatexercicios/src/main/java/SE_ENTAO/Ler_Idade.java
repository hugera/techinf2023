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
public class Ler_Idade {
    public static void main(String[] args) {
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));

          if (idade >= 0 && idade <= 12) {
            JOptionPane.showMessageDialog(null, "Criança");
        } else if (idade >= 13 && idade <= 17) {
            JOptionPane.showMessageDialog(null, "Adolescente");
        } else if (idade >= 18 && idade <= 59) {
            JOptionPane.showMessageDialog(null, "Adulto");
        } else {
            JOptionPane.showMessageDialog(null, "Idoso");
        }
    }
}

