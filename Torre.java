/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeAjedrez;

/**
 *
 * @author ibra
 */
public class Torre extends Piezas{
      public Torre(boolean colorcito) {

        super.setColor(colorcito);
        if (colorcito) {
            super.setforma('♖');
        } else {
            super.setforma('♜');
        }

    }
    int  movCaballo[][]= new int [2][8];
    
    public  boolean mov(int a, int b, int c, int d) {
        
        return false;
    }
}
