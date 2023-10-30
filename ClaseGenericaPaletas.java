package Ejercicio3JerarquíaPaletasPaleteríaExepcions;

public class Paleta {
    protected String sabor;
    protected double precio;
    private boolean tieneAzucar;
    private CaracteristicasPaleta caracteristicasPaleta;

    public Paleta(String sabor, double precio, boolean tieneAzucar, CaracteristicasPaleta caracteristicasPaleta) {
        this.sabor = sabor;
        this.precio = precio;
        this.tieneAzucar = tieneAzucar;
        this.caracteristicasPaleta = caracteristicasPaleta;
    }

    public void mostrarInformacion() {
        System.out.println("Sabor: " + sabor);
        System.out.println("Precio: " + precio);
        System.out.println("Tiene azúcar: " + (tieneAzucar ? "Sí" : "No"));
        caracteristicasPaleta.mostrarCaracteristicas();
    }

    public void cambiarPrecio(double cambio) {
        this.precio += cambio;
    }
}

package Ejercicio3JerarquíaPaletasPaleteríaExepcions;

public interface CaracteristicasPaleta {
    void mostrarCaracteristicas();
}

package Ejercicio3JerarquíaPaletasPaleteríaExepcions;

public class PaletaGenerica<T extends CaracteristicasPaleta> {
    protected String sabor;
    protected double precio;
    private boolean tieneAzucar;
    private T caracteristicasPaleta;

    public PaletaGenerica(String sabor, double precio, boolean tieneAzucar, T caracteristicasPaleta) {
        this.sabor = sabor;
        this.precio = precio;
        this.tieneAzucar = tieneAzucar;
        this.caracteristicasPaleta = caracteristicasPaleta;
    }

    public void mostrarInformacion() {
        System.out.println("Sabor: " + sabor);
        System.out.println("Precio: " + precio);
        System.out.println("Tiene azúcar: " + (tieneAzucar ? "Sí" : "No"));
        caracteristicasPaleta.mostrarCaracteristicas();
    }

    public void cambiarPrecio(double cambio) {
        this.precio += cambio;
    }
}

package Ejercicio3JerarquíaPaletasPaleteríaExepcions;

public interface CaracteristicasPaleta {
    void mostrarCaracteristicas();
}

package Ejercicio3JerarquíaPaletasPaleteríaExepcions;

public class PaletaAgua implements CaracteristicasPaleta {
    private boolean baseAgua;

    public PaletaAgua(boolean baseAgua) {
        this.baseAgua = baseAgua;
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Base de agua: " + (baseAgua ? "Sí" : "No"));
    }
}

package Ejercicio3JerarquíaPaletasPaleteríaExepcions;

public class PaletaCrema implements CaracteristicasPaleta {
    private boolean cremosa;

    public PaletaCrema(boolean cremosa) {
        this.cremosa = cremosa;
    }

    @Override
    public void mostrarCaracteristicas() {
        System.println("Textura cremosa: " + (cremosa ? "Sí" : "No"));
    }
}

public class Ejecutar {
    public static void main(String[] args) {
        PaletaGenerica<PaletaAgua> paletaAgua = new PaletaGenerica<>("Fresa", 18.0, true, new PaletaAgua(true));
        PaletaGenerica<PaletaCrema> paletaCrema = new PaletaGenerica<>("Chocolate", 22.0, true, new PaletaCrema(true));

        System.out.println("Información de PaletaAgua:");
        paletaAgua.mostrarInformacion();
        paletaAgua.cambiarPrecio(2.0);

        System.out.println("\nInformación de PaletaCrema:");
        paletaCrema.mostrarInformacion();
        paletaCrema.cambiarPrecio(6.0);
    }
}

