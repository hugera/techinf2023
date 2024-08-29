/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package REPITA;

import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class Soma_Inteiros {
       public static void main(String[] args) {
    
      float Num=0f,Soma=0f;
      int Cont=0,Quant=0;
      Quant=Integer.parseInt(JOptionPane.showInputDialog("Informe o Limite:"));
     
      do{
          Num=Float.parseFloat(JOptionPane.showInputDialog("Informe o número:"));
          Soma += Num; //Soma = Soma + Num
          Cont++; //Cont = Cont + 1 ou Cont += 1
          
          
      }while(Cont != Quant);
       JOptionPane.showMessageDialog(null,"O Resultado da soma: "+Soma);
      
    }  
}

