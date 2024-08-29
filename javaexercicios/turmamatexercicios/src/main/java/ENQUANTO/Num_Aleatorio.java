package ENQUANTO;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class Num_Aleatorio {
     public static void main(String[] args) {
        
        int contador = 0;
        float soma = 0;
        float numero;
        float media;

        // Laço
        do {
            numero = Float.parseFloat(JOptionPane.showInputDialog("Digite um número (digite 0 para sair): "));
            
            // Verifica se o número é diferente de 0
            
            if (numero != 0) {
                soma += numero;
                contador++;
            }
            
        } while (numero != 0); // Laço
        
        // Calcula a média dos números
        
        if (contador != 0) {
            media = soma / contador;
        } else {
            media = 0; // Define a média como 0 se nenhum número for fornecido pelo usuário
        }
        
        
        JOptionPane.showMessageDialog(null, "A média dos números fornecidos é: " + media);
    }
}


