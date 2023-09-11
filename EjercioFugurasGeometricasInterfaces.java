package Ejercicio1FigurasGeométricasInterfaces;
public abstract class FiguraGeometrica {
    protected String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}

package Ejercicio1FigurasGeométricasInterfaces;
public class Rectangulo extends FiguraGeometrica implements Dibujable {
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

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public void dibujar() {
        // Implementa la lógica de dibujo para un rectángulo
    }
}

package Ejercicio1FigurasGeométricasInterfaces;
public class Triangulo extends FiguraGeometrica{
    // Clase derivada Triangulo
    private double base;
    private double altura;

    public Triangulo(String nombre, double base, double altura) {
        super(nombre);
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Base y altura deben ser mayores que cero");
        }
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
    @Override
    public double calcularPerimetro() {
        return base + altura + Math.sqrt(base*base + altura*altura);
    }
}

package Ejercicio1FigurasGeométricasInterfaces;
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
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

package Ejercicio1FigurasGeométricasInterfaces;

public interface Dibujable {
        void dibujar();
}

package Ejercicio1FigurasGeométricasInterfaces;
public class Class {
    public static void main(String[] args) {
        try {
            FiguraGeometrica circulo = new Circulo("Círculo", 5);
            FiguraGeometrica rectangulo = new Rectangulo("Rectángulo", 4, 6);
            FiguraGeometrica triangulo = new Triangulo("Triángulo", 3, 7);

            System.out.println("============================================");
            System.out.println("Áreas y Perímetro de Figuras Geométricas");
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