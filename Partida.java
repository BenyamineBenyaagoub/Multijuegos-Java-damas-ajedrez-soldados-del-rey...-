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

public class Partida {
   
    public static Tabla getTabla(){
        Tabla t = new Tabla();
        return t;
    }
    public static void main(String[] args) {
       Guardar.Ecargar();
        Scanner sc = new Scanner(System.in);
        System.out.println("♔ ♕ ♖ ♗ ♘ ♙ ♚ ♛ ♜ ♝ ♞ ♟");
        getTabla().carga();
        
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
            if (getTabla().mover(fila1, columna1,fila, columna) ) {
                Turnos.cambiarTurno();
            }
             if (Dama.SegundoSalto) {
                        Dama.boNDama(fila, columna);
                    } else if (DamaDoble.otra) {
                        DamaDoble.bon(fila, columna);
                    }
           
            getTabla().tabla();
            getTabla().getT();           
            getTabla().guarda();
             
            if (EleccionDeJuego.eleccionVictoria()) {
               loop = false; 
            }
           
        }

    }
}
