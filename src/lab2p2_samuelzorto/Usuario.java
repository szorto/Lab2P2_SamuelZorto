package lab2p2_samuelzorto;

/**
 *
 * @author szorto
 */
public class Usuario {
    private String nomb;
    private int edad;
    private String user;
    private String pass;
    private boolean admin;

    public Usuario(){
        
    }

    
    
    
    public Usuario(String nomb, int edad, String user, String pass, boolean admin) {
        this.nomb = nomb;
        this.edad = edad;
        this.user = user;
        this.pass = pass;
        this.admin = admin;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
    

    @Override
    public String toString() {
        return "Cuenta   " + "nomb: " + nomb + "   user: " + user + "   pass: " + pass;
    }
    
    
    
}
