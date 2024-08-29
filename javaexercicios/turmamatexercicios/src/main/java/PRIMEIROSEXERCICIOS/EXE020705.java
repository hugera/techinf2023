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
public class EXE020705 {
    public class CalculaDistancia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita as coordenadas do primeiro ponto
        System.out.println("Digite as coordenadas (X,Y) do primeiro ponto:");
        System.out.print("X1: ");
        float x1 = scanner.nextFloat();
        System.out.print("Y1: ");
        float y1 = scanner.nextFloat();

        // Solicita as coordenadas do segundo ponto
        System.out.println("Digite as coordenadas (X,Y) do segundo ponto:");
        System.out.print("X2: ");
        float x2 = scanner.nextFloat();
        System.out.print("Y2: ");
        float y2 = scanner.nextFloat();

        // Calcula a distância entre os pontos
        float distancia = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Exibe a distância entre os pontos
        System.out.println("A distância entre os pontos é: " + distancia);

        scanner.close();
    }
}
}
