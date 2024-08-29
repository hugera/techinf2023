/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRIMEIROSEXERCICIOS;

import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class Escola_Disciplina {
    public static void main (String [] args ) {
        
        String NomeAluno = JOptionPane.showInputDialog ("Informe o nome do aluno: ");
        String serie = JOptionPane.showInputDialog ("Informe a serie: ");
        String Turno = JOptionPane.showInputDialog ("Informe o turno: ");
        String semestre = JOptionPane.showInputDialog ("Informe o semestre: ");
        String turma = JOptionPane.showInputDialog ("Informe a turma: ");
        
        JOptionPane.showMessageDialog (null, "NomeAluno: "+NomeAluno+"\nserie: "+serie+
                "\nTurno: "+Turno+"\nsemestre: "+semestre+"\nturma: "+turma);
        
    }
}
