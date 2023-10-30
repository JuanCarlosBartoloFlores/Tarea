package ClasesGenericas;
class Figura<T extends FiguraGeometrica> {
    private T figura;

    public Figura(T figura) {
        this.figura = figura;
    }

    public String getNombreFigura() {
        return figura.nombre;
    }

    public double calcularArea() {
        return figura.calcularArea();
    }
}

package ClasesGenericas;

class FiguraGeometrica {
    protected String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public double calcularArea() {
        return 0; // Método por defecto, se sobrescribirá en las clases derivadas
    }
}

package ClasesGenericas;
class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre); // Llama al constructor de la clase base para establecer el nombre
        this.radio = radio; // Inicializa el atributo específico de Circulo
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2); // Implementa el cálculo del área específico de Circulo
    }
}

package ClasesGenericas;
class Rectangulo extends FiguraGeometrica {
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

package ClasesGenericas;
class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

package ClasesGenericas;
import java.util.Scanner;
public class Prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("BIENVENIDO");

        System.out.println("<<Area del Circulo>>");
        System.out.print("Ingrese el radio del círculo: ");
        double radioCirculo = scanner.nextDouble();
        Circulo circulo = new Circulo("Círculo", radioCirculo);
        Figura<Circulo> figuraCirculo = new Figura<>(circulo);

        System.out.println("\n<<RECTANGULO>>");
        System.out.print("Ingrese la base del rectángulo: ");
        double baseRectangulo = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double alturaRectangulo = scanner.nextDouble();
        Rectangulo rectangulo = new Rectangulo("Rectángulo", baseRectangulo, alturaRectangulo);
        Figura<Rectangulo> figuraRectangulo = new Figura<>(rectangulo);

        System.out.println("\n<<TRIANGULO>>");
        System.out.print("Ingrese la base del triángulo: ");
        double baseTriangulo = scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double alturaTriangulo = scanner.nextDouble();
        Triangulo triangulo = new Triangulo("Triángulo", baseTriangulo, alturaTriangulo);
        Figura<Triangulo> figuraTriangulo = new Figura<>(triangulo);

        System.out.println("Tipo de figura: " + figuraCirculo.getNombreFigura() + ", Área: " + figuraCirculo.calcularArea());
        System.out.println("Tipo de figura: " + figuraRectangulo.getNombreFigura() + ", Área: " + figuraRectangulo.calcularArea());
        System.out.println("Tipo de figura: " + figuraTriangulo.getNombreFigura() + ", Área: " + figuraTriangulo.calcularArea());

        scanner.close();
    }
}
