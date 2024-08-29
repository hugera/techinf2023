package OBJETOS;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EXE_ARRAY {
    
    public static void main (String [] args) {
        
        ArrayList <Integer> Num;
        Num = new ArrayList();
        
        Num.add(5);
        Num.add(8);
        Num.add(0);
        Num.add(4);
        
        Num.add(3,6);
        Num.set(0,9); 
       
        JOptionPane.showMessageDialog(null,Num.contains(8));
        JOptionPane.showMessageDialog(null,Num.size());
       
        
    }
}
