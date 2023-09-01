package Ejercicio1FigurasGeométricasExepcions;
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