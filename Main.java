/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeAjedrez;

/**
 *
 * @author Javier
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Tabla t = new Tabla();
        Casilla ca = new Casilla(1, 1, true, null);
        Peon p;
        Scanner sc = new Scanner(System.in);
        System.out.println("♔ ♕ ♖ ♗ ♘ ♙ ♚ ♛ ♜ ♝ ♞ ♟");
        t.t();
        t.crearPeones();
        t.getT();
        while (true) {
            System.out.println("1"+"1");
            System.out.println("fila");
            int fila = sc.nextInt();
            System.out.println("columna");
            int columna = sc.nextInt();
            
            t.pmover(fila, columna);

            System.out.println("fila");
            fila = sc.nextInt();
            System.out.println("columna");
            columna = sc.nextInt();
            t.mover(fila, columna);
            t.t();
            t.getT();
            
        }

    }
}
