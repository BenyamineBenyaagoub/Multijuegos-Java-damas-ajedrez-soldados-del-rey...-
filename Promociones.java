/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeAjedrez;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Promociones implements Serializable {

    public static void ascention() {
        ascentionPeon();
        ascentionDama();
    }

    public static void ascentionPeon() {

        for (int i = 0; i < 6; i++) {
            if (Tabla.misCasillas[7][i].getchar() == '♟') {
                cambio(false, 7, i);
                
            }
            if (Tabla.misCasillas[0][i].getchar() == '♙') {
                cambio(true, 0, i);

            }
        }

    }

    public static void ascentionDama() {
        DamaDoble dBlanca = new DamaDoble(false);
        DamaDoble dNegra = new DamaDoble(true);
        for (int i = 0; i < 6; i++) {
            if (Tabla.misCasillas[0][i].getchar() == '◙') {

                Tabla.misCasillas[0][i].setCont(dNegra);
                Tabla.misCasillas[0][i].setChar('⛃');
            }
            if (Tabla.misCasillas[7][i].getchar() == '◎') {
                Tabla.misCasillas[7][i].setCont(dBlanca);
                Tabla.misCasillas[7][i].setChar('⛃');
            }
        }

    }

    public static void cambio(boolean e, int fila, int columna) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a que pieza quieres cambiar?");
        System.out.println("1: Alfil");
        System.out.println("2: Dama");
        System.out.println("3: Torre");
        System.out.println("4: Caballo");
        int eleccion = sc.nextInt();
        switch (eleccion) {
            case 1:
                Piezas alfil = new Alfil(e);

                Tabla.misCasillas[alfil.posiciony(fila)][alfil.posicionx(columna)].setCont(alfil);
                Tabla.misCasillas[alfil.posiciony(fila)][alfil.posicionx(columna)].setChar(alfil.forma);
                break;
            case 2:
                Piezas dama = new Dama(e);
                Tabla.misCasillas[dama.posiciony(fila)][dama.posicionx(columna)].setCont(dama);
                Tabla.misCasillas[dama.posiciony(fila)][dama.posicionx(columna)].setChar(dama.forma);
                break;
            case 3:
                Piezas torre = new Torre(e);
                Tabla.misCasillas[torre.posiciony(fila)][torre.posicionx(columna)].setCont(torre);
                Tabla.misCasillas[torre.posiciony(fila)][torre.posicionx(columna)].setChar(torre.forma);
                break;
            case 4:
                Piezas caballo = new Caballo(e);

                Tabla.misCasillas[caballo.posiciony(fila)][caballo.posicionx(columna)].setCont(caballo);
                Tabla.misCasillas[caballo.posiciony(fila)][caballo.posicionx(columna)].setChar(caballo.forma);

                break;
        }

    }

}
