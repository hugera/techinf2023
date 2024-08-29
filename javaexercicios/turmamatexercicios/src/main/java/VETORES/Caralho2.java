
// Só Concatenando


package VETORES;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class Caralho2 {
 
    public static void main(String[] args) {
        int numPessoas = 3; 
        String[] nomes = new String[numPessoas];
        double[] pesos = new double[numPessoas];
        double[] alturas = new double[numPessoas];
        double[] imc = new double[numPessoas];
        
        int contAbaixo = 0, contIdeal = 0, contLeve = 0, contOb1 = 0, contOb2 = 0, contOb3 = 0;
        double somaIMCAbaixo = 0, somaIMCIdeal = 0, somaIMCLeve = 0, somaIMCOb1 = 0, somaIMCOb2 = 0, somaIMCOb3 = 0;
        double maiorPesoAbaixo = -1, menorPesoAbaixo = 1000;
        double maiorPesoIdeal = -1, menorPesoIdeal = 1000;
        double maiorPesoLeve = -1, menorPesoLeve = 1000;
        double maiorPesoOb1 = -1, menorPesoOb1 = 1000;
        double maiorPesoOb2 = -1, menorPesoOb2 = 1000;
        double maiorPesoOb3 = -1, menorPesoOb3 = 1000;

        for (int i = 0; i < numPessoas; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome:");
            pesos[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso:"));
            alturas[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura:"));
            imc[i] = pesos[i] / (alturas[i] * alturas[i]);

            if (imc[i] < 18.5) {
                contAbaixo++;
                somaIMCAbaixo += imc[i];
                if (pesos[i] > maiorPesoAbaixo) maiorPesoAbaixo = pesos[i];
                if (pesos[i] < menorPesoAbaixo) menorPesoAbaixo = pesos[i];
            } 
            else if (imc[i] >= 18.5 && imc[i] < 25) {
                contIdeal++;
                somaIMCIdeal += imc[i];
                if (pesos[i] > maiorPesoIdeal) maiorPesoIdeal = pesos[i];
                if (pesos[i] < menorPesoIdeal) menorPesoIdeal = pesos[i];
            }
            else if (imc[i] >= 25 && imc[i] < 30) {
                contLeve++;
                somaIMCLeve += imc[i];
                if (pesos[i] > maiorPesoLeve) maiorPesoLeve = pesos[i];
                if (pesos[i] < menorPesoLeve) menorPesoLeve = pesos[i];
            } 
            else if (imc[i] >= 30 && imc[i] < 35) {
                contOb1++;
                somaIMCOb1 += imc[i];
                if (pesos[i] > maiorPesoOb1) maiorPesoOb1 = pesos[i];
                if (pesos[i] < menorPesoOb1) menorPesoOb1 = pesos[i];
            }
            else if (imc[i] >= 35 && imc[i] < 40) {
                contOb2++;
                somaIMCOb2 += imc[i];
                if (pesos[i] > maiorPesoOb2) maiorPesoOb2 = pesos[i];
                if (pesos[i] < menorPesoOb2) menorPesoOb2 = pesos[i];
            } 
            else {
                contOb3++;
                somaIMCOb3 += imc[i];
                if (pesos[i] > maiorPesoOb3) maiorPesoOb3 = pesos[i];
                if (pesos[i] < menorPesoOb3) menorPesoOb3 = pesos[i];
            }
        }

        String resultado = "Resultados:\n";
        resultado += "Total de pessoas: " + numPessoas + "\n";

        if (contAbaixo > 0) {
            resultado += "Abaixo do peso: " + contAbaixo + "\n";
            resultado += "Maior peso abaixo do peso: " + maiorPesoAbaixo + "\n";
            resultado += "Menor peso abaixo do peso: " + menorPesoAbaixo + "\n";
            resultado += "Média IMC abaixo do peso: " + (somaIMCAbaixo / contAbaixo) + "\n";
        } else {
            resultado += "Não houve pessoas abaixo do peso!\n";
        }

        if (contIdeal > 0) {
            resultado += "Peso ideal: " + contIdeal + "\n";
            resultado += "Maior peso ideal: " + maiorPesoIdeal + "\n";
            resultado += "Menor peso ideal: " + menorPesoIdeal + "\n";
            resultado += "Média IMC peso ideal: " + (somaIMCIdeal / contIdeal) + "\n";
        } else {
            resultado += "Não houve pessoas com peso ideal!\n";
        }

        if (contLeve > 0) {
            resultado += "Levemente acima do peso: " + contLeve + "\n";
            resultado += "Maior peso levemente acima do peso: " + maiorPesoLeve + "\n";
            resultado += "Menor peso levemente acima do peso: " + menorPesoLeve + "\n";
            resultado += "Média IMC levemente acima do peso: " + (somaIMCLeve / contLeve) + "\n";
        } else {
            resultado += "Não houve pessoas levemente acima do peso!\n";
        }

        if (contOb1 > 0) {
            resultado += "Obesidade grau 1: " + contOb1 + "\n";
            resultado += "Maior peso obesidade grau 1: " + maiorPesoOb1 + "\n";
            resultado += "Menor peso obesidade grau 1: " + menorPesoOb1 + "\n";
            resultado += "Média IMC obesidade grau 1: " + (somaIMCOb1 / contOb1) + "\n";
        } else {
            resultado += "Não houve pessoas com obesidade grau 1!\n";
        }

        if (contOb2 > 0) {
            resultado += "Obesidade grau 2: " + contOb2 + "\n";
            resultado += "Maior peso obesidade grau 2: " + maiorPesoOb2 + "\n";
            resultado += "Menor peso obesidade grau 2: " + menorPesoOb2 + "\n";
            resultado += "Média IMC obesidade grau 2: " + (somaIMCOb2 / contOb2) + "\n";
        } else {
            resultado += "Não houve pessoas com obesidade grau 2!\n";
        }

        if (contOb3 > 0) {
            resultado += "Obesidade grau 3: " + contOb3 + "\n";
            resultado += "Maior peso obesidade grau 3: " + maiorPesoOb3 + "\n";
            resultado += "Menor peso obesidade grau 3: " + menorPesoOb3 + "\n";
            resultado += "Média IMC obesidade grau 3: " + (somaIMCOb3 / contOb3) + "\n";
        } else {
            resultado += "Não houve pessoas com obesidade grau 3!\n";
        }

        double totalObesidade = contOb1 + contOb2 + contOb3;
        resultado += "Total de pessoas obesas: " + totalObesidade + "\n";

        JOptionPane.showMessageDialog(null, resultado);
    }
}


