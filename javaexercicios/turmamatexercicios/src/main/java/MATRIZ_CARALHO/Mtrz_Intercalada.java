package MATRIZ_CARALHO;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class Mtrz_Intercalada {
  
    public static void main(String[] args) {
        int[][] matriz1 = new int[3][2];
        int[][] matriz2 = new int[3][2];
        int[][] matrizResult = new int[6][2];
        
        
        for (int lin = 0; lin < 3; lin++) {
          for (int col = 0; col < 2; col++) {
            matriz1[lin][col] = lin + col + 1;  
            matriz2[lin][col] = 10 + lin + col + 1; 
            }
        }
        for (int lin = 0; lin < 3; lin++) {     // Intercalar as duas matrizes na matrizResult
          for (int col = 0; col < 2; col++) {
            matrizResult[lin * 2][col] = matriz1[lin][col];
            matrizResult[lin * 2 + 1][col] = matriz2[lin][col];
            }
        }            
        StringBuilder matriz1Str = new StringBuilder("Matriz 1:\n");  // Criar strings para mostrar a matriz
        for (int lin = 0; lin < 3; lin++) {
            for (int col = 0; col < 2; col++) {
            matriz1Str.append(matriz1[lin][col]).append(" ");
            }
            matriz1Str.append("\n");
        }
        
        StringBuilder matriz2Str = new StringBuilder("Matriz 2:\n");
        for (int lin = 0; lin < 3; lin++) {
            for (int col = 0; col < 2; col++) {
            matriz2Str.append(matriz2[lin][col]).append(" ");
            }
            matriz2Str.append("\n");
        }
        
        StringBuilder matrizResultStr = new StringBuilder("Matriz Resultante:\n");
        for (int lin = 0; lin < 6; lin++) {
            for (int col = 0; col < 2; col++) {
            matrizResultStr.append(matrizResult[lin][col]).append(" ");
            }
            matrizResultStr.append("\n");
        }
        
        // Exibir as matrizes
        JOptionPane.showMessageDialog(null, matriz1Str.toString());
        JOptionPane.showMessageDialog(null, matriz2Str.toString());
        JOptionPane.showMessageDialog(null, matrizResultStr.toString());
    }
}  

