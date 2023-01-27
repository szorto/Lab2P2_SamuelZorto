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
    private String nomb;
    
    public Edificios(){
        
    }

    public Edificios(int pisos, int locales, String dirRef, String estado, String nomb) {
        this.pisos = pisos;
        this.locales = locales;
        this.dirRef = dirRef;
        this.estado = estado;
        this.nomb = nomb;
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

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }
    
    
}
