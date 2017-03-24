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
public class Ponto {

    /**
     * @param args the command line arguments
     */
    
    int x, y;
    public Ponto (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Ponto ( ) {
        this (-1, -1); // this também pode ser usado para chamar construtores
    }
    public void print ( ){
        System.out.print (x +", "+ y);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Ponto3D p3= new Ponto3D();
        p3.printPonto3D();
        // Vai chamar o print de Ponto3D e não o de Ponto
        p3.print();
    }   
}
