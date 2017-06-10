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
public class EleccionDeJuego implements Serializable {

    public static int a;

    public static void elige() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ajedrez 1");
        System.out.println("Damas 2");
        System.out.println("Soldados Del Rey 3");

        a = sc.nextInt();
        eleccionVictoria();
        switch (a) {
            case 1:
                PosicionInicial.colocarFichasAjedrez();

                break;
            case 2:
                PosicionInicial.colocarFichasDamas();
                break;
            case 3:
                PosicionInicial.soldadosRey();
                break;
        }
    }

    public static boolean eleccionVictoria() {
        switch (a) {
            case 1:
                if (Victoria.victoriaAjedrez()) {
                    return true;
                }

                break;
            case 2:
                if (Victoria.victoriaDamas()) {
                    return true;
                }

                break;
            case 3:
                if (Victoria.victoriaAjedrez()) {
                    return true;
                }

                break;
        }
        return false;
    }
}
