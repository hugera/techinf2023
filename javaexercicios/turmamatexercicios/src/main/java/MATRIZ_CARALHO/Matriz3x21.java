package MATRIZ_CARALHO;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class Matriz3x21 {
    
    public static void main(String[] args) {
        int[][] matNum1 = new int[3][2];
        int[][] matNum2 = new int[3][2];
                      
        for (int lin = 0; lin < 3; lin++) {     // Preencher as matrizes 
         for (int col = 0; col < 2; col++) {
           
          matNum1[lin][col] = Integer.parseInt(JOptionPane.showInputDialog("Informe os Numeros da 1° Matriz: [" + (lin+1) + "][" + (col+1) + "]"));
          matNum2[lin][col] = Integer.parseInt(JOptionPane.showInputDialog("Informe os Numeros da 2° Matriz: [" + (lin+1) + "][" + (col+1) + "]"));
            }
        }

        // Mostrar as matrizes
        
        StringBuilder matriz1 = new StringBuilder("Matriz 1:\n");
        
        for (int lin = 0; lin < 3; lin++) {
         for (int col = 0; col < 2; col++) {
              matriz1.append(matNum1[lin][col]).append(" ");
            }
              matriz1.append("\n");
        }
        
        StringBuilder matriz2 = new StringBuilder("Matriz 2:\n");
        
        for (int lin = 0; lin < 3; lin++) {
         for (int col = 0; col < 2; col++) {
             matriz2.append(matNum2[lin][col]).append(" ");
            }
             matriz2.append("\n");
        }
        
        JOptionPane.showMessageDialog(null, matriz1.toString());
        JOptionPane.showMessageDialog(null, matriz2.toString());
        
        
    }
}

