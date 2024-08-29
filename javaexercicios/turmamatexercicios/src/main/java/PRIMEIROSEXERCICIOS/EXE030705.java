/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRIMEIROSEXERCICIOS;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class EXE030705 {
      public static void main(String[] args) {
          // Solicita os comprimentos dos três lados do triângulo
          try (Scanner scanner = new Scanner(System.in)) {
              // Solicita os comprimentos dos três lados do triângulo
              System.out.println("Digite o comprimento do lado 1 do triângulo:");
              float lado1 = scanner.nextFloat();
              System.out.println("Digite o comprimento do lado 2 do triângulo:");
              float lado2 = scanner.nextFloat();
              System.out.println("Digite o comprimento do lado 3 do triângulo:");
              float lado3 = scanner.nextFloat();
              
              // Calcula o perímetro do triângulo
              float perimetro = lado1 + lado2 + lado3;
              
              // Calcula a semi-perímetro para usar na fórmula da área
              float semiPerimetro = perimetro / 2;
              
              // Calcula a área do triângulo usando a fórmula de Heron
              double area = Math.sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));
              
              // Exibe o perímetro e a área do triângulo
              System.out.println("O perímetro do triângulo é: " + perimetro);
              System.out.println("A área do triângulo é: " + area);
          }
    }
}

