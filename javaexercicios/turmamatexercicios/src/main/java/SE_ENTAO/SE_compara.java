package SE_ENTAO;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class SE_compara {
    public static void main(String[] args) {
        // Definição dos vetores para armazenar os dados dos alunos
        String[] nomes = new String[3];
        float[] notas1 = new float[3];
        float[] notas2 = new float[3];
        float[] medias = new float[3];
        
        // Loop para a digitação dos dados e cálculo das médias
        for (int i = 0; i < 3; i++) {
            // Entrada do nome do aluno
            nomes[i] = JOptionPane.showInputDialog("Digite o nome do aluno " + (i+1) + ": ");
            
            // Entrada das notas do aluno
            notas1[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota de " + nomes[i] + ": "));
            notas2[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota de " + nomes[i] + ": "));
            
            // Cálculo da média do aluno
            medias[i] = (notas1[i] + notas2[i]) / 2;
            
            // Verificação da situação do aluno
            if (medias[i] >= 7.0) {
                JOptionPane.showMessageDialog(null, "Situação de " + nomes[i] + ": Aprovado");
            } else if (medias[i] < 6.0) {
                JOptionPane.showMessageDialog(null, "Situação de " + nomes[i] + ": Reprovado");
            } else {
                JOptionPane.showMessageDialog(null, "Situação de " + nomes[i] + ": Recuperação");
            }
        }
        
        // Exibição das informações dos alunos
        for (int i = 0; i < 3; i++) {
            JOptionPane.showMessageDialog(null, 
                """
                ------ INFORMA DO ALUNO -------
                Nome: """ + nomes[i] + "\n" +
                "Nota 1: " + notas1[i] + "\n" +
                "Nota 2: " + notas2[i] + "\n" +
                "Média: " + medias[i]
            );
        }
    }
}

