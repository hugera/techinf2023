package MATRIZ_CARALHO;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class Matriz_Reais {
    
     public static void main(String[] args) {
       
         double[][] matNum = new double[4][4]; 
              
        for (int lin = 0; lin < 4; lin++) {
         for (int col = 0; col < 4; col++) {
            matNum[lin][col] = Double.parseDouble(JOptionPane.showInputDialog(
            "Informe o número MatNum[" + (lin + 1) + "][" + (col + 1) + "]:"
                ));
           }
        }
        
        StringBuilder matrizFinal = new StringBuilder();
        
        for (int lin = 0; lin < 4; lin++) {
         for (int col = 0; col < 4; col++) {
            matrizFinal.append(matNum[lin][col]).append(" ");
            }
            matrizFinal.append("\n");
        }
       
        JOptionPane.showMessageDialog(null, "Matriz Final:\n" + matrizFinal.toString());
    }
}

