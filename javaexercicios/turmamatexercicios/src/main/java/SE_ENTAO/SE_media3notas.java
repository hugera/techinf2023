/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SE_ENTAO;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class SE_media3notas {
   public static void main(String[] args) {
        // Entrada do nome do aluno
        String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno:");
        
        // Entrada das notas do aluno
        float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota do aluno:"));
        float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota do aluno:"));
        float nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota do aluno:"));
        
        // Cálculo da média do aluno
        float media = (nota1 + nota2 + nota3) / 3;
        
        // Verificação da situação do aluno
        String situacao;
        if (media >= 7.0) {
            situacao = "Aprovado";
        } else if (media < 6.0) {
            situacao = "Reprovado";
        } else {
            situacao = "Recuperação";
        }
        
        // Exibição do nome do aluno, média e situação
        JOptionPane.showMessageDialog(null, 
            "Nome do aluno: " + nomeAluno + "\n" +
            "Média: " + media + "\n" +
            "Situação: " + situacao
        );
    }
} 

