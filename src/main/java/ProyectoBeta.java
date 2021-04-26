import java.util.Scanner;

public class ProyectoBeta {
    public static void main(String[] args) {
        System.out.println("fdjskfdsj");
        funcion();
    }

    private static void funcion() {
        boolean a;
        do {
            menu();
            ingresoDatos();
            a = validacion(ingresoDatos());
        }while (!a);

    }

    private static String ingresoDatos() {
        Scanner teclado = new Scanner(System.in);
        return teclado.next();
    }

    private static boolean validacion(String ingresoDatos) {
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

    private static void menu() {
        System.out.println("[][][][][][][]][][][[][][][][][][][][][][][][][][][][][][]");
        System.out.println("||||||||||||||Bienvenido a Guía del Perdido||||||||||||||");
        System.out.println("[][][][][][][]][][][[][][][][][][][][][][][][][][][][][][]");
        System.out.println("""
                Desea ver\s
                [1] Lista de arboles
                [2] Lista de lugares turisticos
                [3] Animales de la zona""");
    }

}
