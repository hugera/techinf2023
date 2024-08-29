package MATRIZ_CARALHO;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class Principal_Secundaria {
   
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
     
        for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 5; j++) {
            matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para a posição [" + i + "][" + j + "]:"));
            }
        }
        //Encontra e exibe a diagonal principal
        
       StringBuilder diagonalPrincipal = new StringBuilder("Diagonal Principal:\n");
        
       for (int i = 0; i < 5; i++) {
         diagonalPrincipal.append(matriz[i][i]).append(" ");
        }
        JOptionPane.showMessageDialog(null, diagonalPrincipal.toString(), "Diagonal Principal", JOptionPane.INFORMATION_MESSAGE);

        // Encontra e exibe a diagonal secundária
       
        StringBuilder diagonalSecundaria = new StringBuilder("Diagonal Secundária:\n");
        
       for (int i = 0; i < 5; i++) {
            diagonalSecundaria.append(matriz[i][4 - i]).append(" ");
        }
        JOptionPane.showMessageDialog(null, diagonalSecundaria.toString(), "Diagonal Secundária", JOptionPane.INFORMATION_MESSAGE);
    }
} 

