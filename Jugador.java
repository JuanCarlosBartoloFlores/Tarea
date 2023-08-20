public class Jugador extends Personaje{
    // Clase derivada "Jugador"
        public String clase;

        public Jugador(String nombre, int nivel, String clase) {
            super(nombre, nivel);
            this.clase = clase;
        }

        public void usarHabilidadEspecial() {
            System.out.println(nombre + " el " + clase + " desata una habilidad especial asombrosa!");
        }
    }