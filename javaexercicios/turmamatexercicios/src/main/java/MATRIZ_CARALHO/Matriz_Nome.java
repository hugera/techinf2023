package MATRIZ_CARALHO;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class Matriz_Nome {
   
    public static void main(String[] args) {
        
        String[][] matNome = new String[8][3];
                
        for (int lin = 0; lin < 8; lin++) {
         for (int col = 0; col < 3; col++) {
            matNome[lin][col] = JOptionPane.showInputDialog("Informe o nome para posição (" + (lin + 1) + ", " + (col + 1) + "):");
            }
        }
               
        StringBuilder nomesStr = new StringBuilder("Nomes informados:\n");
        for (int lin = 0; lin < 8; lin++) {
         for (int col = 0; col < 3; col++) {
            nomesStr.append("Nome[").append(lin + 1).append(",").append(col + 1).append("]: ")
            .append(matNome[lin][col]).append("\n");
            }
            nomesStr.append("\n");
        }
        
       
        JOptionPane.showMessageDialog(null, nomesStr.toString());
    }  
}
