/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeAjedrez;

import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Tabla {

    private static final int mida = 8;
    //poner movimientos en el objeto de la pieza
    //char tabla [][]= new char[mida][mida];
    static Casilla[][] misCasillas = new Casilla[mida][mida];
    Casilla[][] pro = new Casilla[mida][mida];

    public Tabla() {
        this.t();
    }

    void t() {
        int pre = 0;
        for (int y = 0; y < mida; y++) {
            if (pre == 0) {
                pre++;
            } else {
                pre--;
            }
            for (int x = 0; x < mida; x++) {
                if (misCasillas[y][x] == null) {

                    if (pre == 0) {
                        misCasillas[y][x] = new Casilla(y, x, false, null);
                        pre++;
                    } else {
                        misCasillas[y][x] = new Casilla(y, x, true, null);
                        pre--;
                    }
                } else {
                    if (pre == 0) {
                        pre = 1;
                    } else {
                        pre = 0;
                    }
                }
            }
        }
    }

    void getT() {
        System.out.println("[] [0] [1] [2] [3] [4] [5] [6] [7]");
        for (int y = 0; y < mida; y++) {
            System.out.print(" " + y + " ");
            for (int x = 0; x < mida; x++) {
                System.out.print(" ");

                System.out.print(misCasillas[y][x].getchar());

                System.out.print(" ");

            }
            System.out.println(" ");
        }
    }

//    public void tab(int a, int b, Piezas cont) {
//        
//        misCasillas[a][b].setCont(cont);
//        misCasillas[a][b].setChar(cont.getforma);
//        
//    }
//    public void pose(){
//        po.posepeonesb();
//    }
//       public  void posepeonesb(){
//        
//        Piezas peon1 = new Peon(true);
//        
//        misCasillas[1][1].setCont(peon1);
//        misCasillas[1][1].setChar(peon1.getforma);
//        Piezas peon2 = new Peon(true);
////        t.tab (peon1.posicionx(1), peon1.posiciony(1),peon1);
//        
//    }
//    public void crearPeones() {
//
//        Piezas peon[] = new Peon[8];
//        Piezas peonN[] = new Peon[8];
//        for (int i = 0; i < 8; i++) {
//
//            peon[i] = new Peon(false);
//            misCasillas[peon[i].posiciony(1)][peon[i].posicionx(i)].setCont(peon[i]);
//            misCasillas[peon[i].posiciony(1)][peon[i].posicionx(i)].setChar(peon[i].forma);
//
//            peonN[i] = new Peon(true);
//            misCasillas[peonN[i].posiciony(6)][peonN[i].posicionx(i)].setCont(peonN[i]);
//            misCasillas[peonN[i].posiciony(6)][peonN[i].posicionx(i)].setChar(peonN[i].forma);
//       
//
//        }
//        t.tab (peon1.posicionx(1), peon1.posiciony(1),peon1);
//    }
    int a;
    int b;

    public void piezaAMover(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public void mover(int a, int b,int c, int d) {
        if (misCasillas[a][b].cont.getcolor() == Turnos.elTurno) {
            if (misCasillas[a][b].cont.mov(a, b, c, d)) {
                if (misCasillas[c][d].noTienePieza() || misCasillas[c][d].cont.getcolor() == true) {

                    pro[a][b] = misCasillas[a][b];
                    misCasillas[a][b].cont.movimientos++;
                    misCasillas[a][b] = null;
                    misCasillas[c][d] = pro[a][b];
                    if (Dama.eeepa) {
                         Dama.boNDama(c, d); 
                    }else if(DamaDoble.otra){
                        DamaDoble.bon(c,d);
                    }
                  
                    Turnos.cambiarTurno();

                } else {

                    System.out.println("**********no se puede mover ahi**********");

                }
            } else {
                System.out.println("fuera");
            }

        } else {
            System.out.println(" intenta mover otro color :3");

        }
    }
//    public void mover(int c, int d) {
//      
//       misCasillas[c][d].setCont(misCasillas[a][b].getCont());
//      
//       
//       misCasillas[a][b]=null;
//    }
}
