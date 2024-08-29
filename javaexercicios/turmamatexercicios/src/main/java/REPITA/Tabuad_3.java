/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package REPITA;

import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class Tabuad_3 {
     public static void main(String[] args) {
        int opcao;
        int num;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções no menu" +
                    "\n1 - Adição" + "\n2 - Subtração" + "\n3 - Multiplicação" + "\n4 - Divisão" +
                    "\n0 - Sair"));

            if (opcao != 0) {
                num = Integer.parseInt(JOptionPane.showInputDialog("Escolha o número para tabuada"));
                switch (opcao) {
                    case 1:
                        exibirTabuada(num, "+");
                        break;
                    case 2:
                        exibirTabuada(num, "-");
                        break;
                    case 3:
                        exibirTabuada(num, "*");
                        break;
                    case 4:
                        exibirTabuada(num, "/");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida...");
                        break;
                }
            }
        } while (opcao != 0);
        JOptionPane.showMessageDialog(null, "Saindo, Tchau!");
    }

    public static void exibirTabuada(int num, String operador) {
        StringBuilder tabuada = new StringBuilder();
        for (int i = 0; i <= 10; i++) {
            int resultado = 0;
            switch (operador) {
                case "+":
                    resultado = num + i;
                    break;
                case "-":
                    resultado = num - i;
                    break;
                case "*":
                    resultado = num * i;
                    break;
                case "/":
                    if (i != 0) {
                        resultado = num / i;
                    }
                    break;
            }
            tabuada.append(num).append(" ").append(operador).append(" ").append(i).append(" = ").append(resultado).append("\n");
        }
        JOptionPane.showMessageDialog(null, "Tabuada de " + operador + " " + num + ":\n" + tabuada);
    }
}



