package OBJETOS;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class EXE3Array {
    
    public static void main(String[] args) {
        
        ArrayList<CLIENTE> Listac = new ArrayList<>();
        
        for(int i=0;i<2;i++){
            
            CLIENTE c = new CLIENTE();
            
            c.setNome(JOptionPane.showInputDialog("Informe o Nome: "));
            c.setTelefone(Float.parseFloat(JOptionPane.showInputDialog("Informe o Telefone: ")));
            c.setRG(Integer.parseInt(JOptionPane.showInputDialog("Informe o RG: ")));
            Listac.add(c);
         
        }
        
       JOptionPane.showMessageDialog(null,"Nome: 1"+Listac.get(0).getNome()+"\nNome2: "+
               Listac.get(1).getNome());
       JOptionPane.showMessageDialog(null,"Telefone: 1"+Listac.get(0).getTelefone()+"\ntelefone2: "+
               Listac.get(1).getTelefone());
       JOptionPane.showMessageDialog(null,"RG: 1"+Listac.get(0).getRG()+"\nRG2: "+
               Listac.get(1).getRG());
    
    
    }
    
    
} 

