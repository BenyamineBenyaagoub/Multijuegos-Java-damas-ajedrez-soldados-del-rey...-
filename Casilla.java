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
public class Casilla {

    Piezas cont;
    private boolean color;
    private final char blanco = '░';
    private final char negro = '▓';
   
    private int y;
    private int x;
    private char elcolor;

    public Casilla(int y, int x, boolean color, Piezas cont) {
        this.cont = cont;
        this.x = x;
        this.y = y;
        this.color = color;
        if (color) {
            elcolor = blanco;
        } else {
            elcolor = negro;
        }
    }
    
    public boolean db(){
        if(cont == null){
            return true;
        }
            return false;
        
    }
    
 
    
    
    public char getcolor() {
        return elcolor;
    }

    public void setChar(char c) {
        this.elcolor = c;

    }

    public void setCont(Piezas cont) {
        this.cont = cont;
    }
    
    public Piezas getCont(){
       return cont; 
    }

}
