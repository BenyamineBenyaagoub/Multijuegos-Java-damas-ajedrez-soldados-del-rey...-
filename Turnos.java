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
// esta clase sirve para cambiar turnos.
public class Turnos {
    static boolean elTurno;
    //depende de esta variable se mueve color o otro
 public static void cambiarTurno(){
     //Metodo para cambiar turno poner al final del metedo movimiento.
     System.out.println("cambio!!!!!!!");
     int turno = 2;
     if (turno == 2){
         turno = 1;
         elTurno = true;
     }else{
         turno = 2;
         elTurno= false;
     }
     
 }
 
}
