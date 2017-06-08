/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeAjedrez;

import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class EleccionDeJuego {
    
   
          public static int a;
       
       
        
    public static void elige(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ajedrez 1");
        System.out.println("Damas 2");
        System.out.println("Soldados Del Rey 3");
      
        a = sc.nextInt();
        switch(a){
            case 1:
                PosicionInicial.colocarFichasAjedrez();
                
                break;
            case 2:
                PosicionInicial.colocarFichasDamas();
                break;
        }
    }
}
