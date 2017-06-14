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
public class InArray {
     public static boolean inArray(int y, int x, int length) {
        if (x < length && y >= 0 && y < length && x >= 0) {
            return true;
        }
        return false;
    }
      public static boolean segundoSaltoNe(int a, int b, boolean piezaQuitar, char piezaPoner) {
        for (int i = 0; i < 4; i++) {

            int[] aa = {1, 1, -1, -1};
            int[] bb = {-1, 1, +1, -1};
            int[] aa1 = {2, 2, -2, -2};
            int[] bb1 = {-2, 2, 2, -2};

            switch (i) {
                case 1:
                    if (b <= 1 || a >= 6) {

                        return false;
                    }
                case 2:
                    if (b >= 6 || a >= 6) {

                        return false;
                    }
                case 3:
                    if (b >= 7 || a <= 1) {
                        return false;
                    }

                case 4:
                    if (b <= 2 || a <= 1) {
                        return false;
                    }

            }
            if (Tabla.misCasillas[a + aa[i]][b + bb[i]].cont != null) {
                if (Tabla.misCasillas[a + aa1[i]][b + bb1[i]].cont == null && Tabla.misCasillas[a + aa[i]][b + bb[i]].cont.getcolor() == piezaQuitar) {
                    
                    if (Tabla.misCasillas[a][b].cont instanceof Dama) {
                        Dama.segunndomov(a, b, piezaPoner);
                    }else if(Tabla.misCasillas[a][b].cont instanceof DamaDoble){
                        DamaDoble.segunndomov(a, b, piezaPoner);
                    }
                    
                    
                    return true;
                }
            }
        }
        return false;
    }

}
