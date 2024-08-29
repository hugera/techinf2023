/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package REPITA;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class Tds_Em_Um {
   

    public static void main(String[] args) {
        int opcao;
        String nome = "", endereco = "", telefone = "";
        float num, tp, nota1, nota2, nota3, nota4, media, saldoAplicacao, saldoAnterior = 0, saldoAtualizado;
        
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("(1) - Antecessor e Sucessor\n"
                                                                + "(2) - Nome, Endereco e Telefone\n"
                                                                + "(3) - Terça Parte\n"
                                                                + "(4) - Media Ponderada\n"
                                                                + "(5) - Saldo Atualizado\n"
                                                                + "(0) - Sair\n\n"
                                                                + "Informe a opção desejada: "));
            
            switch (opcao) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Saia");
                    break;
                case 1:
                    int numero = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
                    int antecessor = numero - 1;
                    int sucessor = numero + 1;
                    JOptionPane.showMessageDialog(null, "Número inserido: " + numero + "\nAntecessor: " + antecessor + "\nSucessor: " + sucessor);
                    break;
                case 2:
                    nome = JOptionPane.showInputDialog("Informe o nome: ");
                    endereco = JOptionPane.showInputDialog("Informe o endereço: ");
                    telefone = JOptionPane.showInputDialog("Informe o telefone: ");
                    break;
                case 3:
                    num = Float.parseFloat(JOptionPane.showInputDialog("Digite um número: "));
                    tp = num / 3;
                    JOptionPane.showMessageDialog(null, "O número é: " + num + "\nA terça parte do número é: " + tp);
                    break;
                case 4:
                    nota1 = Float.parseFloat(JOptionPane.showInputDialog("Escreva a primeira nota: "));
                    nota2 = Float.parseFloat(JOptionPane.showInputDialog("Escreva a segunda nota: "));
                    nota3 = Float.parseFloat(JOptionPane.showInputDialog("Escreva a terceira nota: "));
                    nota4 = Float.parseFloat(JOptionPane.showInputDialog("Escreva a quarta nota: "));
                    media = (nota1 * 1 + nota2 * 2 + nota3 * 3 + nota4 * 4) / (1 + 2 + 3 + 4);
                    JOptionPane.showMessageDialog(null, "Todas as notas: " + nota1 + ", " + nota2 + ", " + nota3 + ", " + nota4 + "\nMédia ponderada: " + media);
                    break;
                case 5:
                    saldoAplicacao = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da aplicação: "));
                    saldoAtualizado = saldoAplicacao + saldoAnterior;
                    JOptionPane.showMessageDialog(null, "O saldo anterior antes da atualização: " + saldoAnterior + "\nO valor da aplicação: " + saldoAplicacao + "\nO valor atualizado: " + saldoAtualizado);
                    saldoAnterior = saldoAtualizado;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Não existe essa opção");
                    break;
            }
            
        } while (opcao != 0);
    }
}


