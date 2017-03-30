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

        int movx[] = new int[8];
        int movy[] = new int[8];
        for (int i = 0; i < 8; i++) {
            movx[i] = i;
            movy[i] = i;

            if (movy[i] == c - a && d - b == 0 || movx[i] == d - b && c - a == 0) {
                System.out.println("toodo ok");
                return true;
            }
        }

        return false;
    }

    public void camino() {
        for (int i = 0; i < 8; i++) {
            if (Tabla.misCasillas[i][0].getCont() == null) {
                Tabla.misCasillas[i][0].setChar('#');
        //        Tabla.misCasillas[-i][0].setChar('#');
         //       Tabla.misCasillas[0][i].setChar('#');
       //         Tabla.misCasillas[0][-i].setChar('#');
            }
        }

    }
}
