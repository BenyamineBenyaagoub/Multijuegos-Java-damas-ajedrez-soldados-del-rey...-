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
public class Reina extends Piezas {
    public Reina(boolean colorcito) {

        super.setColor(colorcito);
        if (colorcito) {
            super.setforma('♔');
        } else {
            super.setforma('♚');
        }

    }
     public boolean mov(int a, int b, int a1, int b1) {
    
          int movx[] = new int[8];
        int movy[] = new int[8];
        for (int i = 0; i < 8; i++) {
            movx[i] = i;
            movy[i] = i;

            if (movy[i] == a1 - a && b1 - b == 0 || movx[i] == b1 - b && a1 - a == 0) {
                System.out.println("toodo ok");
                return true;
            }

            if (a != a1) {
                if (b1 - b == 0) {
                    return true;
                }
            }
            if (a == a1) {
                if (a1 - a == 0) {
                    return true;
                }

            }
        }
        if ( Math.abs( b-b1)== Math.abs(a-a1 )) {
            return true;
        }
        
        if (Math.abs(b-b1) == Math.abs(a-a1) && a <  a1 && b < b1) {
            for (int i = 1; i < a1-a ; i++) {
                if (Tabla.misCasillas[a+i][b+i].cont != null) {
                    return true;
                }
            }
           
        }
          if (Math.abs(b-b1) == Math.abs(a-a1) && a > a1 && b > b1) {
            for (int i = -1 ; i > a1-a ; i--) {
                if (Tabla.misCasillas[a+i][b+i].cont != null) {
                    return true;
                }
            }
            
        }
        return false;
     }
     //FALTA OBSTACULO!
     }

