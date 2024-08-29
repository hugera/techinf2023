
package MATRIZ_CARALHO;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class Desconto_INSS {
  
    public static void main(String[] args) {
      double[][] descInss = new double[10][10];
      double salBruto;

       for (int lin = 0; lin < 10; lin++) {
        for (int col = 0; col < 10; col++) {
            salBruto = Double.parseDouble(JOptionPane.showInputDialog("Informe o Salário Bruto (" + (lin + 1) + "," + (col + 1) + "):"));

            if (salBruto <= 1412.00) {
                descInss[lin][col] = salBruto * 0.075;
            } else if (salBruto <= 2666.68) {
                descInss[lin][col] = salBruto * 0.09;
            } else if (salBruto <= 4000.03) {
                descInss[lin][col] = salBruto * 0.12;
            } else if (salBruto <= 7786.02) {
                descInss[lin][col] = salBruto * 0.14;
            } else {
                descInss[lin][col] = 1090.04;
                }
            }
        }

        StringBuilder output = new StringBuilder("Matriz de Descontos do INSS:\n");
        
        for (int lin = 0; lin < 10; lin++) {
         for (int col = 0; col < 10; col++) {
            output.append(String.format("%.2f", descInss[lin][col])).append(" ");
            }
            output.append("\n");
        }

        JOptionPane.showMessageDialog(null, output.toString(), "Matriz de Descontos do INSS", JOptionPane.INFORMATION_MESSAGE);
    }
} 

