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

        do {

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(usu.get(noUser).toString());
            System.out.println("Elija una opcion de lo que desea hacer:");
            System.out.println("[2]Registro de Inmueble/Solar");
            System.out.println("[2]Manejo de Estados");
            System.out.println("[3]Log In/Sign up");
            System.out.println("[4]Salir");
            System.out.println("[5]Comprar");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            int menuu = entrada.nextInt();
            System.out.println("");

            switch (menuu) {
                case 1:
                    if (user == true) {
                        regis(noUser, usu, Inmuebles);
                    } else {
                        System.out.println("Solo un administrador puede acceder esta opcion");
                    }

                    break;
                case 2:
                    if (user == true) {
                        System.out.println("Cual inmueble desea cambiar: ");
                        int pos = entrada.nextInt();
                        for (Object t : Inmuebles) {
                            //ya no puedo man :/
                        }
                    } else {
                        System.out.println("no no no");
                    }
                    break;
                case 3:
                    System.out.println("Ya tiene cuenta? Y/N");
                    char tiene = entrada.next().charAt(0);
                    switch (tiene) {
                        case 'y', 'Y':
                            System.out.print("Igrese su Usuario");
                            String usuario = entrada.next();
                            System.out.print("Igrese su Contraseña: ");
                            String pass = entrada.next();

                            for (Usuario t : usu) {
                                if (t.getUser().equals(usuario) && t.getPass().equals(pass)) {
                                    noUser = usu.indexOf(t);
                                    user = t.isAdmin();
                                } else {
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
                case 5:
                    System.out.println("Elija que desea comprar: ");
                    System.out.println("[1]Casa");
                    System.out.println("[2]Edificio");
                    System.out.println("[3]Solare");
                    int aaa = entrada.nextInt();
                    switch (aaa) {
                        case 1:
                            System.out.println("Ingrese la casa que desea comprar: ");
                            int in = entrada.nextInt();
                            int i =0;
                            for (Object t : Inmuebles) {
                                
                                if(t instanceof Casa && Inmuebles.indexOf(t) == in && ((Casa) Inmuebles.get(i)).getEstado().equals("Lista")){
                                    ((Casa) Inmuebles.get(in)).setNomb(usu.get(noUser).getNomb());
                                    
                                }
                                i++;
                            }
                            break;
                        case 2:
                            System.out.println("Ingrese el Edificio que desea comprar: ");
                            in = entrada.nextInt();
                            i =0;
                            for (Object t : Inmuebles) {
                                if(t instanceof Edificios && Inmuebles.indexOf(t) == in && ((Casa) Inmuebles.get(i)).getEstado().equals("Lista")){
                                    ((Edificios) Inmuebles.get(in)).setNomb(usu.get(noUser).getNomb());
                                    
                                }
                                i++;
                            }
                            break;
                        case 3:
                            System.out.println("Ingrese el solar que desea comprar: ");
                            in = entrada.nextInt();
                            i = 0;
                            for (Object t : Inmuebles) {
                                if(t instanceof Solares && Inmuebles.indexOf(t) == in && ((Casa) Inmuebles.get(i)).getEstado().equals("Lista")){
                                    ((Solares) Inmuebles.get(in)).setNomb(usu.get(noUser).getNomb());
                                    
                                }
                                i++;
                            }
                            break;
                    }

                    break;
            }
        } while (rep);

    }

    public static void regis(int noUser, ArrayList usu, ArrayList Inmuebles) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrad = new Scanner(System.in);
        System.out.println("[1]Crear Casas/Edificios/Solares\n"
                + "[2]Listar Casas/Edificios/Solares\n"
                + "[3]Modificar Casas/Edificios/Solares\n"
                + "[4]Borrar Casas/Edificios/Solares\n");
        int eli = entrada.nextInt();
        int inm;
        switch (eli) {
            case 1:
                System.out.println("");
                System.out.println("[1] Casa");
                System.out.println("[2] Edificio");
                System.out.println("[3] Solar");
                inm = entrada.nextInt();
                switch (inm) {
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
                        Inmuebles.add(new Solares(ancho, largo, "Construccion en espera", "XXX"));
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
                
                switch (inm) {
                    case 1:
                        int i = 0;
                        for (Object t : Inmuebles) {
                            
                            if (t instanceof Casa && ((Casa) Inmuebles.get(i)).getEstado().equals("Contruccion en espera")) {
                                System.out.println(Inmuebles.indexOf(t) + " " + t.toString());
                            }
                            i++;
                        }
                        i = 0;
                        for (Object t : Inmuebles) {
                            
                            if (t instanceof Casa && ((Casa) Inmuebles.get(i)).getEstado().equals("En construccion")) {
                                System.out.println(Inmuebles.indexOf(t) + " " + t.toString());
                            }
                            i++;
                        }
                        i = 0;
                        for (Object t : Inmuebles) {
                            
                            if (t instanceof Casa && ((Casa) Inmuebles.get(i)).getEstado().equals("Lista")) {
                                System.out.println(Inmuebles.indexOf(t) + " " + t.toString());
                            }
                            i++;
                        }
                        i=0;
                        for (Object t : Inmuebles) {
                            
                            if (t instanceof Casa && ((Casa) Inmuebles.get(i)).getEstado().equals("En espera de demolicion")) {
                                System.out.println(Inmuebles.indexOf(t) + " " + t.toString());
                            }
                            i++;
                        }
                        System.out.println("");
                        break;
                    case 2:
                        i = 0;
                        for (Object t : Inmuebles) {
                            
                            if (t instanceof Edificios && ((Edificios) Inmuebles.get(i)).getEstado().equals("Contruccion en espera")) {
                                System.out.println(Inmuebles.indexOf(t) + " " + t.toString());
                            }
                            i++;
                        }
                        i = 0;
                        for (Object t : Inmuebles) {
                            
                            if (t instanceof Edificios && ((Edificios) Inmuebles.get(i)).getEstado().equals("En construccion")) {
                                System.out.println(Inmuebles.indexOf(t) + " " + t.toString());
                            }
                            i++;
                        }
                        i = 0;
                        for (Object t : Inmuebles) {
                            
                            if (t instanceof Edificios && ((Edificios) Inmuebles.get(i)).getEstado().equals("Lista")) {
                                System.out.println(Inmuebles.indexOf(t) + " " + t.toString());
                            }
                            i++;
                        }
                        i = 0;
                        for (Object t : Inmuebles) {
                            
                            if (t instanceof Edificios && ((Edificios) Inmuebles.get(i)).getEstado().equals("En espera de demolicion")) {
                                System.out.println(Inmuebles.indexOf(t) + " " + t.toString());
                            }
                            i++;
                        }
                        System.out.println("");
                        break;
                    case 3:
                        i = 0;
                        for (Object t : Inmuebles) {
                            
                            if (t instanceof Solares && ((Solares) Inmuebles.get(i)).getEstado().equals("Contruccion en espera")) {
                                System.out.println(Inmuebles.indexOf(t) + " " + t.toString());
                            }
                            i++;
                        }
                        i = 0;
                        for (Object t : Inmuebles) {
                            
                            if (t instanceof Solares && ((Solares) Inmuebles.get(i)).getEstado().equals("En construccion")) {
                                System.out.println(Inmuebles.indexOf(t) + " " + t.toString());
                            }
                            i++;
                        }
                        i = 0;
                        for (Object t : Inmuebles) {
                            
                            if (t instanceof Solares && ((Solares) Inmuebles.get(i)).getEstado().equals("Lista")) {
                                System.out.println(Inmuebles.indexOf(t) + " " + t.toString());
                            }
                            i++;
                        }
                        i = 0;
                        for (Object t : Inmuebles) {
                            
                            if (t instanceof Solares && ((Solares) Inmuebles.get(i)).getEstado().equals("En espera de demolicion")) {
                                System.out.println(Inmuebles.indexOf(t) + " " + t.toString());
                            }
                            i++;
                        }
                        System.out.println("");
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
                int elij;
                switch (inm) {
                    case 1:
                        System.out.print("ELija posicion de la casa que desea modificar: ");
                        int pos = entrada.nextInt();
                        if (Inmuebles.get(pos) instanceof Casa) {

                            System.out.println("Elija lo que desee modificar:\n"
                                    + "[1] No. de casa\n"
                                    + "[2] No. de bloque\n"
                                    + "[3] Color\n"
                                    + "[4] Ancho y Largo\n"
                                    + "[5] No de Baños\n"
                                    + "[6] No. de Cuartos");
                            elij = entrada.nextInt();
                            switch (elij) {
                                case 1:
                                    System.out.print("Ingrese el numero de casa: ");
                                    int noC = entrada.nextInt();
                                    ((Casa) Inmuebles.get(pos)).setNoC(noC);
                                    break;
                                case 2:
                                    System.out.print("Ingrese el numero de bloque: ");
                                    int noB = entrada.nextInt();
                                    ((Casa) Inmuebles.get(pos)).setNoB(noB);
                                    break;
                                case 3:
                                    System.out.println("Ingrese el color: ");
                                    Color color = JColorChooser.showDialog(null, "Seleccione color", Color.black);
                                    ((Casa) Inmuebles.get(pos)).setColor(color);
                                    break;
                                case 4:
                                    System.out.print("Ingrese el ancho: ");
                                    int ancho = entrada.nextInt();
                                    ((Casa) Inmuebles.get(pos)).setAncho(ancho);
                                    System.out.print("Ingrese el largo: ");
                                    int largo = entrada.nextInt();
                                    ((Casa) Inmuebles.get(pos)).setLargo(largo);
                                    break;
                                case 5:
                                    System.out.print("Ingrese el numero de baños: ");
                                    int noDB = entrada.nextInt();
                                    ((Casa) Inmuebles.get(pos)).setNoDB(noDB);
                                    break;
                                case 6:
                                    System.out.println("Ingrese el numero de cuartos: ");
                                    int noDC = entrada.nextInt();
                                    ((Casa) Inmuebles.get(pos)).setNoDC(noDC);
                                    break;
                            }
                        }
                        break;
                    case 2:
                        System.out.print("ELija posicion de la casa que desea modificar: ");
                        pos = entrada.nextInt();
                        if (Inmuebles.get(pos) instanceof Casa) {

                            System.out.println("Elija lo que desee modificar:\n"
                                    + "[1] No. de pisos\n"
                                    + "[2] Cantidad de locales\n"
                                    + "[3] Direccion por referencia");
                            elij = entrada.nextInt();
                            switch (elij) {
                                case 1:
                                    System.out.println("Ingrese el numero de pisos: ");
                                    int noP = entrada.nextInt();
                                    ((Edificios) Inmuebles.get(pos)).setPisos(noP);
                                    break;
                                case 2:
                                    System.out.println("Ingrese la cantidad de locales: ");
                                    int locales = entrada.nextInt();
                                    ((Edificios) Inmuebles.get(pos)).setLocales(locales);
                                    break;
                                case 3:
                                    System.out.println("Infrese la direccion por referecia: ");
                                    String dirRef = entrad.nextLine();
                                    ((Edificios) Inmuebles.get(pos)).setDirRef(dirRef);
                                    break;
                            }
                        }
                        break;
                    case 3:
                        System.out.print("ELija posicion de la casa que desea modificar: ");
                        pos = entrada.nextInt();
                        if (Inmuebles.get(pos) instanceof Casa) {
                            System.out.println("Igrese el Ancho y Largo: ");
                            int ancho = entrada.nextInt();
                            ((Solares) Inmuebles.get(pos)).setAncho(ancho);
                            int largo = entrada.nextInt();
                            ((Solares) Inmuebles.get(pos)).setLargo(largo);
                        }
                        break;
                }
                break;
            case 4:
                System.out.println("");
                System.out.println("[1] Casa");
                System.out.println("[2] Edificio");
                System.out.println("[3] Solar");
                inm = entrada.nextInt();
                switch (inm) {
                    case 1:
                        System.out.println("Elija que casa desea destruir: ");
                        for (Object t : Inmuebles) {
                            if (t instanceof Casa) {
                                System.out.println(Inmuebles.indexOf(t) + " " + t);
                            }
                        }
                        int pos = entrada.nextInt();
                        if (Inmuebles.get(pos) instanceof Casa) {
                            Inmuebles.remove(pos);
                            System.out.println("Fue borrado!!");
                            System.out.println("");
                        }
                        break;
                    case 2:
                        System.out.println("Elija que casa desea destruir: ");
                        for (Object t : Inmuebles) {
                            if (t instanceof Edificios) {
                                System.out.println(Inmuebles.indexOf(t) + " " + t);
                            }
                        }
                        pos = entrada.nextInt();
                        if (Inmuebles.get(pos) instanceof Edificios) {
                            Inmuebles.remove(pos);
                            System.out.println("Fue borrado!!");
                            System.out.println("");
                        }
                        break;
                    case 3:
                        System.out.println("Elija que casa desea destruir: ");
                        for (Object t : Inmuebles) {
                            if (t instanceof Solares) {
                                System.out.println(Inmuebles.indexOf(t) + " " + t);
                            }
                        }
                        pos = entrada.nextInt();
                        if (Inmuebles.get(pos) instanceof Solares) {
                            Inmuebles.remove(pos);
                            System.out.println("Fue borrado!!");
                            System.out.println("");
                        }
                        break;
                }
                break;

        }
    }

}
