package MATRIZ_CARALHO;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class Matriz_Positivos {
    
    public static void main(String[] args) {
     int[][] matNum = new int[4][4];  
     int num;
        
      
      for (int lin = 0; lin < 4; lin++) {
        for (int col = 0; col < 4; col++) {
            do {
             try {
                num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número positivo para a posição [" + (lin + 1) + "][" + (col + 1) + "]:"));
                   if (num <= 0) {
                      JOptionPane.showMessageDialog(null, "Por favor, insira um número positivo.");
                   } else {
                      matNum[lin][col] = num;
                        }
                   } catch (NumberFormatException e) {
                      JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número inteiro positivo.");
                      num = -1;  
                    }
                } while (num <= 0);
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
