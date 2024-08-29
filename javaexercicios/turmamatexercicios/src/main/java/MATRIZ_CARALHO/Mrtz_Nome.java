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
public class Mrtz_Nome {
    
    public static void main(String[] args) {
        String[][] matNome = new String[2][2];
                
        for (int lin = 0; lin < 2; lin++) {
         for (int col = 0; col < 2; col++) {
            matNome[lin][col] = JOptionPane.showInputDialog("Informe o Nome para posição [" + (lin+1) + "][" + (col+1) + "]:");
            }
        }
        
        StringBuilder nomesStr = new StringBuilder("Nomes na matriz:\n");
        
        for (int lin = 0; lin < 2; lin++) {
         for (int col = 0; col < 2; col++) {
            nomesStr.append("O nome na posição [").append(lin + 1).append("][").append(col + 1).append("]: ").append(matNome[lin][col]).append("\n");
            }
        }
        
        
        JOptionPane.showMessageDialog(null, nomesStr.toString());
    }
}

