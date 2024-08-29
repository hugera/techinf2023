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
public class concessionaria_ {
    public static void main (String [] args ) {
        
        int idveiculo = Integer.parseInt(JOptionPane.showInputDialog ("Informe o idveiculo: "));
        String fabricante = JOptionPane.showInputDialog ("Informe o Fabricante: ");
        String modelo = JOptionPane.showInputDialog ("Informe o Modelo: ");
        String cor = JOptionPane.showInputDialog ("Informe a cor do veículo: ");
        int anofab = Integer.parseInt(JOptionPane.showInputDialog ("Informe o ano de Fabircação: "));
        String placa = JOptionPane.showInputDialog ("Informe a Placa do Veículo: ");
        
        JOptionPane.showMessageDialog (null,"idveiculo: "+idveiculo+"\nfabricante: "+fabricante+"\nmodelo: "+
                modelo+"\n cor: "+cor+"\n anofab: "+anofab+"\n placa: "+placa) ;
    }
}
