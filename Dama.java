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

    public Dama(boolean colorcito) {

        super.setColor(colorcito);
        if (colorcito) {
            super.setforma('◎');
        } else {
            super.setforma('◙');
        }

    }

    public boolean mov(int a, int b, int a1, int b1) {
        if (comer(a, b, a1, b1)) {

            return true;
        }
        if (Tabla.misCasillas[a][b].cont.forma == '◎') {
            if (a1 - a == 1 && b1 - b == -1) {
                return true;
            }
            if (a1 - a == 1 && b1 - b == 1) {
                return true;
            }
        }
        if (Tabla.misCasillas[a][b].cont.forma == '◙') {
            if (a1 - a == -1 && b1 - b == -1) {
                return true;
            }
            if (a1 - a == -1 && b1 - b == +1) {
                return true;
            }
        }

        return false;
    }
    public static boolean eeepa = false;

    // Dividir este metodo en 3
    public static boolean comer(int a, int b, int a1, int b1) {
        if (Tabla.misCasillas[a][b].cont.forma == '◎') {

            if (a1 - a == 2 && b1 - b == -2) {
                if (Tabla.misCasillas[a + 1][b - 1].cont != null) {
                    if (Tabla.misCasillas[a + 1][b - 1].cont.forma == '◙') {
                        Tabla.misCasillas[a + 1][b - 1].setCont(null);
                        Tabla.misCasillas[a + 1][b - 1].setChar('▓');
                        eeepa = true;
                        return true;
                    }
                }
            }
            if (b <= 6 || a <= 6) {
                return false;
            }
            if (a1 - a == 2 && b1 - b == 2) {
                if (Tabla.misCasillas[a + 1][b + 1].cont != null) {
                    if (Tabla.misCasillas[a + 1][b + 1].cont.forma == '◙') {
                        Tabla.misCasillas[a + 1][b + 1].setCont(null);
                        Tabla.misCasillas[a + 1][b + 1].setChar('▓');

                        eeepa = true;
                        return true;

                    }
                }
            }

        }
        // esto esta mal ha de ser al reves
        if (Tabla.misCasillas[a][b].cont.forma == '◙') {
            if (a1 - a == -2 && b1 - b == 2) {
                if (Tabla.misCasillas[a + 1][b + 1].cont != null) {
                    if (Tabla.misCasillas[a - 1][b + 1].cont.forma == '◎') {
                        Tabla.misCasillas[a - 1][b + 1].setCont(null);
                        Tabla.misCasillas[a - 1][b + 1].setChar('▓');
                        eeepa = true;
                        return true;
                    }
                }
            }
                        if (a1 - a == -2 && b1 - b == -2) {
                if (Tabla.misCasillas[a + 1][b + 1].cont != null) {
                    if (Tabla.misCasillas[a - 1][b - 1].cont.forma == '◎') {
                        Tabla.misCasillas[a - 1][b - 1].setCont(null);
                        Tabla.misCasillas[a - 1][b - 1].setChar('▓');
                        eeepa = true;
                        return true;
                    }
                }
            }
        }
        eeepa = false;
        return false;

    }

    static int fila;
    static int columna;

    public static boolean segundoSaltoBlancas(int a, int b) {

        if (Tabla.misCasillas[a + 2][b - 2].cont == null && Tabla.misCasillas[a + 1][b - 1].cont.getcolor() == false) {
            segunndomov(a, b);
            return true;

        }
        if (b <= 7 || a <= 7) {
            return false;
        }

        if (Tabla.misCasillas[a + 2][b + 2].cont == null && Tabla.misCasillas[a + 1][b + 1].cont.getcolor() == false) {
            segunndomov(a, b);
            return true;
        }
        System.out.println("nada");
        return false;
    }

   public static boolean segundoSaltoNegras(int a, int b) {
       
         
        if (Tabla.misCasillas[a - 2][b + 2].cont == null || Tabla.misCasillas[a - 1][b + 1].cont.getcolor() == true) {
            segunndomov(a, b);
            return true;

        }
          if (b <= 6 || a <= 6) {
            return false;
        }
         if (Tabla.misCasillas[a - 2][b - 2].cont == null || Tabla.misCasillas[a - 1][b - 1].cont.getcolor() == true) {
            segunndomov(a, b);
            return true;

        }

        return false;
    }
    public static void boNDama(int a,int b){
        if(Tabla.misCasillas[a][b].cont.getcolor()){
            segundoSaltoBlancas(a,b);
        }else{
            segundoSaltoNegras(a,b);
        }
    }

    public static void segunndomov(int a, int b) {
        Main.getTabla().getT();
        Scanner sc = new Scanner(System.in);
        Dama damablanca = new Dama(true);
        Dama damaNegra = new Dama(false);
        System.out.println("Fila:");
        fila = sc.nextInt();
        System.out.println("Columna:");
        columna = sc.nextInt();
        if (Tabla.misCasillas[a][b].cont.forma == '◎') {
            Tabla.misCasillas[a][b].setCont(null);
            Tabla.misCasillas[a][b].setChar('▓');
            Tabla.misCasillas[(a + fila) / 2][(b + columna) / 2].setCont(null);
            Tabla.misCasillas[(a + fila) / 2][(b + columna) / 2].setChar('▓');
            Tabla.misCasillas[fila][columna].setCont(damablanca);
            Tabla.misCasillas[fila][columna].setChar('◎');

        } else {
            Tabla.misCasillas[a][b].setCont(null);
            Tabla.misCasillas[a][b].setChar('▓');
            Tabla.misCasillas[(a + fila) / 2][(b + columna) / 2].setCont(null);
            Tabla.misCasillas[(a + fila) / 2][(b + columna) / 2].setChar('▓');
            Tabla.misCasillas[fila][columna].setCont(damaNegra);
            Tabla.misCasillas[fila][columna].setChar('◙');
        }
        //boNDama(fila, columna);
    }
}
