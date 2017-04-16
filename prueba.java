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
public class prueba {
    public static int[] mul( int[][] a , int[][] b)throws IllegalArgumentException{
       int x = 0;
       int[]res = new int[6];
       if(a[1].length==b.length){
           while(x<3){
               for (int i = 0; i < 2; i++) {
                   for (int j = 0; j < 3; j++) {
                       res[x] = a[i][j]*b[j][i];
                       x++;
                   }
               }
           }return res;
       }throw new IllegalArgumentException("exeepcion");
       
    }
       
    
    public static void main(String[] args) {
        int[][] a = {{3,1,5},{4,6,5}};
        int[][] b= {{l,5},{8,4},{3,6}};
        int[] res;
        try{
            res= mul(a,b);
            for (int i = 0; i < res.length; i++) {
                System.out.println(res[i]);
            }
        }catch(IllegalArgumentException e){
            System.out.println("exepcion");
        }
    }
    
    
}
