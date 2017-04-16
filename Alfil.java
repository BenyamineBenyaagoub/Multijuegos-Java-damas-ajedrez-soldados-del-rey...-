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
    public boolean mov(int a, int b, int a1, int b1) {
        if (estorbo(a,b,a1,b1)) {
            System.out.println("algo raro");
            return false;
         
        } 
         
        if ( Math.abs( b-b1)== Math.abs(a-a1 )) {
            return true;
        }
        
        return false;
    }
    public static boolean estorbo(int a, int b, int a1, int b1){
//        if (Math.abs(b-b1) == Math.abs(a-a1) && a <  a1 && b < b1) {
//            for (int i = 1; i < a1-a ; i++) {
//                if (Tabla.misCasillas[a+i][b+i].cont != null) {
//                    return true;
//                }
//            }
//            funciona
//        }
          if (Math.abs(b-b1) == Math.abs(a-a1) && a > a1 && b > b1) {
            for (int i = -1 ; i > a1-a ; i--) {
                if (Tabla.misCasillas[a+i][b+i].cont != null) {
                    return true;
                }
            }
            
        }
        return false;
    }
}
