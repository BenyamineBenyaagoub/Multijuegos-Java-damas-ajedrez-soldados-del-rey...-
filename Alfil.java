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
public class Alfil extends Piezas {

    public Alfil(boolean colorcito) {

        super.setColor(colorcito);
        if (colorcito) {
            super.setforma('♗');
        } else {
            super.setforma('♝');
        }

    }

    public boolean mov(int a, int b, int a1, int b1) {
        if (estorboAlfil(a, b, a1, b1)) {
            System.out.println("algo raro");
            return false;

        }

        if (Math.abs(b - b1) == Math.abs(a - a1)) {
            return true;
        }

        return false;
    }

    public static boolean estorboAlfil(int a, int b, int a1, int b1) {
        if (Math.abs(b - b1) == Math.abs(a - a1) && a < a1 && b < b1) {
            for (int i = 1; i < a1 - a; i++) {
                if (Tabla.misCasillas[a + i][b + i].cont != null) {
                    return true;
                }
            }

        }
        if (Math.abs(b - b1) == Math.abs(a - a1) && a > a1 && b > b1) {
            for (int i = -1; i > a1 - a; i--) {
                if (Tabla.misCasillas[a + i][b + i].cont != null) {
                    return true;
                }
            }

        }
        if (b - b1 > a - a1) {

            for (int i = a1; i > a1 - a; i--) {
                for (int j = b; j < b1 - b; j++) {
                    if (Tabla.misCasillas[i][j].cont != null) {
                        return true;
                    }
                    if (Tabla.misCasillas[j][i].cont != null) {
                        return true;
                    }

                }
            }

        }

        return false;
    }
}
