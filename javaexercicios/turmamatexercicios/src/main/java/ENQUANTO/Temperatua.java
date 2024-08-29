package ENQUANTO;

import javax.swing.JOptionPane;

/**Multiplica-se a temperatura em Celsius por 9/5. 
   Isso é necessário porque cada grau Celsius é equivalente a 9/5 graus Fahrenheit.
   Adiciona-se 32 ao resultado da multiplicação. 
   Isso é necessário porque o zero em Celsius corresponde a 32 em Fahrenheit, 
   então precisamos fazer esse ajuste.
 *
 * @author hugao
 */
public class Temperatua {
   
    public static void main(String[] args) {
        float temperaturaInicial, temperaturaFinal, temperatura, temperaturaFahrenheit;
        String mensagem;

        temperaturaInicial = Float.parseFloat(JOptionPane.showInputDialog("Digite a temperatura inicial em Celsius: "));
        temperaturaFinal = Float.parseFloat(JOptionPane.showInputDialog("Digite a temperatura final em Celsius: "));
        
        mensagem = "Temperaturas convertidas de Celsius para Fahrenheit:\n";
        
        temperatura = temperaturaInicial;
        
        // Laço 
        
        while (temperatura <= temperaturaFinal) {
            
            temperaturaFahrenheit = (temperatura * 9/5) + 32; // Converte temperatura de Celsius para Fahrenheit
            mensagem += temperatura + "°C = " + temperaturaFahrenheit + "°F\n"; // Adiciona a temperatura convertida à mensagem
                 
            temperatura++; // Incremento
        }
               
        JOptionPane.showMessageDialog(null, mensagem);
    }
}


