/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeAjedrez;

/**
 *
 * @author ibra
 */

public class Turnos {
    static boolean elTurno;
    static int turno = 2;
 public static void cambiarTurno(){

     System.out.println("cambio de turno!!!!!!!");
     
     if (turno == 2){
         turno = 1;
         elTurno = true;
     }else{
         turno = 1;
         elTurno= false;
     }
     
 }
 
}