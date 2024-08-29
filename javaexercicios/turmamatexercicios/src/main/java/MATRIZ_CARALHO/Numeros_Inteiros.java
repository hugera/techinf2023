package MATRIZ_CARALHO;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class Numeros_Inteiros {
   
    public static void main(String[] args) {
        int[][] matNum = new int[5][7];
                
        for (int lin = 0; lin < 5; lin++) {
         for (int col = 0; col < 7; col++) {
            matNum[lin][col] = Integer.parseInt(JOptionPane.showInputDialog(
            "Informe o número MatNum[" + (lin + 1) + "," + (col + 1) + "]:"));
            }
        }
        
        StringBuilder matrizStr = new StringBuilder("Números informados:\n");
        for (int lin = 0; lin < 5; lin++) {
         for (int col = 0; col < 7; col++) {
            matrizStr.append("MatNum[").append(lin + 1).append(",").append(col + 1).append("]: ")
            .append(matNum[lin][col]).append(" ");
            }
            matrizStr.append("\n");
        }
                
        JOptionPane.showMessageDialog(null, matrizStr.toString());
    }
}
