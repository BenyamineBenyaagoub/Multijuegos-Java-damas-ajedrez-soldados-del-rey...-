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
public class Peon extends Piezas {

    Tabla t;
    Piezas p ;
    public Peon(boolean colorcito) {

//       super.hcolor(colorcito);
        super.setColor(colorcito);
        if (colorcito) {
            super.setforma('♙');
        } else {
            super.setforma('♟');
        }

    }

    
    public  boolean mov(int a, int b, int c, int d) {

            if (super.movimientos == 0 && c - a == 2 && d - b == 0 || c - a == 1 && d - b == 0) {
                return true;
            }
        movimientoComer(a,b,c,d);
        
        return false;
    }
    public static boolean movimientoComer(int a, int b, int c, int d){
        Tabla t = new Tabla();
        if (t.misCasillas[c][d].cont.getcolor()==true && c - a == 1 && d - b == -1 || d - b == 1) {
            
            System.out.println("sadsafsadsd");
            return true;
        }
        return false;
    }
}
