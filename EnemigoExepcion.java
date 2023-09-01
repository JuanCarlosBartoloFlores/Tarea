package Ejercicio2JerarquíaPersonajeVideojuegoException;
public class Enemigo extends Personaje{
    String tipo;

    public Enemigo(String nombre, int nivel, String tipo) {
        super(nombre, nivel);
        this.tipo = tipo;
    }

    public void gritar() {
        System.out.println(nombre + " ha emitido un grito aterrador.");
    }
}