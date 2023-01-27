package lab2p2_samuelzorto;

/**
 *
 * @author szorto
 */
public class Solares {
    private int Ancho;
    private int Largo;
    private String estado;
    
    public Solares(){
        
    }

    public Solares(int Ancho, int Largo, String estado) {
        this.Ancho = Ancho;
        this.Largo = Largo;
        this.estado = estado;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
