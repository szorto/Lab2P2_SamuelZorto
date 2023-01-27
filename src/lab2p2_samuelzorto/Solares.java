package lab2p2_samuelzorto;

/**
 *
 * @author szorto
 */
public class Solares {
    private int Ancho;
    private int Largo;
    private String estado;
    private String nomb;
    
    public Solares(){
        
    }

    public Solares(int Ancho, int Largo, String estado, String nomb) {
        this.Ancho = Ancho;
        this.Largo = Largo;
        this.estado = estado;
        this.nomb = nomb;
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

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }
    
    public String toString(){
        return "Ancho: " + Ancho + "/ Largo: " + Largo + "/ Nombre de Dueño: " + nomb;
    }
}
