/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SE_ENTAO;

import javax.swing.JOptionPane;

/** equals() é um método em Java que é usado para comparar duas strings 
 * quanto ao conteúdo, ou seja, se as duas strings têm exatamente os mesmos caracteres na mesma ordem. 
 * Ele retorna verdadeiro se as strings forem iguais e falso caso contrário.
 *
 * @author hugao
 */
public class SE_medPouA_exe2 {
    public static void main(String[] args) {
        // Entrada dos valores e do tipo de média
        float valor1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        float valor2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor: "));
        String tipoMedia = JOptionPane.showInputDialog("Escolha o tipo de média a ser calculada (A para aritmética ou P para ponderada): ").toUpperCase();
        
        // Cálculo da média
        float media = 0;
        if (tipoMedia.equals("A")) {
            // Média Aritmética
            media = (valor1 + valor2) / 2;
        } else if (tipoMedia.equals("P")) {
            // Média Ponderada
            media = (valor1 * 0.3f + valor2 * 0.7f);
        }
        
        // Exibição da média
        JOptionPane.showMessageDialog(null, "A média é: " + media);
    }
} 

