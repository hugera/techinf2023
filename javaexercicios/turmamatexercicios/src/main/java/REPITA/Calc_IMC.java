package REPITA;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class Calc_IMC {
 
    public static void main(String[] args) {
          do {
            
            float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso (em kg): "));
            float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura (em metros): "));
            
            // Calcula o IMC
            
            float imc = peso / (altura * altura);
                        
            JOptionPane.showMessageDialog(null, "O IMC é: " + imc);
            
            // Pergunta ao usuário se deseja calcular o IMC para outra pessoa
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja calcular o IMC para outra pessoa?", "Continuar?", JOptionPane.YES_NO_OPTION);
            
            // Se o usuário escolher "Não", sai do loop
            
            if (opcao == JOptionPane.NO_OPTION) {
                break;
            }
            
        } while (true); // O loop continua indefinidamente até que o usuário decida parar
    }
}
 

