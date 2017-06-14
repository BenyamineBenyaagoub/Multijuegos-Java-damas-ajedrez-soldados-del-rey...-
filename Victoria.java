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
public class Victoria implements Serializable {

    public static boolean victoriaAjedrezNegras() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (Tabla.misCasillas[i][j].getchar() == '♕') {

                    return false;
                }

            }
        }

        return true;
    }

    public static boolean victoriaAjedrezBlancas() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (Tabla.misCasillas[i][j].getchar() == '♛') {

                    return false;
                }

            }
        }

        return true;
    }

    public static boolean victoriaAjedrez() {
        if (victoriaAjedrezBlancas()) {
            System.out.println("ganan las blancas");
            return true;
        }
        if (victoriaAjedrezNegras()) {
            System.out.println("ganan las Negras");
            return true;
        }
        return false;
    }

    public static boolean victoriaDamasBlancas() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (Tabla.misCasillas[i][j].getchar() == 'N' || Tabla.misCasillas[i][j].getchar() == '◙') {

                    return false;
                }

            }
        }

        return true;
    }

    public static boolean victoriaDamasNegras() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (Tabla.misCasillas[i][j].getchar() == 'B' || Tabla.misCasillas[i][j].getchar() == '◎') {

                    return false;
                }

            }
        }

        return true;
    }

    public static boolean victoriaDamas() {
        if (victoriaDamasNegras()) {
            return true;
        }
        if (victoriaDamasBlancas()) {
            return true;
        }
        return false;
    }

    public static boolean VictoriaChinaBlancas() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (Tabla.misCasillas[i][j].getchar() == '▼') {
                    if (i < 5) {
                        return false;
                    }
                }
                
            }
        }

        return true;
    }
    
    
    public static boolean VictoriaChinaNegras() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
               if (Tabla.misCasillas[i][j].getchar() == '▲') {
                    if (i > 2) {
                        return false;
                    }
                } 
                
            }
        }

        return true;
    }
    
    public static boolean VictoriaChina(){
        if (VictoriaChinaNegras()){
            System.out.println("gana jugador 1");
            return true;
        }
        if (VictoriaChinaBlancas()) {
            System.out.println("gana jugador 2");
            return true;
        }
        return false;
    }
    
}
