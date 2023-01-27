package lab2p2_samuelzorto;

/**
 *
 * @author szorto
 */
public class Edificios {
    private int pisos;
    private int locales;
    private String dirRef;
    
    public Edificios(){
        
    }

    public Edificios(int pisos, int locales, String dirRef) {
        this.pisos = pisos;
        this.locales = locales;
        this.dirRef = dirRef;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getLocales() {
        return locales;
    }

    public void setLocales(int locales) {
        this.locales = locales;
    }

    public String getDirRef() {
        return dirRef;
    }

    public void setDirRef(String dirRef) {
        this.dirRef = dirRef;
    }
    
    
}
