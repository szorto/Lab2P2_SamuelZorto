package lab2p2_samuelzorto;

/**
 *
 * @author szorto
 */
public class Edificios {
    private int pisos;
    private int locales;
    private String dirRef;
    private String estado;
    
    public Edificios(){
        
    }

    public Edificios(int pisos, int locales, String dirRef, String estado) {
        this.pisos = pisos;
        this.locales = locales;
        this.dirRef = dirRef;
        this.estado = estado;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
