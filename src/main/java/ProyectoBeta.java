import java.util.Scanner;

public class ProyectoBeta {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        funcion();
    }

    public static void funcion() {
        boolean a;
        do {
            menuPrincipal();
            a = validacion(ingresoDatos());
        } while (!a);

    }

    public static String ingresoDatos() {
        return teclado.next();
    }

    public static boolean validacion(String ingresoDatos) {
        boolean a;
        switch (ingresoDatos) {
            case "1" -> {
                System.out.println("Lista de arboles");
                a = true;
            }
            case "2" -> {
                System.out.println("Lista de Lugares");
                a = true;
            }
            case "3" -> {
                System.out.println("Animales de la zona");
                a = true;
            }
            default -> {
                System.out.println("opcion no valida");
                a = false;
            }
        }
        return a;
    }

    public static void menuPrincipal() {
        System.out.println("[][][][][][][]][][][[][][][][][][][][][][][][][][][][][][]");
        System.out.println("||||||||||||||Bienvenido a Guía del Perdido||||||||||||||");
        System.out.println("[][][][][][][]][][][[][][][][][][][][][][][][][][][][][][]");
        System.out.println("Que desea hacer");
        System.out.println("[1] ver Arboles");
        System.out.println("[2] ver Lugares");
        System.out.println("[3] ver Animales");
    }

}
