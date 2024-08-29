/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CASO;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class Nota_Escolar {
    public static void main(String[] args) {
        String nota = JOptionPane.showInputDialog("Insira a nota escolar (A, B, C, D ou F):");
     
        String mensagem;
        // Usa o switch-case para determinar a mensagem de acordo com a nota
        switch (nota.toUpperCase()) {
            case "A":
                mensagem = "Excelente";
                break;
            case "B":
                mensagem = "Bom";
                break;
            case "C":
                mensagem = "Regular";
                break;
            case "D":
                mensagem = "Ruim";
                break;
            case "F":
                mensagem = "Reprovado";
                break;
            default:
                mensagem = "Nota inválida!";
                break;
        }

        JOptionPane.showMessageDialog(null, "A nota " + nota + " representa: " + mensagem);
    }
}

