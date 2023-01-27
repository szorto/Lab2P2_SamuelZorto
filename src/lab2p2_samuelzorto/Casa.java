package lab2p2_samuelzorto;

import java.awt.Color;

/**
 *
 * @author szorto
 */
public class Casa {
    private int noC;
    private int noB;
    private Color color;
    private int Ancho;
    private int Largo;
    private int noDB;
    private int noDC;
    
    public Casa(){
        
    }

    public Casa(int noC, int noB, Color color, int Ancho, int Largo, int noDB, int noDC) {
        this.noC = noC;
        this.noB = noB;
        this.color = color;
        this.Ancho = Ancho;
        this.Largo = Largo;
        this.noDB = noDB;
        this.noDC = noDC;
    }

    public int getNoC() {
        return noC;
    }

    public void setNoC(int noC) {
        this.noC = noC;
    }

    public int getNoB() {
        return noB;
    }

    public void setNoB(int noB) {
        this.noB = noB;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAncho() {
        return Ancho;
    }

    public void setAncho(int Ancho) {
        this.Ancho = Ancho;
    }

    public int getLargo() {
        return Largo;
    }

    public void setLargo(int Largo) {
        this.Largo = Largo;
    }

    public int getNoDB() {
        return noDB;
    }

    public void setNoDB(int noDB) {
        this.noDB = noDB;
    }

    public int getNoDC() {
        return noDC;
    }

    public void setNoDC(int noDC) {
        this.noDC = noDC;
    }
    
    
}
