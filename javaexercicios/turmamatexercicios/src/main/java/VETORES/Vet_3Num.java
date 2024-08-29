package VETORES;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class Vet_3Num {
  

public class VetorCalculo {
    
    public static void main(String[] args) {
        // Declaração das variáveis
        int[] Num1 = new int[3];
        int[] Num2 = new int[3];
        int[] Num3 = new int[3];
        double resultado;

        for (int i = 0; i < 3; i++) {
            Num1[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i+1) + "º valor para o 1° vetor:"));
            Num2[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i+1) + "º valor para o 2° vetor:"));
            Num3[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i+1) + "º valor para o 3° vetor:"));
        } 

        for (int i = 0; i < 3; i++) {
            resultado = 2 * Num1[i] - 3 * Num2[i] + Num3[i];
            JOptionPane.showMessageDialog(null, "Resultado para o " + (i+1) + "º valor: " + resultado);
        } 
    }
}

}
