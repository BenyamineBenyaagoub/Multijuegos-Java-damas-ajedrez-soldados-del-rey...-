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
public class Peon extends Piezas{
    Tabla t;
    public Peon(boolean colorcito){
       
//       super.hcolor(colorcito);
       super.setColor(colorcito);
       if (colorcito){
           super.setforma('♙');
       }else{
           super.setforma('♟');
       }
       
    }
   
    int [][] movimientos= {{0,1}};
    
    public boolean mov( int a,int b,int c, int d){
     if(super.movimientos == 0){
         if ( c-a==1 && d-b==0 || c-a==2 && d-b==0  ){
           return true; 
         }
         
     }
       if ( c-a==1 && d-b==0 ){
           return true; 
     
       }
       return false;
    }
    
}
