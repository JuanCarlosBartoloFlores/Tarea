public class Enemigo extends Personaje{
    // Clase derivada "Enemigo"
        public String tipo;

        public Enemigo(String nombre, int nivel, String tipo) {
            super(nombre, nivel);
            this.tipo = tipo;
        }

        public void gritar() {
            System.out.println(nombre + ", el temible " + tipo + ", suelta un escalofriante grito!");
        }
    }