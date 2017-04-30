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
public class Caballo extends Piezas{
     public Caballo(boolean colorcito) {

//       super.hcolor(colorcito);
        super.setColor(colorcito);
        if (colorcito) {
            super.setforma('♘');
        } else {
            super.setforma('♞');
        }

    }
     public boolean mov(int a, int b, int a1, int b1) {
        if (Math.abs(a-a1) == Math.abs(2) && Math.abs(b-b1) == Math.abs(1) ||  Math.abs(a-a1)== Math.abs(1) && Math.abs(b-b1) == Math.abs(2)){
            return true;
        }
         
         
        return false;
     }
    
    
}
