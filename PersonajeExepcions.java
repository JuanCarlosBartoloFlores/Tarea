package Ejercicio2JerarquíaPersonajeVideojuegoException;
public class Personaje {
    String nombre;
    int nivel;

    public Personaje(String nombre, int nivel) {
        if (nivel < 1) {
            throw new IllegalArgumentException("El nivel no puede ser menor que 1.");
        }
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public void atacar() {
        if (nivel < 5) {
            throw new RuntimeException("El nivel debe ser al menos 5 para realizar un ataque.");
        }
        System.out.println(nombre + " ha realizado un ataque.");
    }
}