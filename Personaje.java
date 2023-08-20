public class Personaje {
    // Clase base "Personaje"
        public String nombre;
        public int nivel;

        public Personaje(String nombre, int nivel) {
            this.nombre = nombre;
            this.nivel = nivel;
        }

        public void atacar() {
            System.out.println(nombre + " realiza un ataque!");
        }
    }