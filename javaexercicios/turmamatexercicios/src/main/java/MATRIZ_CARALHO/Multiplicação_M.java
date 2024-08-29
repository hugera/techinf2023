/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MATRIZ_CARALHO;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class Multiplicação_M {
   
   public static void main(String[] args) {
     
     int[][] matNum = new int[3][6];
     int[][] matNum2 = new int[3][6];
     int[][] matResultado = new int[3][6];
        
       
     for (int lin = 0; lin < 3; lin++) {  // 1º matriz
      for (int col = 0; col < 6; col++) {
        matNum[lin][col] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da 1ª matriz (" + (lin + 1) + ", " + (col + 1) + "):"));
            }
        }
        
      for (int lin = 0; lin < 3; lin++) {  // 2º matriz
       for (int col = 0; col < 6; col++) {
        matNum2[lin][col] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da 2ª matriz (" + (lin + 1) + ", " + (col + 1) + "):"));
            }
        }
     
     StringBuilder matriz1Str = new StringBuilder("Matriz 1:\n"); // Mostrando 1º M
      
      for (int lin = 0; lin < 3; lin++) {
       for (int col = 0; col < 6; col++) {
        matriz1Str.append(matNum[lin][col]).append(" ");
            }
        matriz1Str.append("\n");
        }
        
     StringBuilder matriz2Str = new StringBuilder("Matriz 2:\n"); // Mostrando 2º M
        for (int lin = 0; lin < 3; lin++) {
         for (int col = 0; col < 6; col++) {
            matriz2Str.append(matNum2[lin][col]).append(" ");
            }
            matriz2Str.append("\n");
        }
        
        for (int lin = 0; lin < 3; lin++) {   // Multiplicação das matrizes
         for (int col = 0; col < 6; col++) {
            matResultado[lin][col] = matNum[lin][col] * matNum2[lin][col];
            }
        }
       
        StringBuilder matrizResultanteStr = new StringBuilder("Matriz Resultante:\n"); // matriz resultante
        for (int lin = 0; lin < 3; lin++) {
         for (int col = 0; col < 6; col++) {
            matrizResultanteStr.append(matResultado[lin][col]).append(" ");
            }
            matrizResultanteStr.append("\n");
        }
       
        JOptionPane.showMessageDialog(null, matriz1Str.toString());
        JOptionPane.showMessageDialog(null, matriz2Str.toString());
        JOptionPane.showMessageDialog(null, matrizResultanteStr.toString());
    }
} 

