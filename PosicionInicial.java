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
public class PosicionInicial implements Serializable {

    static Tabla t;
    Piezas p = new Piezas();
    Casilla c = new Casilla(1, 1, true, null);
    Scanner sc = new Scanner(System.in);

    public static void crearPeones() {
        Piezas peon[] = new Peon[8];
        Piezas peonN[] = new Peon[8];

        for (int i = 0; i < 8; i++) {

            peon[i] = new Peon(false);
            Tabla.misCasillas[peon[i].posiciony(1)][peon[i].posicionx(i)].setCont(peon[i]);
            Tabla.misCasillas[peon[i].posiciony(1)][peon[i].posicionx(i)].setChar(peon[i].forma);

            peonN[i] = new Peon(true);
            Tabla.misCasillas[peonN[i].posiciony(6)][peonN[i].posicionx(i)].setCont(peonN[i]);
            Tabla.misCasillas[peonN[i].posiciony(6)][peonN[i].posicionx(i)].setChar(peonN[i].forma);

        }
    }

    public static void crearTorres() {
        Piezas torre1B = new Torre(false);
        Piezas torre2B = new Torre(false);
        Piezas torre1N = new Torre(true);
        Piezas torre2N = new Torre(true);

        Tabla.misCasillas[torre1B.posiciony(0)][torre1B.posicionx(0)].setCont(torre1B);
        Tabla.misCasillas[torre1B.posiciony(0)][torre1B.posicionx(0)].setChar(torre1B.forma);
        Tabla.misCasillas[torre2B.posiciony(0)][torre1B.posicionx(7)].setCont(torre1B);
        Tabla.misCasillas[torre2B.posiciony(0)][torre1B.posicionx(7)].setChar(torre1B.forma);

        Tabla.misCasillas[torre1N.posiciony(7)][torre1N.posicionx(0)].setCont(torre1N);
        Tabla.misCasillas[torre1N.posiciony(7)][torre1N.posicionx(0)].setChar(torre1N.forma);
        Tabla.misCasillas[torre2N.posiciony(7)][torre2N.posicionx(7)].setCont(torre2N);
        Tabla.misCasillas[torre2N.posiciony(7)][torre2N.posicionx(7)].setChar(torre2N.forma);
    }

    public static void crearCaballos() {
        Piezas caballo1B = new Caballo(false);
        Piezas caballo2B = new Caballo(false);
        Piezas caballoN = new Caballo(true);
        Piezas caballo2N = new Caballo(true);

        Tabla.misCasillas[caballoN.posiciony(7)][caballoN.posicionx(1)].setCont(caballoN);
        Tabla.misCasillas[caballoN.posiciony(7)][caballoN.posicionx(1)].setChar(caballoN.forma);
        Tabla.misCasillas[caballo2N.posiciony(7)][caballo2N.posicionx(6)].setCont(caballo2N);
        Tabla.misCasillas[caballo2N.posiciony(7)][caballo2N.posicionx(6)].setChar(caballo2N.forma);

        Tabla.misCasillas[caballo1B.posiciony(0)][caballo1B.posicionx(1)].setCont(caballo1B);
        Tabla.misCasillas[caballo1B.posiciony(0)][caballo1B.posicionx(1)].setChar(caballo1B.forma);
        Tabla.misCasillas[caballo2B.posiciony(0)][caballo2B.posicionx(6)].setCont(caballo2B);
        Tabla.misCasillas[caballo2B.posiciony(0)][caballo2B.posicionx(6)].setChar(caballo2B.forma);

    }

    public static void crearelefantes() {
        Piezas alfil1B = new Alfil(false);
        Piezas alfil2B = new Alfil(false);
        Piezas alfilN = new Alfil(true);
        Piezas alfil2N = new Alfil(true);

        Tabla.misCasillas[alfil1B.posiciony(0)][alfil1B.posicionx(2)].setCont(alfil1B);
        Tabla.misCasillas[alfil1B.posiciony(0)][alfil1B.posicionx(2)].setChar(alfil1B.forma);
        Tabla.misCasillas[alfil2B.posiciony(0)][alfil2B.posicionx(5)].setCont(alfil2B);
        Tabla.misCasillas[alfil2B.posiciony(0)][alfil2B.posicionx(5)].setChar(alfil2B.forma);

        Tabla.misCasillas[alfilN.posiciony(7)][alfilN.posicionx(2)].setCont(alfilN);
        Tabla.misCasillas[alfilN.posiciony(7)][alfilN.posicionx(2)].setChar(alfilN.forma);
        Tabla.misCasillas[alfil2N.posiciony(7)][alfil2N.posicionx(5)].setCont(alfil2N);
        Tabla.misCasillas[alfil2N.posiciony(7)][alfil2N.posicionx(5)].setChar(alfil2N.forma);
    }

