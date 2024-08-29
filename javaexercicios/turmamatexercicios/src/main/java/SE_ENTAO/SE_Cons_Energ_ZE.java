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
public class SE_Cons_Energ_ZE {
    public static void main (String [] args) {
        
        String Usuario="";
        final float TXRESID = 0.871f;
        final float TXCOM = 0.999f;
        int NumUsuario = 0;
        float GastoKw = 0f,TotalPagar = 0f;
        int TipoUsuario = 0;
        String TipoUs = "";
        
        Usuario = JOptionPane.showInputDialog("Informe o nome usuário: ");
        NumUsuario = Integer.parseInt(JOptionPane.showInputDialog("Informe o n° do usuário: "));
        GastoKw = Float.parseFloat(JOptionPane.showInputDialog("Informe o gasto em Kw: "));
        TipoUsuario = Integer.parseInt(JOptionPane.showInputDialog("Informe 1 para Residencial "
        +"e 2 para Comercial"));
        
        if(TipoUsuario == 1) {
            TipoUs = "Residencial";
            TotalPagar = GastoKw * TXRESID;
        }else if(TipoUsuario == 2){
            TipoUs = "Comercial";
            TotalPagar = GastoKw * TXCOM;
        }else{
            JOptionPane.showMessageDialog(null,"Informe se é 1 para Residencial ou "+
                    "2 para Comercial.");
        }
        
        if (TipoUsuario == 1 || TipoUsuario == 2) {
            
            JOptionPane.showMessageDialog(null,"Nome do usuário:"+Usuario+"\nNúmero do usuário:"+
                    NumUsuario+"\nTipo de usuário:"+TipoUs+"\nGasto do Kw/h:"+GastoKw+
                    "\nTotal a Pagar:"+TotalPagar);
            
            
        }
    }
           
        
             
        
}
