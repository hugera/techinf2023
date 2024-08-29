
//Ternário: '?' Substitui if-else de forma concisa.
//MAX_VALUE é uma constante que representa o maior valor que pode ser armazenado em um tipo. 
//Usando StringBuilder e Append para mostrar o resultado.

// **************************************************************************************** //

package VETORES;


import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class Media_Escolar {
  
    public static void main(String[] args) {
        int totalAlunos = 3;

        String[] nomes = new String[totalAlunos];
        double[] nota1 = new double[totalAlunos];
        double[] nota2 = new double[totalAlunos];
        double[] medias = new double[totalAlunos];

        int totalAprov = 0, totalReprov = 0, totalRecup = 0;
        double somaNotaAprov = 0, somaNotaReprov = 0, somaNotaRecup = 0;
        double maiorNotaAprov = -1, menorNotaAprov = Double.MAX_VALUE;
        double maiorNotaReprov = -1, menorNotaReprov = Double.MAX_VALUE;
        double maiorNotaRecup = -1, menorNotaRecup = Double.MAX_VALUE;
        double maiorMediaAprov = -1, menorMediaReprov = Double.MAX_VALUE, maiorMediaRecup = -1;

        for (int i = 0; i < totalAlunos; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome do aluno:");
            nota1[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
            nota2[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));

            medias[i] = (nota1[i] + nota2[i]) / 2;
            JOptionPane.showMessageDialog(null, "Sua média é: " + medias[i]);

            if (medias[i] >= 7) {
                JOptionPane.showMessageDialog(null, "Situação: Aprovado");
                totalAprov++;
                somaNotaAprov += (nota1[i] + nota2[i]);
                if (nota1[i] > maiorNotaAprov) maiorNotaAprov = nota1[i];
                if (nota2[i] > maiorNotaAprov) maiorNotaAprov = nota2[i];
                if (nota1[i] < menorNotaAprov) menorNotaAprov = nota1[i];
                if (nota2[i] < menorNotaAprov) menorNotaAprov = nota2[i];
                if (medias[i] > maiorMediaAprov) maiorMediaAprov = medias[i];
            } else if (medias[i] < 6) {
                JOptionPane.showMessageDialog(null, "Situação: Reprovado");
                totalReprov++;
                somaNotaReprov += (nota1[i] + nota2[i]);
                if (nota1[i] > maiorNotaReprov) maiorNotaReprov = nota1[i];
                if (nota2[i] > maiorNotaReprov) maiorNotaReprov = nota2[i];
                if (nota1[i] < menorNotaReprov) menorNotaReprov = nota1[i];
                if (nota2[i] < menorNotaReprov) menorNotaReprov = nota2[i];
                if (medias[i] < menorMediaReprov) menorMediaReprov = medias[i];
            } else {
                JOptionPane.showMessageDialog(null, "Situação: Recuperação");
                totalRecup++;
                somaNotaRecup += (nota1[i] + nota2[i]);
                if (nota1[i] > maiorNotaRecup) maiorNotaRecup = nota1[i];
                if (nota2[i] > maiorNotaRecup) maiorNotaRecup = nota2[i];
                if (nota1[i] < menorNotaRecup) menorNotaRecup = nota1[i];
                if (nota2[i] < menorNotaRecup) menorNotaRecup = nota2[i];
                if (medias[i] > maiorMediaRecup) maiorMediaRecup = medias[i];
            }
        }

        double mediaAprov = totalAprov > 0 ? somaNotaAprov / (totalAprov * 2) : 0;
        double mediaReprov = totalReprov > 0 ? somaNotaReprov / (totalReprov * 2) : 0;
        double mediaRecup = totalRecup > 0 ? somaNotaRecup / (totalRecup * 2) : 0;

        StringBuilder resultado = new StringBuilder();
        
        resultado.append("Quantidade de alunos aprovados: ").append(totalAprov).append("\n")
                 .append("Quantidade de alunos reprovados: ").append(totalReprov).append("\n")
                 .append("Quantidade de alunos em recuperação: ").append(totalRecup).append("\n")
                 .append("Média de notas dos aprovados: ").append(mediaAprov).append("\n")
                 .append("Média de notas dos reprovados: ").append(mediaReprov).append("\n")
                 .append("Média de notas dos alunos em recuperação: ").append(mediaRecup).append("\n")
                 .append("Maior nota dos aprovados: ").append(maiorNotaAprov).append("\n")
                 .append("Menor nota dos aprovados: ").append(menorNotaAprov).append("\n")
                 .append("Maior nota dos alunos em recuperação: ").append(maiorNotaRecup).append("\n")
                 .append("Menor nota dos alunos em recuperação: ").append(menorNotaRecup).append("\n")
                 .append("Maior nota dos reprovados: ").append(maiorNotaReprov).append("\n")
                 .append("Menor nota dos reprovados: ").append(menorNotaReprov).append("\n")
                 .append("Maior média dos aprovados: ").append(maiorMediaAprov).append("\n")
                 .append("Menor média dos reprovados: ").append(menorMediaReprov).append("\n")
                 .append("Maior média dos alunos em recuperação: ").append(maiorMediaRecup).append("\n");

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}


