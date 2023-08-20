public class Circulo extends FiguraGeometrica {
    // Clase derivada Circulo
        private double radio;

        public Circulo(String nombre, double radio) {
            super(nombre);
            this.radio = radio;
        }

        @Override
        public double calcularArea() {
            return Math.PI * Math.pow(radio, 2);
        }
    }