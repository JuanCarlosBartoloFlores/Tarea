package Ejercicio2JerarquíaPersonajeVideojuegoException;
import java.util.Scanner;
public class Ejecutar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================================================");
        System.out.println("|\t¡BIENVENIDO A Wizards, Warriors and Archers!    |");
        System.out.println("=====================================================");

        String nombreJugador = "";
        do {
            System.out.print("Ingresa el nombre de tu jugador: ");
            nombreJugador = scanner.nextLine();
        } while (nombreJugador.trim().isEmpty());

        System.out.print("Selecciona una clase para tu jugador (Guerrero, Mago, Arquero): ");
        String claseJugador = scanner.nextLine();

        Jugador jugador = null;
        try {
            jugador = new Jugador(nombreJugador, 1, claseJugador);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear el jugador: " + e.getMessage());
            System.out.println("Por favor, asegúrate de ingresar un nombre válido y una clase entre Guerrero, Mago o Arquero.");
            scanner.close();
            return;
        }

        System.out.println();
        System.out.println("Has creado a " + jugador.nombre + ", un valiente " + jugador.clase + " de nivel " + jugador.nivel + ".");
        System.out.println();

        System.out.println("¡Un enemigo se acerca! ¿Qué harás?");
        System.out.println("1. Atacar");
        System.out.println("2. Usar Habilidad Especial");
        int opcion = scanner.nextInt();

        Enemigo enemigo = new Enemigo("Esqueleto Oscuro", 5, "Esqueleto");

        Personaje[] personajes = new Personaje[]{jugador, enemigo};

        for (Personaje personaje : personajes) {
            try {
                personaje.atacar();
            } catch (RuntimeException e) {
                System.out.println("Error durante el ataque: " + e.getMessage());
            }
        }

        System.out.println();
        System.out.println("=====================================================");
        System.out.println("|\t\t¡Batalla concluida!                   |");
        System.out.println("=====================================================");
        System.out.println("¡La batalla ha terminado! " + jugador.nombre + " ha luchado valientemente contra el " + enemigo.nombre + ".");
        System.out.println(jugador.nombre + " ahora se siente más fuerte y ha subido a nivel " + (jugador.nivel + 1) + "!");

        scanner.close();
    }
}