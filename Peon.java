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

    boolean colorcito;

    public Peon(boolean colorcito) {
        this.colorcito = colorcito;
        super.setColor(colorcito);
        if (colorcito) {
            super.setforma('♙');
        } else {
            super.setforma('♟');
        }

    }

    public static boolean comerNegras(int a, int b, int c, int d) {

        if (Tabla.misCasillas[c][d].cont != null) {
            if (Tabla.misCasillas[c][d].cont.getcolor() == true && c - a == 1 && d - b == 1) {

                return true;

            }

        }
        return false;
    }

    public static boolean comerblancas(int a, int b, int c, int d) {

        if (Tabla.misCasillas[c][d].cont != null) {
            if (Tabla.misCasillas[c][d].cont.getcolor() == true && c - a == 1 && d - b == 1) {

                return true;

            }

        }
        return false;
    }

    public static boolean noComerDeEnfrente(int a, int b, int c, int d) {

        if (Tabla.misCasillas[c][d].cont != null) {

            if (Tabla.misCasillas[c][d].cont.getcolor() == true && c - a == 1 && d - b == 0) {

                return true;

            }

        }
        return false;
    }

    public static boolean noComerDeEnfrenteB(int a, int b, int c, int d) {

        if (Tabla.misCasillas[c][d].cont != null) {

            if (Tabla.misCasillas[c][d].cont.getcolor() == true && c - a == -1 && d - b == 0) {

                return true;

            }

        }
        return false;
    }

    public boolean mov(int a, int b, int c, int d) {
        if (colorcito) {

            if (super.movimientos == 0 && c - a == -2 && d - b == 0 || c - a == -1 && d - b == 0) {
                return true;
            }

        } else {

            if (comerNegras(a, b, c, d)) {
                return true;
            }

            if (noComerDeEnfrente(a, b, c, d)) {
                return false;
            }

            if (super.movimientos == 0 && c - a == 2 && d - b == 0 || c - a == 1 && d - b == 0) {
                return true;
            }

        }
        return false;
    }

}
