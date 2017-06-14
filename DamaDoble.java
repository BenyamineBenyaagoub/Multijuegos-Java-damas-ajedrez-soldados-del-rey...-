/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeAjedrez;

import java.util.Scanner;

/**
 *
 * @author ibra
 */
public class DamaDoble extends Piezas {

    public DamaDoble(boolean colorcito) {

        super.setColor(colorcito);
        if (colorcito) {
            super.setforma('B');
        } else {
            super.setforma('N');
        }

    }

    public boolean mov(int a, int b, int a1, int b1) {
        if (comer(a, b, a1, b1)) {

            return true;
        }
        if (Tabla.misCasillas[a][b].cont.getforma() == 'N' || Tabla.misCasillas[a][b].cont.getforma() == 'B') {
            if (Math.abs(a1 - a) == Math.abs(1) && Math.abs(b1 - b) == Math.abs(1)) {
                return true;
            }

        }
        return false;
    }
    public static boolean otra = false;

    public static boolean comer(int a, int b, int a1, int b1) {
        if (Tabla.misCasillas[a][b].cont.getforma() == 'N' || Tabla.misCasillas[a][b].cont.getforma() == 'B') {

            if (Math.abs(a1 - a) == Math.abs(2) && Math.abs(b1 - b) == Math.abs(2)) {
                if (Tabla.misCasillas[a][b].cont.getcolor()) {
                    if (a1 > 7 || b1 > 7 || b1 < 0) {
                        otra = false;
                        return false;
                    }
                } else {
                    if (a1 < 1 || b1 > 7 || b1 < 0) {
                        otra = false;
                        return false;
                    }
                }
                if (Tabla.misCasillas[(a1 + a) / 2][(b1 + b) / 2].cont != null) {
                    if (Tabla.misCasillas[a][b].cont.getforma() == 'B' && (Tabla.misCasillas[(a1 + a) / 2][(b1 + b) / 2].cont.forma == '◙' || Tabla.misCasillas[(a1 + a) / 2][(b1 + b) / 2].cont.forma == 'N')
                            || Tabla.misCasillas[a][b].cont.getforma() == 'N' && (Tabla.misCasillas[(a1 + a) / 2][(b1 + b) / 2].cont.forma == '◎' || Tabla.misCasillas[(a1 + a) / 2][(b1 + b) / 2].cont.forma == 'B')) {
                        Tabla.misCasillas[(a1 + a) / 2][(b1 + b) / 2].setCont(null);
                        Tabla.misCasillas[(a1 + a) / 2][(b1 + b) / 2].setChar('▓');
                        otra = true;
                        
                        return true;
                    }
                }
            }

        }
        otra = false;
        return false;
    }

    static int fila;
    static int columna;


    
      public static void bon(int a, int b) {
        if (Tabla.misCasillas[a][b].getchar() == 'B') {
            InArray.segundoSaltoNe(a, b,false,'B');
        } else {
            InArray.segundoSaltoNe(a, b,true,'N');
        }
    }
    
    public static void segunndomov(int a, int b , char e) {
        Partida.getTabla().getT();
        Scanner sc = new Scanner(System.in);
        Dama damablanca = new Dama(true);
        Dama damaNegra = new Dama(false);
        System.out.println("Fila:");
        fila = sc.nextInt();
        System.out.println("Columna:");
        columna = sc.nextInt();
            Tabla.misCasillas[a][b].setCont(null);
            Tabla.misCasillas[a][b].setChar('▓');
            Tabla.misCasillas[(a + fila) / 2][(b + columna) / 2].setCont(null);
            Tabla.misCasillas[(a + fila) / 2][(b + columna) / 2].setChar('▓');
            Tabla.misCasillas[fila][columna].setCont(damablanca);
            Tabla.misCasillas[fila][columna].setChar('e');       
        if (fila >= 2 && fila <= 6 && columna < 7 && columna > 1) {
            bon(fila, columna);
        }

    }
}
