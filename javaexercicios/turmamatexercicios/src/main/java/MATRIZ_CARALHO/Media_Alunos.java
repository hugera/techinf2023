package MATRIZ_CARALHO;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class Media_Alunos {
  

    public static void main(String[] args) {
       
        String[][] matNome = new String[3][3];
        double[][] matN1 = new double[3][3];
        double[][] matN2 = new double[3][3];
        double[][] matMedia = new double[3][3];
        String[][] matStatus = new String[3][3];
        
       
    for (int lin = 0; lin < 3; lin++) {
     for (int col = 0; col < 3; col++) {
        matNome[lin][col] = JOptionPane.showInputDialog("Informe o Nome para posição [" + (lin+1) + "][" + (col+1) + "]:");
        matN1[lin][col] = Double.parseDouble(JOptionPane.showInputDialog("Informe a 1ª Nota para " + matNome[lin][col] + ":"));
        matN2[lin][col] = Double.parseDouble(JOptionPane.showInputDialog("Informe a 2ª Nota para " + matNome[lin][col] + ":"));

        matMedia[lin][col] = (matN1[lin][col] + matN2[lin][col]) / 2;

            if (matMedia[lin][col] >= 7) {
                matStatus[lin][col] = "Aprovado";
            } else if (matMedia[lin][col] < 6) {
                matStatus[lin][col] = "Reprovado";
            } else {
                matStatus[lin][col] = "Recuperação";
                }
            }
        }
       
        StringBuilder resultadosStr = new StringBuilder("Resultados:\n");
        
        for (int lin = 0; lin < 3; lin++) {
         for (int col = 0; col < 3; col++) {
            resultadosStr.append("Aluno: ").append(matNome[lin][col])
                         .append(" - Status: ").append(matStatus[lin][col])
                         .append("\nNotas: N1 = ").append(matN1[lin][col])
                         .append(", N2 = ").append(matN2[lin][col])
                         .append(", Média = ").append(matMedia[lin][col])
                         .append("\n\n");
            }
        }

        // Exibir os resultados
        JOptionPane.showMessageDialog(null, resultadosStr.toString());
    }
} 

