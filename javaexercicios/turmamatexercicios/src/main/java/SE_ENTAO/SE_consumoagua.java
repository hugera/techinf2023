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
public class SE_consumoagua {
   public static void main(String[] args) {
        // Entrada do consumo médio em metros cúbicos
        float consumoMedio = Float.parseFloat(JOptionPane.showInputDialog("Digite o consumo médio em metros cúbicos: "));
        
        // Entrada do tipo de cliente
        String tipoCliente = JOptionPane.showInputDialog("Digite o tipo de cliente (C para comercial ou R para residencial): ").toUpperCase();
        
        // Cálculo do valor da conta de água
        float valorConta = 0;
        if (tipoCliente.equals("C")) {
            valorConta = consumoMedio * 2.84f;
        } else if (tipoCliente.equals("R")) {
            valorConta = consumoMedio * 2.68f;
        }
        
        // Exibição do valor da conta de água
        JOptionPane.showMessageDialog(null, "O valor da conta de água é: R$" + valorConta);
    }
} 

