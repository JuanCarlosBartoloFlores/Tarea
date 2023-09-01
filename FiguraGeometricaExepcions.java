package Ejercicio1FigurasGeométricasExepcions;
public class FiguraGeometrica {
    // Clase base FiguraGeometrica
        protected String nombre;
        public FiguraGeometrica(String nombre) {

            this.nombre = nombre;
        }
        public double calcularArea() {
            return 0; // Método a ser sobrescrito en las clases derivadas
        }
    public double calcularPerimetro() {
        return 0; // Método a ser sobrescrito en las clases derivadas
    }
}