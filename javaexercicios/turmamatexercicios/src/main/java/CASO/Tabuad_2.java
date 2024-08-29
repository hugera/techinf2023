/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CASO;

import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class Tabuad_2 {
    public static void main(String[] args) {
       int Opcao = 0;
       int num = 0;
        
        do {
              Opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções no menu"+
                   "\n1 - Adição"+"\n2 - Subtração"+"\n3 - Multiplicação"+"\n4 - Divisão"+
                   "\n0 - Sair"));
           if(Opcao != 0){
              num = Integer.parseInt(JOptionPane.showInputDialog("Escolha o número para tabuada"));
           }
            
           switch(Opcao){
               
               case 0:
                   JOptionPane.showMessageDialog(null,"Saindo,Tchau!");
                   break;
               case 1:
                  int i=0;
                  String tabuadaA="";
                  while ( i <= 10) { 
                      
                    int resultadoA = num + i;
                    tabuadaA += num + " + " + i + " = " + resultadoA + "\n";
                    i++;
                  }
                  JOptionPane.showMessageDialog(null, "Tabuada de Adição " + num + ":\n" + tabuadaA);
                  break;
               case 2: 
                 i=0;
                 String tabuadaS="";
                  while ( i <= 10) { 
                      
                    int resultadoS= num - i;
                    tabuadaS += num + " - " + i + " = " + resultadoS + "\n";
                    i++;
                  }
                  JOptionPane.showMessageDialog(null, "Tabuada de Subtração " + num + ":\n" + tabuadaS);
                  break; 
               case 3:
                    i=0;
                 String tabuadaM="";
                  while ( i <= 10) { 
                      
                    int resultadoM= num * i;
                    tabuadaM += num + " * " + i + " = " + resultadoM + "\n";
                    i++;
                  }
                  JOptionPane.showMessageDialog(null, "Tabuada de Multiplicação " + num + ":\n" + tabuadaM);
                  break;   
                   
               case 4:
                   i=1;
                 String tabuadaDiv="";
                  while ( i <= 10) { 
                   
                    int resultadoDiv= num / i;
                    tabuadaDiv += num + " / " + i + " = " + resultadoDiv + "\n";
                    i++;
                 }
                  JOptionPane.showMessageDialog(null, "Tabuada de Divisão " + num + ":\n" + tabuadaDiv);
                  break;    
               default:
                   JOptionPane.showMessageDialog(null, "Opção inválida...");
                   break;        
           }
           
        }while (Opcao != 0);
    }
}


