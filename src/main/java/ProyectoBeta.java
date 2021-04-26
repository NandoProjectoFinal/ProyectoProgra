import java.util.Scanner;

public class ProyectoBeta {
    public static void main(String[] args) {
        menu();
        funcion();
    }

    private static void funcion() {
        ingresoDatos();
        validacion(ingresoDatos());
    }

    private static String ingresoDatos() {
        Scanner teclado = new Scanner(System.in);
        String a = teclado.next();
        return a;
    }

    private static boolean validacion(String ingresoDatos) {
        boolean a = false;
        switch (ingresoDatos){
            case "1":
                System.out.println("Lista de arboles");
                a = true;
                break;
            case "2":
                System.out.println("Lista de Lugares");
                a = true;
                break;
            case "3":
                System.out.println("Animales de la zona");
                a= true;
                break;
            default:
                System.out.println("opcion no valida");
                a= false;
                break;
        }
        return a;
    }

    private static void menu() {
        System.out.println("[][][][][][][]][][][[][][][][][][][][][][][][][][][][][][]");
        System.out.println("||||||||||||||Bienvenido a Guía del Perdido||||||||||||||");
        System.out.println("[][][][][][][]][][][[][][][][][][][][][][][][][][][][][][]");
        System.out.println("Desea ver " +"\n"+"[1] Lista de arboles" + "\n" + "[2] Lista de lugares turisticos"
                + "\n" + "[3] Animales de la zona");
    }

}
