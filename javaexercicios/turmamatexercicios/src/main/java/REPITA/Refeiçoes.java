package REPITA;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class Refeiçoes {
 
    public static void main(String[] args) {
        
        float totalCalorias = 0;
        
        // Variável de controle para decidir quando o loop deve terminar
        
        boolean continuar = true;
        
        // Laço
        do {
            float caloriasRefeicao = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de calorias consumidas nesta refeição (digite 0 para sair): "));
            
              if (caloriasRefeicao == 0) {
                 continuar = false; // Define a variável de controle como false para sair do loop
            } else {
                
                 // Adiciona a quantidade de calorias consumidas na refeição atual ao total de calorias
                 totalCalorias += caloriasRefeicao;
            }
            
        } while (continuar); // O loop continua enquanto a variável de controle for true
        
        JOptionPane.showMessageDialog(null, "Total de calorias consumidas no dia: " + totalCalorias);
    }
}
  

