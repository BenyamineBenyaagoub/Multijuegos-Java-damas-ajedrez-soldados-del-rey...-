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

    public boolean mov(int a, int b, int a1, int b1) {

        if (Math.abs(1) == Math.abs(a1 - a) || a1 - a == 0) {
            if (Math.abs(1) == Math.abs(b1 - b) || b1 - b == 0) {
                return true;
            }
        }
        return false;
    }

//    public static boolean obstaculo(int a, int b, int a1, int b1) {
//
//        if (a == a1) {
//            if (b < b1) {
//                for (int i = b + 1; i < b1; i++) {
//                    if (Tabla.misCasillas[a][i].cont != null) {
//                        return true;
//                    }
//
//                }
//            }
//            if (b > b1) {
//                for (int i = b1 + 1; i < b; i++) {
//                    if (Tabla.misCasillas[a][i].cont != null) {
//                        return true;
//                    }
//
//                }
//            }
//        }
//
//        if (a != a1) {
//            if (a < a1) {
//                for (int i = a + 1; i < a1; i++) {
//                    if (Tabla.misCasillas[i][b].cont != null) {
//                        return true;
//                    }
//
//                }
//            }
//            if (a > a1) {
//                for (int i = a1 + 1; i < a; i++) {
//                    if (Tabla.misCasillas[i][b].cont != null) {
//                        return true;
//                    }
//
//                }
//            }
//        }
//        return false;
//        }
}
