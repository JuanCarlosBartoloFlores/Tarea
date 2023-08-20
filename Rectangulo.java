public class Rectangulo extends FiguraGeometrica{
    // Clase derivada Rectangulo
        private double base;
        private double altura;
        public Rectangulo(String nombre, double base, double altura) {
            super(nombre);
            this.base = base;
            this.altura = altura;
        }
        @Override
        public double calcularArea() {
            return base * altura;
        }
    }
