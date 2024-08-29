package MATRIZ_CARALHO;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class MEdia_3Notas {
   
     public static void main(String[] args) {
        String[][] matrizAlunos = new String[3][5];
       
        for (int i = 0; i < 3; i++) {
          matrizAlunos[i][0] = JOptionPane.showInputDialog("Digite o nome do aluno " + (i + 1) + ":");

          // notas alunos 
          
          matrizAlunos[i][1] = JOptionPane.showInputDialog("Digite a primeira nota do aluno " + matrizAlunos[i][0] + ":");
          matrizAlunos[i][2] = JOptionPane.showInputDialog("Digite a segunda nota do aluno " + matrizAlunos[i][0] + ":");

         // Calcula a média
         
         double nota1 = Double.parseDouble(matrizAlunos[i][1]);
         double nota2 = Double.parseDouble(matrizAlunos[i][2]);
         double media = (nota1 + nota2) / 2;
         matrizAlunos[i][3] = String.valueOf(media);
                 
            if (media >= 7) {
                matrizAlunos[i][4] = "Aprovado";
            } else if (media < 6) {
                matrizAlunos[i][4] = "Reprovado";
            } else {
                matrizAlunos[i][4] = "Recuperação";
            }
        }
      
        StringBuilder mensagem = new StringBuilder("Resultados:\n");
        for (int i = 0; i < 3; i++) {
            mensagem.append("Nome: ").append(matrizAlunos[i][0]).append("\n");
            mensagem.append("Nota 1: ").append(matrizAlunos[i][1]).append("\n");
            mensagem.append("Nota 2: ").append(matrizAlunos[i][2]).append("\n");
            mensagem.append("Média: ").append(matrizAlunos[i][3]).append("\n");
            mensagem.append("Status: ").append(matrizAlunos[i][4]).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, mensagem.toString(), "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }
}
