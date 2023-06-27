
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Mariano Benegas
 */
public class Puerto {
    
    private ArrayList<Amarre> amarres;

    public Puerto() {
    }

    public Puerto(ArrayList<Amarre> amarres) {
        this.amarres = amarres;
    }

    public ArrayList<Amarre> getAmarres() {
        return amarres;
    }

    public void setAmarres(ArrayList<Amarre> amarres) {
        this.amarres = amarres;
    }
    
    
}
