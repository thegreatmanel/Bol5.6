/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg6;

import javax.swing.JOptionPane;

/**
 *
 * @author propa
 */
public class Boletin56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Ventas venta1=new Ventas();
        double n1=Double.parseDouble(JOptionPane.showInputDialog("Introduzca o número de artigos vendidos"));
        venta1.amosar(n1);
    }
    
}
