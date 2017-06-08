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
   
    public static Tabla getTabla(){
        Tabla t = new Tabla();
        return t;
    }
    public static void main(String[] args) {
       Guardar.Ecargar();
        PosicionInicial pose = new PosicionInicial();
        Casilla ca = new Casilla(1, 1, true, null);
        Peon p;
        Scanner sc = new Scanner(System.in);
        System.out.println("♔ ♕ ♖ ♗ ♘ ♙ ♚ ♛ ♜ 0 ♞ ♟");
        getTabla().carga();
        //
        if (!(Guardar.exi())) {
           EleccionDeJuego.elige();
        }
 
        boolean loop = true;
        getTabla().getT();
        while (loop) {
            
            Promociones.ascention();
            System.out.println("fila");
            int fila1 = sc.nextInt();
            System.out.println("columna");
            int columna1 = sc.nextInt();
            System.out.println("fila");
            int fila = sc.nextInt();
            System.out.println("columna");
            int columna = sc.nextInt();
            getTabla().mover(fila1, columna1,fila, columna);
            getTabla().t();
            getTabla().getT();
            getTabla().guarda();
        
            if (EleccionDeJuego.eleccionVictoria()) {
               loop = false; 
            }
           
        }

    }
}
