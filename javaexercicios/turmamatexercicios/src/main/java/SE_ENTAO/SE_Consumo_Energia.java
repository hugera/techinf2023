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
public class SE_Consumo_Energia {
    public static void main(String[] args) {
        // Entrada dos dados
        String nome = JOptionPane.showInputDialog("Digite o nome do usuário: ");
        int numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do usuário: "));
        float consumoKwh = Float.parseFloat(JOptionPane.showInputDialog("Digite o consumo em kWh: "));
        String tipoUsuario = JOptionPane.showInputDialog("Digite o tipo de usuário (R para residencial ou C para comercial): ").toUpperCase();
        
        // Cálculo do valor a ser pago
        float totalPagar = 0;
        if (tipoUsuario.equals("R")) {
            totalPagar = consumoKwh * 0.871f;
        } else if (tipoUsuario.equals("C")) {
            totalPagar = consumoKwh * 0.999f;
        }
        
        // Exibição dos resultados
        JOptionPane.showMessageDialog(null, 
            "Nome: " + nome + "\n" +
            "Número do usuário: " + numeroUsuario + "\n" +
            "Tipo de usuário: " + (tipoUsuario.equals("R") ? "Residencial" : "Comercial") + "\n" +
            "Consumo em kWh: " + consumoKwh + "\n" +
            "Valor a ser pago: R$ " + totalPagar
        );
    }
}
