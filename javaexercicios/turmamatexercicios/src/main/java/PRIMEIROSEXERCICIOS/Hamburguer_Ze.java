/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRIMEIROSEXERCICIOS;

import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class Hamburguer_Ze {
    
/*
   4. Uma lanchonete serve os seguintes produtos com os 
respectivos preços:
•	X burguer	R$ 2,50
•	X frango	R$ 2,00
•	X salada	R$ 1,50
•	Batata frita	R$ 0,80
•	Sucos	        R$ 0,90
•	Refrigerantes	R$ 1,20
Faça um algoritmo que leia as quantidades de cada um dos 
itens acima de um determinado cliente, calcule e escreva 
o valor total do pedido.
*/

public class Exe02040704 {
  
    public static void main(String[] args) {
        float Xburguer= 0f; //R$ 2,50
	float Xfrango = 0f;	//R$ 2,00
	float Xsalada	= 0f;//R$ 1,50
	float Batatafrita = 0f;//R$ 0,80
	float Sucos = 0f;//R$ 0,90
	float Refrigerantes = 0f; //R$ 1,20
        float Total = 0f;
        int Quant = 0;
        
        Quant = Integer.parseInt(JOptionPane.showInputDialog("Informar a Quantidade de Xburguer: "));
        Xburguer = Quant * 2.5f;
        Quant = Integer.parseInt(JOptionPane.showInputDialog("Informar a Quantidade de Xfrango: "));
        Xfrango = Quant * 2F;
        Quant = Integer.parseInt(JOptionPane.showInputDialog("Informar a Quantidade de Xsalada: "));
        Xsalada = Quant * 1.5f;
        Quant = Integer.parseInt(JOptionPane.showInputDialog("Informar a Quantidade de Batatafrita: "));
        Batatafrita = Quant * 0.80f;
        Quant = Integer.parseInt(JOptionPane.showInputDialog("Informar a Quantidade de Suco: "));
        Sucos = Quant * 0.90f;
        Quant = Integer.parseInt(JOptionPane.showInputDialog("Informar a Quantidade de Refrigerante: "));
        Refrigerantes = Quant * 1.2f;
        Total =  Xburguer+Xfrango+Xsalada+Batatafrita+Sucos+Refrigerantes;
        JOptionPane.showConfirmDialog(null,"O Total do lanche: R$ "+Total);
        
    }
}
}
