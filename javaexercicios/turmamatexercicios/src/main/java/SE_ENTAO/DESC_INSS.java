/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SE_ENTAO;

import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class DESC_INSS {
     public static void main(String[] args) {
      
      float SalBruto = Float.parseFloat(JOptionPane.showInputDialog("Informe o salário: "));
      float DescINSS;
      
      final float Lim1 = 1412f;
      final float Lim2 = 2666.68f;
      final float Lim3 = 4000.03f;
      final float Lim4 = 7786.02f;
      final float UltLim = 1090.04f;
      final float Tx1 = 0.095f;
      final float Tx2 = 0.11f;
      final float Tx3 = 0.14f;
      final float Tx4 = 0.20f;
      final float Ded1 = 21.18f;
      final float Ded2 = 108.18f;
      final float Ded3 = 181.18f;           
        
      if (SalBruto <= Lim1){
          DescINSS = SalBruto * Tx1;
      }else if (SalBruto <= Lim2){
          DescINSS = SalBruto * Tx2 - Ded1;
      }else if (SalBruto <= Lim3){
          DescINSS = SalBruto * Tx3 - Ded2;
      }else if (SalBruto <= Lim4){
          DescINSS = SalBruto * Tx4 - Ded3;
      }else{
          DescINSS = SalBruto * UltLim;
      }
      
      JOptionPane.showMessageDialog(null,"Salário: R$"+SalBruto+
              "\nDesconto: R$"+DescINSS);
    }
    
}


