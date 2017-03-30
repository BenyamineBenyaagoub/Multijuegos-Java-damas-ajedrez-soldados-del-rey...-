/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeAjedrez;

/**
 *
 * @author Javier
 */
public class Alfil extends Piezas{
    
     public Alfil(boolean colorcito) {

        super.setColor(colorcito);
        if (colorcito) {
            super.setforma('♗');
        } else {
            super.setforma('♝');
        }

    }
    
}
