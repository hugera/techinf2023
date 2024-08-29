package OBJETOS;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EXEArray2 {
    
    public static void main(String[] args) {
        
        ArrayList<FORNECEDOR_> Listaf = new ArrayList<>();
        
        for(int i=0;i<2;i++){
            
            FORNECEDOR_ f = new FORNECEDOR_();
            
            f.setNome_Fornecedor(JOptionPane.showInputDialog("Informe o Nome_Fornecedor: "));
            f.setCNPJ(Long.parseLong(JOptionPane.showInputDialog("Informe o CNPJ: ")));
            f.setTelefone(Float.parseFloat(JOptionPane.showInputDialog("Informe o Telefone: ")));
            Listaf.add(f);
         
        }
        
        for(int i=0;i<2;i++){
       
            JOptionPane.showMessageDialog(null,"Nome_Fornecedor "+i+": "+Listaf.get(i).getNome_Fornecedor()+"\nCNPJ: "+
               Listaf.get(i).getCNPJ()+"\nTelefone: "+Listaf.get(i).getTelefone());
    }
    
}

}