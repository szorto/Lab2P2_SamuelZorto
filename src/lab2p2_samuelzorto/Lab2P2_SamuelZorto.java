package lab2p2_samuelzorto;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;

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
        boolean user = true; //admin
        int noUser = 0;
        
        do{
            
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(usu.get(noUser).toString());
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
                    if(user == true){
                        regis(noUser, usu, Inmuebles);
                    }else{
                        System.out.println("Solo un administrador puede acceder esta opcion"); 
                    }
                    
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
                                    user = t.isAdmin();
                                }else{
                                    System.out.println("El usuario/contraseña que ingreso esta incorrecto");
                                }
                            }
                            
                            
                            break;
                        case 'n', 'N':
                            System.out.print("Igrese su Nombre: ");
                            String nomb = entrad.nextLine();
                            System.out.print("Ingrese su Edad: ");
                            int edad = entrada.nextInt();
                            System.out.print("Igrese su Usuario: ");
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
    
    public static void regis(int noUser, ArrayList usu, ArrayList Inmuebles){
        Scanner entrada = new Scanner(System.in);
        Scanner entrad = new Scanner(System.in);
        System.out.println("[1]Crear Casas/Edificios/Solares\n"
                + "[2]Listar Casas/Edificios/Solares\n"
                + "[3]Modificar Casas/Edificios/Solares\n"
                + "[4]Borrar Casas/Edificios/Solares\n"
                + "[5]Vender Casas/Edificios/Solares\n");
        int eli = entrada.nextInt();
        int inm;
        switch(eli){
            case 1:
                System.out.println("");
                System.out.println("[1] Casa");
                System.out.println("[2] Edificio");
                System.out.println("[3] Solar");
                inm = entrada.nextInt();
                switch(inm){
                    case 1:
                        System.out.print("Ingrese el numero de casa: ");
                        int noC = entrada.nextInt();
                        System.out.print("Ingrese el numero de bloque: ");
                        int noB = entrada.nextInt();
                        System.out.println("Ingrese el color: ");
                        Color color = JColorChooser.showDialog(null, "Seleccione color", Color.black);
                        System.out.print("Ingrese el ancho: ");
                        int ancho = entrada.nextInt();
                        System.out.print("Ingrese el largo: ");
                        int largo = entrada.nextInt();
                        System.out.print("Ingrese el numero de baños: ");
                        int noDB = entrada.nextInt();
                        System.out.println("Ingrese el numero de cuartos: ");
                        int noDC = entrada.nextInt();
                        Inmuebles.add(new Casa(noC, noB, color, ancho, largo, noDB, noDC, "Construccion en espera", "XXX"));
                        break;
                    case 2:
                        System.out.println("Ingrese el numero de pisos: ");
                        int noP = entrada.nextInt();
                        System.out.println("Ingrese la cantidad de locales: ");
                        int locales = entrada.nextInt();
                        System.out.println("Infrese la direccion por referecia: ");
                        String dirRef = entrad.nextLine();
                        Inmuebles.add(new Edificios(noP, locales, dirRef, "Contruccion en espera", "XXX"));
                        break;
                    case 3:
                        System.out.println("Ingrese el ancho: ");
                        ancho = entrada.nextInt();
                        System.out.println("Ingrese el largo: ");
                        largo = entrada.nextInt();
                        Inmuebles.add(new Solares(ancho, largo, "", "XXX"));
                        break;
                }
                break;
            case 2:
                System.out.println("");
                System.out.println("[1] Casa");
                System.out.println("[2] Edificio");
                System.out.println("[3] Solar");
                System.out.println("[4] Todos");
                inm = entrada.nextInt();
                switch(inm){
                    case 1:
                        for (Object t : Inmuebles) {
                            if(t instanceof Casa){
                                System.out.println(t.toString());
                            }
                        }
                        break;
                    case 2:
                        for (Object t : Inmuebles) {
                            if(t instanceof Edificios){
                                System.out.println(t.toString());
                            }
                        }
                        break;
                    case 3:
                        for (Object t : Inmuebles) {
                            if(t instanceof Casa){
                                System.out.println(t.toString());
                            }
                        }
                        break;
                    case 4:
                        break;
                }
                break;
            case 3:
                System.out.println("");
                System.out.println("[1] Casa");
                System.out.println("[2] Edificio");
                System.out.println("[3] Solar");
                inm = entrada.nextInt();
                switch(inm){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                break;
            case 4:
                System.out.println("");
                System.out.println("[1] Casa");
                System.out.println("[2] Edificio");
                System.out.println("[3] Solar");
                inm = entrada.nextInt();
                switch(inm){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                break;
            case 5:
                System.out.println("");
                System.out.println("[1] Casa");
                System.out.println("[2] Edificio");
                System.out.println("[3] Solar");
                inm = entrada.nextInt();
                switch(inm){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                break;
        }
    }
    
}
