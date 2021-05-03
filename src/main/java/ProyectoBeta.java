import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ProyectoBeta {
    static String ruta = "C:\\Users\\HP\\ProyectoProgra\\";
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        iniciarPrograma();
    }

    public static void iniciarPrograma() {
        boolean b;
        do {
            mostrarIdioma();
            b = elegirOpcionIdioma(ingresarRespuesta());
        } while (!b);
    }

    public static void mostrarIdioma() {
        System.out.println("*                   Bienvenido/Welcome                     *");
        System.out.println("Por favor, antes de continuar, selecciones un idioma o salga del programa");
        System.out.println("Please before to continue, select one opcion of language or exit of this program");
        System.out.println("[1] Español ");
        System.out.println("[2] English");
        System.out.println("[3] Salir/exit");
    }


    public static boolean elegirOpcionIdioma(String seleccionOpcion) {
        boolean b;
        switch (seleccionOpcion) {
            case "1": {
                System.out.println("Usted ha seleccionado español");
                b = true;
                validarRespuesta();
                break;
            }
            case "2": {
                System.out.println("you selected English");
                b = true;
                break;
            }
            case "3": {
                b = true;
                System.out.println("El programa ha finalizado");
                break;
            }
            default: {
                System.out.println("opcion no valida");
                b = false;
                break;
            }

        }
        return b;
    }

    public static void validarRespuesta() {
        boolean a;
        do {
            menuPrincipal();
            a = tipodeBusqueda(ingresarRespuesta());
        } while (!a);

    }

    public static String ingresarRespuesta() {
        return teclado.next();
    }

    public static boolean tipodeBusqueda(String ingresoDatos) {
        boolean a;
        switch (ingresoDatos) {
            case "1" -> {
                System.out.println("Lista de lugares turísticos");
                a = true;
                mostrarLugares();
            }
            case "2" -> {
                System.out.println("Lista de árboles nativos");
                a = true;
                mostrarArboles();
            }
            case "3" -> {
                System.out.println("Lista de animales nativos de la zona");
                a = true;
                mostrarAnimales();
                seleccionarTipoAnimal();
            }
            default -> {
                System.out.println("opcion no valida");
                a = false;
            }
        }
        return a;
    }

    private static void seleccionarTipoAnimal() {
        String opcion = "";
        boolean a;
        do {
            opcion = teclado.next();
            a = validarAnimal(opcion);
            switch (opcion) {
                case "1": {
                    System.out.println("Mamiferos");
                    mamiferos();
                    break;
                }
                case "2": {
                    System.out.println("Reptiles");
                    reptiles();
                    break;
                }
                case "3": {
                    System.out.println("anfibios");
                    anfibios();
                    break;
                }
                case "4": {
                    System.out.println("aves");
                    aves();
                    break;
                }
                case "5": {
                    System.out.println("peces");
                    peces();
                    break;
                }
                case "6": {
                    System.out.println("Insectos");
                    insectos();
                    break;
                }
                default: {
                    System.out.println("Opción no válida");
                    mostrarAnimales();
                    a = false;
                    break;
                }
            }
        } while (a == false);
    }

    public static boolean validarAnimal(String dato) {
        try {
            int numero = Integer.parseInt(dato);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    private static void insectos() {
        muestraContenido(ruta + "Animales\\Insectos");
    }

    public static void mostrarAnimales() {
        System.out.println("\nEsta es una lista de los animales que se pueden\n" +
                "encontrar en la IX Región de La Araucanía ");
        System.out.println("\n Para acceder a ellos, seleccione el tipo de animal que desea observar");
        System.out.println("[1] Mamiferos");
        System.out.println("[2] Reptiles");
        System.out.println("[3] Anfibios");
        System.out.println("[4] Aves");
        System.out.println("[5] Peces");
        System.out.println("[6] Insectos");
    }

    private static void anfibios() {
        muestraContenido(ruta + "Animales\\Anfibios");
    }

    private static void aves() {
        muestraContenido(ruta + "Animales\\Aves");
    }

    private static void peces() {
        muestraContenido(ruta + "Animales\\Peces");
    }

    private static void muestraContenido(String ruta) {
        String cadena = "";
        FileReader f = null;
        try {
            f = new FileReader(ruta);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader b = new BufferedReader(f);
        while (true) {
            try {
                if (!((cadena = b.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(cadena);
        }
        try {
            b.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void reptiles() {
        muestraContenido(ruta + "Animales\\Reptiles");
    }

    private static void mamiferos() {
        muestraContenido(ruta + "Animales\\Mamiferos");
    }

    public static void mostrarArboles() {
        muestraContenido(ruta + "Flora\\Flora");
    }

    public static void mostrarLugares() {
        muestraContenido(ruta + "Lugares\\Lugares");
    }

    public static void menuPrincipal() {
        System.out.println("**********************************************************");
        System.out.println("*              Bienvenido a Guía del Perdido             *");
        System.out.println("**********************************************************");
        System.out.println("Por favor, seleccione una de las opcíones");
        System.out.println("[1] ver lugares turísticos");
        System.out.println("[2] ver árboles nativos");
        System.out.println("[3] ver animales nativos");
    }
}