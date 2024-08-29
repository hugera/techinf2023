package MATRIZ_CARALHO;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class Matriz_Impar {
    
    public static void main(String[] args) {
       
      int[][] matriz = new int[3][3];
      int numImpar = 1;
        
        for (int lin = 0; lin < 3; lin++) {
         for (int col = 0; col < 3; col++) {
            matriz[lin][col] = numImpar;
            numImpar += 2;
            }
        }
                
        StringBuilder matrizStr = new StringBuilder("Matriz de Números Ímpares:\n");
        
        for (int lin = 0; lin < 3; lin++) {
         for (int col = 0; col < 3; col++) {
            matrizStr.append(matriz[lin][col]).append(" ");
            }
            matrizStr.append("\n");
        }
        
        
        JOptionPane.showMessageDialog(null, matrizStr.toString());
    }
}

