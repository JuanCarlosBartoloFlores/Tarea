package Ejercicio2JerarquíaPersonajeVideojuegoException;
public class Jugador extends Personaje{
    String clase;

    public Jugador(String nombre, int nivel, String clase) {
        super(nombre, nivel);
        this.clase = clase;
    }
}