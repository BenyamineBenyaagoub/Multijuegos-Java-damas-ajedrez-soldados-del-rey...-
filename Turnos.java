/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeAjedrez;

import java.io.Serializable;

/**
 *
 * @author ibra
 */

public class Turnos  implements Serializable{
    static boolean elTurno;
    static int turno = 2;
 public static void cambiarTurno(){

    
     
     if (turno == 2){
         turno = 1;
         System.out.println("Turno del jugador 2" );
         elTurno = true;
     }else{
         turno = 2;
         System.out.println("Turno del jugador 1");
         elTurno= false;
     }
     
 }
 
}