    public static void colocarreyes() {
        Piezas reyb = new Rey(false);
        Piezas reyn = new Rey(true);
        Tabla.misCasillas[reyb.posiciony(0)][reyb.posicionx(4)].setCont(reyb);
        Tabla.misCasillas[reyb.posiciony(0)][reyb.posicionx(4)].setChar(reyb.forma);
        Tabla.misCasillas[reyn.posiciony(7)][reyn.posicionx(3)].setCont(reyn);
        Tabla.misCasillas[reyn.posiciony(7)][reyn.posicionx(3)].setChar(reyn.forma);
    }

    public static void colocarReinas() {
        Piezas reinaB = new Reina(false);
        Piezas reyinaN = new Reina(true);
        Tabla.misCasillas[reinaB.posiciony(0)][reinaB.posicionx(3)].setCont(reinaB);
        Tabla.misCasillas[reinaB.posiciony(0)][reinaB.posicionx(3)].setChar(reinaB.forma);
        Tabla.misCasillas[reyinaN.posiciony(7)][reyinaN.posicionx(4)].setCont(reyinaN);
        Tabla.misCasillas[reyinaN.posiciony(7)][reyinaN.posicionx(4)].setChar(reyinaN.forma);
    }

    public static void colocarFichasAjedrez() {
        colocarreyes();
        crearTorres();
        crearCaballos();
        crearPeones();
        crearelefantes();
        colocarReinas();

    }

    public static void colocarFichasDamas() {
        damasDlancas();
        damasDlancas1();

    }
    static boolean nob = true;

    public static void damasDlancas() {
        for (int i = 0; i < 8; i++) {

            if (nob) {
                Piezas damablanca = new Dama(true);
                Piezas damanegra = new Dama(false);
                Tabla.misCasillas[damablanca.posiciony(1)][damablanca.posicionx(i)].setCont(damablanca);
                Tabla.misCasillas[damablanca.posiciony(1)][damablanca.posicionx(i)].setChar(damablanca.forma);
                Tabla.misCasillas[damanegra.posiciony(5)][damanegra.posicionx(i)].setCont(damanegra);
                Tabla.misCasillas[damanegra.posiciony(5)][damanegra.posicionx(i)].setChar(damanegra.forma);
                Tabla.misCasillas[damanegra.posiciony(7)][damanegra.posicionx(i)].setCont(damanegra);
                Tabla.misCasillas[damanegra.posiciony(7)][damanegra.posicionx(i)].setChar(damanegra.forma);

                nob = false;

            } else {
                nob = true;
            }
        }
    }

    public static void damasDlancas1() {

        for (int i = 0; i < 8; i++) {

            if (!nob) {
                Piezas damablanca = new Dama(true);
                Piezas damanegra = new Dama(false);
                Tabla.misCasillas[damanegra.posiciony(6)][damanegra.posicionx(i)].setCont(damanegra);
                Tabla.misCasillas[damanegra.posiciony(6)][damanegra.posicionx(i)].setChar(damanegra.forma);
                Tabla.misCasillas[damablanca.posiciony(0)][damablanca.posicionx(i)].setCont(damablanca);
                Tabla.misCasillas[damablanca.posiciony(0)][damablanca.posicionx(i)].setChar(damablanca.forma);
                Tabla.misCasillas[damablanca.posiciony(2)][damablanca.posicionx(i)].setCont(damablanca);
                Tabla.misCasillas[damablanca.posiciony(2)][damablanca.posicionx(i)].setChar(damablanca.forma);

                nob = true;

            } else {
                nob = false;
            }
        }
    }

    public static void soldadosDelRey() {
        Piezas peon[] = new Peon[8];
        Piezas peonN[] = new Peon[8];

        for (int i = 0; i < 8; i++) {

            peon[i] = new Peon(false);
            Tabla.misCasillas[peon[i].posiciony(1)][peon[i].posicionx(i)].setCont(peon[i]);
            Tabla.misCasillas[peon[i].posiciony(1)][peon[i].posicionx(i)].setChar(peon[i].forma);
            Tabla.misCasillas[peon[i].posiciony(0)][peon[i].posicionx(i)].setCont(peon[i]);
            Tabla.misCasillas[peon[i].posiciony(0)][peon[i].posicionx(i)].setChar(peon[i].forma);
            peonN[i] = new Peon(true);
            Tabla.misCasillas[peonN[i].posiciony(6)][peonN[i].posicionx(i)].setCont(peonN[i]);
            Tabla.misCasillas[peonN[i].posiciony(6)][peonN[i].posicionx(i)].setChar(peonN[i].forma);
            Tabla.misCasillas[peonN[i].posiciony(7)][peonN[i].posicionx(i)].setCont(peonN[i]);
            Tabla.misCasillas[peonN[i].posiciony(7)][peonN[i].posicionx(i)].setChar(peonN[i].forma);

        }

    }
    public static  void soldadosRey(){
        soldadosDelRey();
    }
}
//
//    public static void posepeonesb(){
//        
//        Piezas peon1 = new Peon(true);
//        t.misCasillas[1][1].setCont(peon1);
//        t.misCasillas[1][1].setChar(peon1.getforma);
////        t.tab (peon1.posicionx(1), peon1.posiciony(1),peon1);
//        
//    }

