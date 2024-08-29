/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SE_ENTAO;

import javax.swing.JOptionPane;

/**
 *
 * @author hugao
 */
public class Verificar_IMC {
    public static void main(String[] args) {
        
        float peso, altura;
              
        peso = Float.parseFloat(JOptionPane.showInputDialog("Digite seu peso em kg:"));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura em metros:"));
        
        // Calcula o IMC
        float imc = peso / (altura * altura);
        
        // Determina a faixa de peso
        
        String faixaPeso;
        if (imc < 18.5) {
            faixaPeso = "abaixo do peso";
        } else if (imc >= 18.5 && imc < 25) {
            faixaPeso = "peso normal";
        } else if (imc >= 25 && imc < 30) {
            faixaPeso = "sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            faixaPeso = "obesidade grau I";
        } else if (imc >= 35 && imc < 40) {
            faixaPeso = "obesidade grau II";
        } else {
            faixaPeso = "obesidade grau III";
        }
        
        JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc + "\nVocê está na faixa de peso: " + faixaPeso);
    }
}

