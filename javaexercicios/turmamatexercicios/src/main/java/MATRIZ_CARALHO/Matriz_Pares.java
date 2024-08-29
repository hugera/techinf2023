package MATRIZ_CARALHO;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class Matriz_Pares {
    
    public static void main(String[] args) {
      int[][] matriz = new int[5][5];
      int numPar = 2;
       
        for (int lin = 0; lin < 5; lin++) {
         for (int col = 0; col < 5; col++) {
            matriz[lin][col] = numPar;
            numPar += 2;
            }
        }
              
        StringBuilder matrizStr = new StringBuilder("Matriz de Números Pares:\n");
         
        for (int lin = 0; lin < 5; lin++) {
         for (int col = 0; col < 5; col++) {
           matrizStr.append(matriz[lin][col]).append(" ");
            }
           matrizStr.append("\n");
        }
        
        // Exibir a matriz
        JOptionPane.showMessageDialog(null, matrizStr.toString());
    }
}

