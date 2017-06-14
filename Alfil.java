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
                if (!Tabla.misCasillas[a + i][b + i].noTienePieza()) {
                    return true;
                }
            }
        }
        if (Math.abs(b - b1) == Math.abs(a - a1) && a > a1 && b > b1) {
            for (int i = -1; i > a1 - a; i--) {
                if (!Tabla.misCasillas[a + i][b + i].noTienePieza()) {
                    return true;
                }
            }
        }
        if (b + a == b1 + a1) {
            System.out.println("entra");
            int j = b;
            int k = a;

            for (int i = a + 1; i > a1; i++) {
                j--;
                if (Tabla.misCasillas[i][j].noTienePieza() || !Tabla.misCasillas[j][i].noTienePieza()) {
                    System.out.println("lo es");
                    return true;
                }
            }
            for (int i = b - 1; i > b1; i--) {
                k++;
                if (!Tabla.misCasillas[i][k].noTienePieza() || !Tabla.misCasillas[k][i].noTienePieza()) {
                    System.out.println("lo es");
                    return true;
                }
            }
        }
        return false;

    }
}
