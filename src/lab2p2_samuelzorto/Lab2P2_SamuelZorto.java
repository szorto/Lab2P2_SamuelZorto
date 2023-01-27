package lab2p2_samuelzorto;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_SamuelZorto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Scanner para ints
        Scanner entrad = new Scanner(System.in); // Scanner para Strings
        ArrayList Inmuebles = new ArrayList();
        ArrayList<Usuario> usu = new ArrayList();
        usu.add(new Usuario("Admin", 0, "admin", "admin1234", true));
        boolean rep = true;
        boolean user = true;
        int noUser;
        
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
            System.out.println("");
            
            switch(menuu){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Ya tiene cuenta? Y/N");
                    char tiene = entrada.next().charAt(0);
                    switch(tiene){
                        case 'y', 'Y':
                            System.out.print("Igrese su Usuario");
                            String usuario = entrada.next();
                            System.out.print("Igrese su Contraseña: ");
                            String pass = entrada.next();
                            
                            for (Usuario t : usu) {
                                if(t.getUser().equals(usuario) && t.getPass().equals(pass)){
                                    noUser = usu.indexOf(t);
                                    
                                }else{
                                    System.out.println("El usuario/contraseña que ingreso esta incorrecto");
                                }
                            }
                            
                            break;
                        case 'n', 'N':
                            System.out.print("Igrese su Nombre");
                            String nomb = entrad.nextLine();
                            System.out.print("Igrese su Edad");
                            int edad = entrada.nextInt();
                            System.out.print("Igrese su Usuario");
                            usuario = entrada.next();
                            System.out.print("Igrese su Contraseña: ");
                            pass = entrada.next();
                            
                            usu.add(new Usuario(nomb, edad, usuario, pass, false));
                            System.out.println("Su cuenta fue creada existosamente. Por favor vaya a log in con su nueva cuenta.");
                            break;
                    }
                    break;
                case 4:
                    rep = false;
                    break;
            }
        }while(rep);
        
    }
    
}
