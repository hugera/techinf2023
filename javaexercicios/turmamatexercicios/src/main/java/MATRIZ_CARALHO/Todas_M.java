package MATRIZ_CARALHO;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class Todas_M {
    
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
      
        for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 4; j++) {
            matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para a posição [" + i + "][" + j + "]:"));
            }
        }
        // matriz original
        
        StringBuilder matrizOriginal = new StringBuilder("Matriz Original:\n");
        for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 4; j++) {
            matrizOriginal.append(matriz[i][j]).append("\t");
            }
            matrizOriginal.append("\n");
        }
        JOptionPane.showMessageDialog(null, matrizOriginal.toString(), "Matriz Original", JOptionPane.INFORMATION_MESSAGE);

        // Diagonal principal
        
        StringBuilder diagonalPrincipal = new StringBuilder("Diagonal Principal:\n");
        for (int i = 0; i < 4; i++) {
            diagonalPrincipal.append(matriz[i][i]).append("\t");
        }
        JOptionPane.showMessageDialog(null, diagonalPrincipal.toString(), "Diagonal Principal", JOptionPane.INFORMATION_MESSAGE);

        // Diagonal secundária
       
        StringBuilder diagonalSecundaria = new StringBuilder("Diagonal Secundária:\n");
        for (int i = 0; i < 4; i++) {
            diagonalSecundaria.append(matriz[i][3 - i]).append("\t");
        }
        JOptionPane.showMessageDialog(null, diagonalSecundaria.toString(), "Diagonal Secundária", JOptionPane.INFORMATION_MESSAGE);

        // Números acima das diagonais secundárias
        
        StringBuilder acimaDiagonalSecundaria = new StringBuilder("Números acima da Diagonal Secundária:\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j < 3 - i) {
                    acimaDiagonalSecundaria.append(matriz[i][j]).append("\t");
                }
            }
        }
        JOptionPane.showMessageDialog(null, acimaDiagonalSecundaria.toString(), "Números Acima da Diagonal Secundária", JOptionPane.INFORMATION_MESSAGE);

        // Número na diagonal principal e secundária
        
        StringBuilder diagonalPrincipalESecundaria = new StringBuilder("Números na Diagonal Principal e Secundária:\n");
        for (int i = 0; i < 4; i++) {
            if (matriz[i][i] == matriz[i][3 - i]) {
                diagonalPrincipalESecundaria.append(matriz[i][i]).append("\t");
            }
        }
        JOptionPane.showMessageDialog(null, diagonalPrincipalESecundaria.toString(), "Números na Diagonal Principal e Secundária", JOptionPane.INFORMATION_MESSAGE);

        // Números abaixo da diagonal principal e secundária
        
        StringBuilder abaixoDiagonais = new StringBuilder("Números Abaixo da Diagonal Principal e Secundária:\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i > j && i > 3 - j) {
                    abaixoDiagonais.append(matriz[i][j]).append("\t");
                }
            }
        }
        JOptionPane.showMessageDialog(null, abaixoDiagonais.toString(), "Números Abaixo da Diagonal Principal e Secundária", JOptionPane.INFORMATION_MESSAGE);

        // Números acima da diagonal principal e abaixo da diagonal secundária
       
        StringBuilder acimaDiagonalPrincipalAbaixoDiagonalSecundaria = new StringBuilder("Números Acima da Diagonal Principal e Abaixo da Diagonal Secundária:\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i < j && i < 3 - j) {
                    acimaDiagonalPrincipalAbaixoDiagonalSecundaria.append(matriz[i][j]).append("\t");
                }
            }
        }
        JOptionPane.showMessageDialog(null, acimaDiagonalPrincipalAbaixoDiagonalSecundaria.toString(), "Números Acima da Diagonal Principal e Abaixo da Diagonal Secundária", JOptionPane.INFORMATION_MESSAGE);
    }
} 

