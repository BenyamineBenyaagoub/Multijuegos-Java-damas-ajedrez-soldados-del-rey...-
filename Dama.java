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
public class Dama extends Piezas {

    static int fila;
    static int columna;
    public static boolean SegundoSalto = false;

    public Dama(boolean colorcito) {

        super.setColor(colorcito);
        if (colorcito) {
            super.setforma('◎');
        } else {
            super.setforma('◙');
        }

    }

    @Override
    public boolean mov(int a, int b, int a1, int b1) {
        if (comer(a, b, a1, b1)) {

            return true;
        }
        if (this.forma == '◎') {
            if (a1 - a == 1 && Math.abs(b1 - b) == Math.abs(1)) {
                return true;
            }

        }
        if (this.forma == '◙') {
            if (a1 - a == -1 && Math.abs(b1 - b) == Math.abs(1)) {
                return true;
            }

        }

        return false;
    }

    public static boolean comer(int a, int b, int a1, int b1) {

        if (comerBlancas(a, b, a1, b1) || comerNegras(a, b, a1, b1)) {
            return true;
        }

        return false;
    }

    public static boolean comerBlancas(int a, int b, int a1, int b1) {
        if (Tabla.misCasillas[a][b].cont.forma == '◎') {
            if (a >= 6) {
                SegundoSalto = false;
                System.out.println("es lo tercero");
                return false;
            }
            if (a1 - a == 2 && b1 - b == -2) {
                if (b <= 1) {
                    SegundoSalto = false;
                    return false;

                }
                if (Tabla.misCasillas[a + 1][b - 1].cont != null) {
                    if (Tabla.misCasillas[a + 1][b - 1].cont.forma == '◙' || Tabla.misCasillas[a + 1][b + 1].cont.forma == 'N') {
                        Tabla.misCasillas[a + 1][b - 1].setCont(null);
                        Tabla.misCasillas[a + 1][b - 1].setChar('▓');
                        SegundoSalto = true;
                        return true;
                    }
                }
            }

            if (a1 - a == 2 && b1 - b == 2) {
                if (b >= 6) {
                    SegundoSalto = false;
                    return false;
                }
                if (Tabla.misCasillas[a + 1][b + 1].cont != null) {
                    if (Tabla.misCasillas[a + 1][b + 1].cont.forma == '◙' || Tabla.misCasillas[a + 1][b + 1].cont.forma == 'N') {
                        Tabla.misCasillas[a + 1][b + 1].setCont(null);
                        Tabla.misCasillas[a + 1][b + 1].setChar('▓');

                        SegundoSalto = true;
                        return true;

                    }
                }
            }

        }
        return false;
    }

    public static boolean comerNegras(int a, int b, int a1, int b1) {
        if (Tabla.misCasillas[a][b].cont.forma == '◙') {
            if (a <= 1) {
                SegundoSalto = false;
                return false;
            }
            if (a1 - a == -2 && b1 - b == 2) {
                if (b >= 6) {
                    SegundoSalto = false;
                    return false;
                }
                if (Tabla.misCasillas[a - 1][b + 1].cont != null) {
                    if (Tabla.misCasillas[a - 1][b + 1].cont.forma == '◎' || Tabla.misCasillas[a - 1][b + 1].cont.forma == '⛉') {
                        Tabla.misCasillas[a - 1][b + 1].setCont(null);
                        Tabla.misCasillas[a - 1][b + 1].setChar('▓');
                        SegundoSalto = true;
                        return true;
                    }
                }
            }
            if (a1 - a == -2 && b1 - b == -2) {
                if (b <= 1 || a <= 1) {
                    SegundoSalto = false;
                    return false;
                }
                if (Tabla.misCasillas[a - 1][b - 1].cont != null) {
                    if (Tabla.misCasillas[a - 1][b - 1].cont.forma == '◎' || Tabla.misCasillas[a - 1][b + 1].cont.forma == '⛉') {
                        Tabla.misCasillas[a - 1][b - 1].setCont(null);
                        Tabla.misCasillas[a - 1][b - 1].setChar('▓');
                        SegundoSalto = true;
                        return true;
                    }
                }
            }
        }
        SegundoSalto = false;
        return false;

    }


   
   

    public static void boNDama(int a, int b) {
        if (Tabla.misCasillas[a][b].getchar() == '◎') {
            
            InArray.segundoSaltoNe(a, b, false, '◎');
        } else {
            InArray.segundoSaltoNe(a, b, true, '◙');
        }
    }

    public static void segunndomov(int a, int b, char e) {

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
        Tabla.misCasillas[fila][columna].setChar(e);

        if (Tabla.misCasillas[a][b].getchar() == '◎') {
            if (fila <= 6 && columna < 6 && columna > 1) {
                boNDama(fila, columna);
            }
        } else {
            if (fila >= 2 && columna < 7 && columna > 1) {
                boNDama(fila, columna);
            }
        }

    }
}
