//STRINGBUILDER é uma classe em Java que facilita a criação e manipulação de strings de maneira eficiente.
//Operações intensivas de manipulação de strings, como a construção de 
//grandes textos ou a concatenação repetida em loops, o StringBuilder é muito mais eficiente 
//do que a concatenação de strings.

//     **************************************************************************************  //

//APPEND é usado para construir a string resultado de forma eficiente, conforme os dados são processados. 
//Cada chamada a append adiciona mais informação ao StringBuilder
//A função principal do método append no StringBuilder é fornecer uma maneira eficiente e conveniente 
//de construir strings longas ou realizar muitas concatenações, melhorando tanto a performance 
//quanto a legibilidade do código em comparação com o uso repetido do operador de concatenação.

//   **************************************************************************************** //

//StringBuilder e o método append são usados para construir uma mensagem que será exibida ao final 
//do processamento dos dados.


package VETORES;

import javax.swing.JOptionPane;


public class Especial_2 {
    
    public static void main(String[] args) {
       
        int numPessoas = 3; 
        String[] nomes = new String[numPessoas];
        double[] pesos = new double[numPessoas];
        double[] alturas = new double[numPessoas];
        double[] imc = new double[numPessoas];
        String[] status = new String[numPessoas];

        double somaPesos = 0;
        double somaIMCAbaixo = 0, somaIMCIdeal = 0, somaIMCLeve = 0;
        double somaIMCOb1 = 0, somaIMCOb2 = 0, somaIMCOb3 = 0;
        int contAbaixo = 0, contIdeal = 0, contLeve = 0;
        int contOb1 = 0, contOb2 = 0, contOb3 = 0;

        double maiorPesoAbaixo = -1, menorPesoAbaixo = Double.MAX_VALUE;
        double maiorPesoIdeal = -1, menorPesoIdeal = Double.MAX_VALUE;
        double maiorPesoLeve = -1, menorPesoLeve = Double.MAX_VALUE;
        double maiorPesoOb1 = -1, menorPesoOb1 = Double.MAX_VALUE;
        double maiorPesoOb2 = -1, menorPesoOb2 = Double.MAX_VALUE;
        double maiorPesoOb3 = -1, menorPesoOb3 = Double.MAX_VALUE;

        for (int i = 0; i < numPessoas; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome: ");
            pesos[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso: "));
            alturas[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: "));
            
            imc[i] = pesos[i] / (alturas[i] * alturas[i]);
            somaPesos += pesos[i];

            if (imc[i] < 18.5) {
                status[i] = "Abaixo do peso";
                contAbaixo++;
                somaIMCAbaixo += imc[i];
                if (pesos[i] > maiorPesoAbaixo) maiorPesoAbaixo = pesos[i];
                if (pesos[i] < menorPesoAbaixo) menorPesoAbaixo = pesos[i];
            } else if (imc[i] >= 18.5 && imc[i] < 25) {
                status[i] = "Peso ideal";
                contIdeal++;
                somaIMCIdeal += imc[i];
                if (pesos[i] > maiorPesoIdeal) maiorPesoIdeal = pesos[i];
                if (pesos[i] < menorPesoIdeal) menorPesoIdeal = pesos[i];
            } else if (imc[i] >= 25 && imc[i] < 30) {
                status[i] = "Levemente acima do peso";
                contLeve++;
                somaIMCLeve += imc[i];
                if (pesos[i] > maiorPesoLeve) maiorPesoLeve = pesos[i];
                if (pesos[i] < menorPesoLeve) menorPesoLeve = pesos[i];
            } else if (imc[i] >= 30 && imc[i] < 35) {
                status[i] = "Obesidade grau 1";
                contOb1++;
                somaIMCOb1 += imc[i];
                if (pesos[i] > maiorPesoOb1) maiorPesoOb1 = pesos[i];
                if (pesos[i] < menorPesoOb1) menorPesoOb1 = pesos[i];
            } else if (imc[i] >= 35 && imc[i] < 40) {
                status[i] = "Obesidade grau 2";
                contOb2++;
                somaIMCOb2 += imc[i];
                if (pesos[i] > maiorPesoOb2) maiorPesoOb2 = pesos[i];
                if (pesos[i] < menorPesoOb2) menorPesoOb2 = pesos[i];
            } else if (imc[i] >= 40) {
                status[i] = "Obesidade grau 3";
                contOb3++;
                somaIMCOb3 += imc[i];
                if (pesos[i] > maiorPesoOb3) maiorPesoOb3 = pesos[i];
                if (pesos[i] < menorPesoOb3) menorPesoOb3 = pesos[i];
            }
        }

        // Exibir resultados
        StringBuilder resultado = new StringBuilder();

        resultado.append("Resultados:\n");
        resultado.append("Total de pessoas: ").append(numPessoas).append("\n");

        if (contAbaixo > 0) {
            resultado.append("Abaixo do peso: ").append(contAbaixo).append("\n");
            resultado.append("Maior peso abaixo do peso: ").append(maiorPesoAbaixo).append("\n");
            resultado.append("Menor peso abaixo do peso: ").append(menorPesoAbaixo).append("\n");
            resultado.append("Média IMC abaixo do peso: ").append(somaIMCAbaixo / contAbaixo).append("\n");
        } else {
            resultado.append("Não houve pessoas abaixo do peso!\n");
        }

        if (contIdeal > 0) {
            resultado.append("Peso ideal: ").append(contIdeal).append("\n");
            resultado.append("Maior peso ideal: ").append(maiorPesoIdeal).append("\n");
            resultado.append("Menor peso ideal: ").append(menorPesoIdeal).append("\n");
            resultado.append("Média IMC peso ideal: ").append(somaIMCIdeal / contIdeal).append("\n");
        } else {
            resultado.append("Não houve pessoas com peso ideal!\n");
        }

        if (contLeve > 0) {
            resultado.append("Levemente acima do peso: ").append(contLeve).append("\n");
            resultado.append("Maior peso levemente acima do peso: ").append(maiorPesoLeve).append("\n");
            resultado.append("Menor peso levemente acima do peso: ").append(menorPesoLeve).append("\n");
            resultado.append("Média IMC levemente acima do peso: ").append(somaIMCLeve / contLeve).append("\n");
        } else {
            resultado.append("Não houve pessoas levemente acima do peso!\n");
        }

        if (contOb1 > 0) {
            resultado.append("Obesidade grau 1: ").append(contOb1).append("\n");
            resultado.append("Maior peso obesidade grau 1: ").append(maiorPesoOb1).append("\n");
            resultado.append("Menor peso obesidade grau 1: ").append(menorPesoOb1).append("\n");
            resultado.append("Média IMC obesidade grau 1: ").append(somaIMCOb1 / contOb1).append("\n");
        } else {
            resultado.append("Não houve pessoas com obesidade grau 1!\n");
        }

        if (contOb2 > 0) {
            resultado.append("Obesidade grau 2: ").append(contOb2).append("\n");
            resultado.append("Maior peso obesidade grau 2: ").append(maiorPesoOb2).append("\n");
            resultado.append("Menor peso obesidade grau 2: ").append(menorPesoOb2).append("\n");
            resultado.append("Média IMC obesidade grau 2: ").append(somaIMCOb2 / contOb2).append("\n");
        } else {
            resultado.append("Não houve pessoas com obesidade grau 2!\n");
        }

        if (contOb3 > 0) {
            resultado.append("Obesidade grau 3: ").append(contOb3).append("\n");
            resultado.append("Maior peso obesidade grau 3: ").append(maiorPesoOb3).append("\n");
            resultado.append("Menor peso obesidade grau 3: ").append(menorPesoOb3).append("\n");
            resultado.append("Média IMC obesidade grau 3: ").append(somaIMCOb3 / contOb3).append("\n");
        } else {
            resultado.append("Não houve pessoas com obesidade grau 3!\n");
        }

        double totalObesidade = contOb1 + contOb2 + contOb3;
        resultado.append("Total de pessoas obesas: ").append(totalObesidade).append("\n");

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
