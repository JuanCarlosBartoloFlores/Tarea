package Ejercicio1FigurasGeométricasExepcions;
public class Class {
    public static void main(String[] args) {
        try {
            Circulo circulo = new Circulo("Círculo", 5);
            Rectangulo rectangulo = new Rectangulo("Rectángulo", 4, 6);
            Triangulo triangulo = new Triangulo("Triángulo", 3, 7);

            System.out.println("============================================");
            System.out.println("Áreas y Perimetro de Figuras Geométricas");
            System.out.println("============================================");
            System.out.println(circulo.nombre + " - El Área es: " + circulo.calcularArea());
            System.out.println("Perímetro: " + circulo.calcularPerimetro());
            System.out.println("============================================");
            System.out.println(rectangulo.nombre + " - El Área es: " + rectangulo.calcularArea());
            System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
            System.out.println("============================================");
            System.out.println(triangulo.nombre + " - El Área es: " + triangulo.calcularArea());
            System.out.println("Perímetro: " + triangulo.calcularPerimetro());
            System.out.println("============================================");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
