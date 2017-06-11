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
public class DamaChina extends Piezas {

    public DamaChina(boolean colorcito) {

        super.setColor(colorcito);
        if (colorcito) {
            super.setforma('▼');
        } else {
            super.setforma('▲');
        }
    }

    @Override
    public boolean mov(int a, int b, int a1, int b1) {

        if (salto(a, b, a1, b1)) {
            return true;
        }
        if (this.forma == '▼') {
            if (a1 - a == 1 && Math.abs(b1 - b) == Math.abs(1)) {
                return true;
            }

        }
        if (this.forma == '▲') {
            if (a1 - a == -1 && Math.abs(b1 - b) == Math.abs(1)) {
                return true;
            }

        }

        return false;
    }

    public boolean salto(int a, int b, int a1, int b1) {
        
            if (this.forma == '▼') {
                if (a1 - a == 2 && Math.abs(b1 - b) == Math.abs(2) && posibleSalto(a, b, a1, b1)) {
                    return true;
                }
                if (this.forma == '▲') {
                    if (a1 - a == -2 && Math.abs(b1 - b) == Math.abs(2) && posibleSalto(a, b, a1, b1)) {
                    return true;
                }
                }
                
            }
        
        return false;
    }

    public boolean posibleSalto(int a, int b, int a1, int b1) {
        if (Tabla.misCasillas[(a + a1) / 2][(b + b1) / 2].noTienePieza() == false && Tabla.misCasillas[a1][b1].noTienePieza()) {
            return true;
        }
        return false;
    }
}
