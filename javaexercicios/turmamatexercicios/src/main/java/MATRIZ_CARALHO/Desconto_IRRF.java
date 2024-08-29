package MATRIZ_CARALHO;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class Desconto_IRRF {
    
    public static void main(String[] args) {
        double[][] salarios = new double[10][10];
        double[][] descontosIRRF = new double[10][10];
        double lim1 = 2259.20;
        double lim2 = 2826.65;
        double lim3 = 3751.05;
        double lim4 = 4664.68;
        double tx1 = 0.075;
        double tx2 = 0.15;
        double tx3 = 0.225;
        double tx4 = 0.275;
        double ded1 = 169.44;
        double ded2 = 381.44;
        double ded3 = 662.77;
        double ded4 = 896;
              
        for (int lin = 0; lin < 10; lin++) {
            for (int col = 0; col < 10; col++) {
                salarios[lin][col] = (lin + 1) * (col + 1) * 500; // Exemplo de preenchimento, pode ser ajustado conforme necessário
            }
        }
       
        for (int lin = 0; lin < 10; lin++) {
         for (int col = 0; col < 10; col++) {
            if (salarios[lin][col] <= lim1) {
               descontosIRRF[lin][col] = 0;
            } else if (salarios[lin][col] <= lim2) {
               descontosIRRF[lin][col] = salarios[lin][col] * tx1 - ded1;
            } else if (salarios[lin][col] <= lim3) {
               descontosIRRF[lin][col] = salarios[lin][col] * tx2 - ded2;
            } else if (salarios[lin][col] <= lim4) {
               descontosIRRF[lin][col] = salarios[lin][col] * tx3 - ded3;
            } else {
               descontosIRRF[lin][col] = salarios[lin][col] * tx4 - ded4;
                }
            }
        }
       
        String output = "Matriz de Descontos do IRRF:\n";
        for (int lin = 0; lin < 10; lin++) {
         for (int col = 0; col < 10; col++) {
            output += String.format("%.2f ", descontosIRRF[lin][col]);
            }
            output += "\n";
        }
        JOptionPane.showMessageDialog(null, output, "Matriz de Descontos do IRRF", JOptionPane.INFORMATION_MESSAGE);
    }
}

