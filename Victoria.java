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
public class Victoria {
    // al tener mas juegos pondre un meetodo que ejecute el metodo victoria del juego qe seleccione el usuario.

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
     public static boolean victoriaAjedrez(){
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
}
