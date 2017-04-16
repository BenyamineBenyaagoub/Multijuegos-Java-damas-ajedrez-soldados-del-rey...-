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
public class Piezas {

    private boolean colorblanco = false;
    public int y;
    public int x;
    public char forma;

    public boolean hcolor(boolean colorblanco) {
        this.colorblanco = colorblanco;
        return colorblanco;
    }

    public int posiciony(int y) {

        this.y = y;
        return y;
    }

    public int posicionx(int x) {

        this.x = x;
        return x;
    }
    public void setforma(char forma) {
        
        this.forma= forma;
    }
    public char  getforma() {
        
        return forma;
    }
    public boolean setColor(boolean color){
        this.colorblanco = color;    
        return colorblanco;
        
    }
    public boolean getcolor(){
        return colorblanco;
    }

   public boolean mov(int a,int b,int c, int d){
       return false;
   }
    public int movimientos = 0;
    public static boolean obstaculo(int a, int b, int c, int d) {
        return true;
    }
    
    
    
    
}
