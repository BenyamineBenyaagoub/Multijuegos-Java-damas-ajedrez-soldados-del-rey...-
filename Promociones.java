/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeAjedrez;

import java.io.Serializable;

/**
 *
 * @author Javier
 */
public class Promociones implements Serializable {
    
    public static void ascention(){
        ascentionPeon();
        ascentionDama();
    }

    public static void ascentionPeon() {

        for (int i = 0; i < 6; i++) {
            if (Tabla.misCasillas[7][i].getchar() == '♟') {
                cambio();
                System.out.println("hola mundo");
            }
            if (Tabla.misCasillas[0][i].getchar() == '♙') {
                cambio();

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

    public static void cambio() {
        System.out.println("elige a que quieres promocionar");
        System.out.println("JAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA aun no  esta emplementado");
        System.out.println("saldra en nuestro dlc por solo  49€");
        
    }

}
