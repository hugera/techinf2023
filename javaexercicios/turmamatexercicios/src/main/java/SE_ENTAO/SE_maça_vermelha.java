/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SE_ENTAO;

import javax.swing.JOptionPane;

/**equalsIgnoreCase é um método em Java que é usado para comparar duas strings, 
 * ignorando as diferenças entre maiúsculas e minúsculas. Isso significa que se 
 * as duas strings tiverem os mesmos caracteres, independentemente de estarem em maiúsculas ou minúsculas, 
 * o método retornará verdadeiro. 
 *
 * @author hugao
 */
public class SE_maça_vermelha {
    public static void main(String[] args) {
        // Entrada da cor e da fruta
        String cor = JOptionPane.showInputDialog("Digite a cor: ");
        String fruta = JOptionPane.showInputDialog("Digite a fruta: ");
        
        // Verificação se a cor é vermelha e a fruta é maçã
        if (cor.equalsIgnoreCase("Vermelha") && fruta.equalsIgnoreCase("Maçã")) {
            JOptionPane.showMessageDialog(null, "A cor é vermelha e a fruta é maçã.");
        } else {
            JOptionPane.showMessageDialog(null, "As condições não foram atendidas.");
        }
    } 
}
