package lab2p2_samuelzorto;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_SamuelZorto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Usuario> usu = new ArrayList();
        usu.add(new Usuario("Admin", 0, "admin", "admin1234"));
        boolean rep = true;
        
        do{
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(usu);
            System.out.println("Elija una opcion de lo que desea hacer:");
            System.out.println("[2]Registro de Inmueble/Solar");
            System.out.println("[2]Manejo de Estados");
            System.out.println("[3]Log In/Sign up");
            System.out.println("[4]Salir");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            int menuu = entrada.nextInt();
        }while(rep);
        
    }
    
}
