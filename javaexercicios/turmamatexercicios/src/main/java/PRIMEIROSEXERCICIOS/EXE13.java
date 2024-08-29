/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRIMEIROSEXERCICIOS;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class EXE13 {
     public static void main(String args []){
        int Soma=0,Num=0,Num2=0;
        //entrada dos dados através do JOptionPane.showInput com conversão Integer.parseInt
        Num = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: "));
        Num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "));
        
        //a matemática da soma
        Soma = Num + Num2;
        //a saída dos dados através do JOptionPane.showMessage
        JOptionPane.showMessageDialog(null,"O resultado da soma: "+Soma);
        
        /*As conversões de String para números
        Long.parseLong(s);
        Byte.parseByte(s);
        Integer.parseInt(s);
        Short.parseShort(s);
        Float.parseFloat(s);
        Double.parseDouble(s);
        Boolean.parseBoolean(s);
        */
        
     }
}

