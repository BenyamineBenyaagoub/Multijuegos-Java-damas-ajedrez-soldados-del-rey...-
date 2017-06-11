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
public class Torre extends Piezas {

    public Torre(boolean colorcito) {

        super.setColor(colorcito);
        if (colorcito) {
            super.setforma('♖');
        } else {
            super.setforma('♜');
        }

    }

    public boolean mov(int a, int b, int c, int d) {
        if (obstaculoTorre(a, b, c, d)) {

            return false;
        }
        int movx[] = new int[8];
        int movy[] = new int[8];
        for (int i = 0; i < 8; i++) {
            movx[i] = i;
            movy[i] = i;

            if (movy[i] == c - a && d - b == 0 || movx[i] == d - b && c - a == 0) {
                
                return true;
            }

            if (a != c) {
                if (d - b == 0) {
                    return true;
                }
            }
            if (a == c) {
                if (c - a == 0) {
                    return true;
                }

            }
        }

        return false;
    }

    public static boolean obstaculoTorre(int a, int b, int a1, int b1) {

        if (a == a1) {
            if (b < b1) {
                for (int i = b + 1; i < b1; i++) {
                    if (Tabla.misCasillas[a][i].cont != null) {
                        return true;
                    }

                }
            }
            if (b > b1) {
                for (int i = b1 + 1; i < b; i++) {
                    if (Tabla.misCasillas[a][i].cont != null) {
                        return true;
                    }

                }
            }
        }

        if (a != a1) {
            if (a < a1) {
                for (int i = a + 1; i < a1; i++) {
                    if (Tabla.misCasillas[i][b].cont != null) {
                        return true;
                    }

                }
            }
            if (a > a1) {
                for (int i = a1 + 1; i < a; i++) {
                    if (Tabla.misCasillas[i][b].cont != null) {
                        return true;
                    }

                }
            }
        }

//        if (a != c) {
//            for (int i = c; i < c - a; i++) {
//                if (Tabla.misCasillas[a + i][d].cont == null) {
//
//                    System.out.println("v");
//                    return true;
//                }
//            }
//            if (a == c) {
//                for (int i = d; i < d - b; i++) {
//                    if (Tabla.misCasillas[c][b + i].cont == null) {
//                        System.out.println("h");
//                        return true;
//                    }
//                }
//            }
//
//        }
        return false;
    }

}
