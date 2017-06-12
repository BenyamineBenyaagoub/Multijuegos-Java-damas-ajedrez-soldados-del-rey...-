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
public class Tabla implements Serializable {
    static Tabla tabla = new Tabla(); 
    private static final int mida = 8;

    static Casilla[][] misCasillas = new Casilla[mida][mida];
    Casilla[][] pro = new Casilla[mida][mida];
    
    InTheLine online = new InTheLine();
    
    public void initClient(String ip){
        online.initClient(ip);
    }
    
    public void initServer(){
        tabla = online.initServer();
    }
    
    public void envia(){
        online.envia(tabla);
    }
    public void recibe(){
        tabla = online.reb();
    }

    public void guarda() {
        Guardar.guardar(misCasillas);
    }

    public void carga() {
        if (Guardar.exi()) {
            misCasillas = Guardar.cargar();
        } else {
            tabla();
        }

    }

//    public Tabla() {
//        this.tabla();
//    }
    void tabla() {
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

    int a;
    int b;

    public void piezaAMover(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public static boolean dentro(int... nums) {
        for (int num : nums) {
            if (num > 7 || num < 0) {
                return false;
            }
        }
        return true;
    }

    public boolean mover(int a, int b, int c, int d) {
        if (misCasillas[a][b].cont.getcolor() == Turnos.elTurno) {
            if (misCasillas[a][b].cont.mov(a, b, c, d)) {
                if (misCasillas[c][d].noTienePieza() || misCasillas[c][d].cont.getcolor() == true) {

                    pro[a][b] = misCasillas[a][b];
                    misCasillas[a][b].cont.movimientos++;
                    misCasillas[a][b] = null;
                    misCasillas[c][d] = pro[a][b];
                   
                    return true;
                } else {
                    System.out.println("No puede realizar ese movimiento.");
                }
            } else {
                System.out.println("No puede realizar ese movimiento.");
            }

        } else {
            System.out.println(" intenta mover otro color :3");

        }
        return false;
    }
//    public void mover(int c, int d) {
//      
//       misCasillas[c][d].setCont(misCasillas[a][b].getCont());
//      
//       
//       misCasillas[a][b]=null;
//    }
}
