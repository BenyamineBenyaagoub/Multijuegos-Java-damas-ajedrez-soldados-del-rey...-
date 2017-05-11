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
public class Promociones {
   
    public static void ascention(){
        
        for (int i = 0; i < 6; i++) {
            if ( Tabla.misCasillas[7][i].getchar() == '♟' ) {
                cambio();
                System.out.println("hola mundo");
            }
            if( Tabla.misCasillas[0][i].getchar() == '♙' ) {
                cambio();
                
            }
        }
        
    }
    public static void cambio(){
        System.out.println("elige a que quieres promocionar");
        System.out.println("JAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA aun no  esta emplementado");
        System.out.println("saldra en nuestro dlc por solo  49€");
        cambio();
    }
    
}
