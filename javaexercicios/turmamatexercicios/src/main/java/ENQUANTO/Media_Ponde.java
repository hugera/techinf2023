/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ENQUANTO;

import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class Media_Ponde {
   
   
    public static void main(String[] args) {
        
        int numeroNotas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de notas: "));
        float somaNotas = 0;
        float somaPesos = 0;

        for (int i = 1; i <= numeroNotas; i++) {
            
            float nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota " + i + ": "));
            float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso correspondente à nota " + i + ": "));

            somaNotas += nota * peso;
            somaPesos += peso;
        }

        float media = somaNotas / somaPesos;

        JOptionPane.showMessageDialog(null, "A média ponderada é: " + media);
    }
}
