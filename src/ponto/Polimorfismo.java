/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ponto;

/**
 *
 * @author JBP1996 Atec
 */
public class Polimorfismo {
    
    public static void main (String args []) { Ponto p1 = new Ponto (1,1);
        Ponto p2 = new Ponto3D (2,2,2);
        p1.print ();
        p2.print ();
    }
}
