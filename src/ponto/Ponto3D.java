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
public class Ponto3D extends Ponto{
    int z;
    public Ponto3D (int x, int y, int z)   {
        super(x,y); // chama o construtor Ponto(x, y)
        this.z = z;
    }
    
    public Ponto3D () {
        this (-1, -1, -1);
    }
    
    public void printPonto3D(){
        super.print();
        System.out.println(","+z);
    }
    
    public void print ( )     {
        System.out.println ("\nMétodo print da classe Ponto3D");
        super.print ( ); System.out.print (", "+z);
    }

}