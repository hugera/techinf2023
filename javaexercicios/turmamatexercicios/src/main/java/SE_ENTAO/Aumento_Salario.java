package SE_ENTAO;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class Aumento_Salario {
     public static void main(String[] args) {
       
        float salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário do funcionário:"));
        
        float aumento;

        // Calcula o valor do aumento com base nas condições fornecidas
        
        if (salario <= 1500.00) {
            aumento = salario * 0.10f; // 10% de aumento
        } else {
            aumento = salario * 0.05f; // 5% de aumento
        }
      
        JOptionPane.showMessageDialog(null, "O valor do aumento é: R$" + aumento);
    }
}

