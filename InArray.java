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
public class InArray {
     public static boolean inArray(int y, int x, int length) {
        if (x < length && y >= 0 && y < length && x >= 0) {
            return true;
        }
        return false;
    }
}
