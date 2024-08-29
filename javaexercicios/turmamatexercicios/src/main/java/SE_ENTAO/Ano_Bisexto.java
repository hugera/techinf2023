/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SE_ENTAO;

import javax.swing.JOptionPane;

/**Se um ano é divisível por 4, ele pode ser um ano bissexto.
   No entanto, anos que são divisíveis por 100 não são bissextos, a menos que também sejam divisíveis por 400.

* Se (ano % 4 == 0) && (ano % 100 != 0), então o ano é bissexto.
  Se (ano % 400 == 0), então o ano também é bissexto.

* O operador % retorna o resto da divisão entre dois números. Portanto, ano % 4 retorna
  o resto da divisão do ano por 4.
  Se o resto for zero (ou seja, ano % 4 == 0), isso significa que o ano é divisível por 4.
  No entanto, alguns anos que são divisíveis por 4 não são bissextos, 
  então precisamos verificar a segunda condição.
  A segunda condição, ano % 100 != 0, verifica se o ano não é divisível por 100. 
  Se for divisível por 100, mas não por 400, ele não é bissexto.
  Se o ano for divisível por 400 (ano % 400 == 0), então é bissexto, independentemente das outras condições.
 
* 
 *
 * @author hugao
 */
public class Ano_Bisexto {
    public static void main(String[] args) {
        
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:"));
               
        // Verifica se o ano é bissexto
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            JOptionPane.showMessageDialog(null, "O ano " + ano + " é bissexto.");
        } else {
            JOptionPane.showMessageDialog(null, "O ano " + ano + " não é bissexto.");
        }
    } 
}
