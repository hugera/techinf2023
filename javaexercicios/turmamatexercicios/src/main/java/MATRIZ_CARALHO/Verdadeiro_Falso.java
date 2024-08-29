package MATRIZ_CARALHO;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class Verdadeiro_Falso {
    
    public static void main(String[] args) {
        boolean[][] matrizRespostas = new boolean[3][3];
       
        for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
           String resposta = JOptionPane.showInputDialog("Gostaram de Lógica de programação? (Sim/Não)");
           matrizRespostas[i][j] = resposta.equalsIgnoreCase("sim");
            }
        }
       
        StringBuilder mensagem = new StringBuilder("Respostas:\n");
        
        for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
           mensagem.append("[").append(i).append("][").append(j).append("]: ").append(matrizRespostas[i][j] ? "Sim" : "Não").append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, mensagem.toString(), "Respostas", JOptionPane.INFORMATION_MESSAGE);
    } 
}
