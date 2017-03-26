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
public class Rey extends Piezas {

    public Rey(boolean colorcito) {

        super.setColor(colorcito);
        if (colorcito) {
            super.setforma('♕');
        } else {
            super.setforma('♛');
        }

    }
}
