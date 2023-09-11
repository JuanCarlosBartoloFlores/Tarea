package Ejercicio3JerarquíaPaletasPaleteríaExepcions;
public class Paleta {
    protected String sabor;
    protected double precio;
    private boolean tieneAzucar;

    public Paleta(String sabor, double precio, boolean tieneAzucar) {
        // Constructor existente
    }

    public void mostrarInformacion() {

    }

    public void cambiarPrecio(double cambio) {
        // Método para cambiar el precio
    }
}

package Ejercicio3JerarquíaPaletasPaleteríaExepcions;
public class PaletaAgua extends Paleta implements HabilidadesAgua {
    private boolean baseAgua;

    public PaletaAgua(String sabor, double precio, boolean baseAgua) {
        super(sabor, precio, true);
        this.baseAgua = baseAgua;
    }

    @Override
    public void mostrarBaseAgua() {
        System.out.println("Base de agua: " + (baseAgua ? "Sí" : "No"));
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        mostrarBaseAgua();
    }
}

package Ejercicio3JerarquíaPaletasPaleteríaExepcions;
public class PaletaCrema extends Paleta implements HabilidadesCremosas {
    private boolean cremosa;

    public PaletaCrema(String sabor, double precio, boolean cremosa) {
        super(sabor, precio, true);
        this.cremosa = cremosa;
    }

    @Override
    public void mostrarTexturaCremosa() {
        System.out.println("Textura cremosa: " + (cremosa ? "Sí" : "No"));
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        mostrarTexturaCremosa();
    }
}

package Ejercicio3JerarquíaPaletasPaleteríaExepcions;

public interface HabilidadesCremosas {
    void mostrarTexturaCremosa();
}

package Ejercicio3JerarquíaPaletasPaleteríaExepcions;

public interface HabilidadesAgua {
    void mostrarBaseAgua();
}

package Ejercicio3JerarquíaPaletasPaleteríaExepcions;
public class Ejecutar {
    public static void main(String[] args) {
        Paleta paletaAgua = new PaletaAgua("Fresa", 18.0, true);
        Paleta paletaCrema = new PaletaCrema("Chocolate", 22.0, true);
        PaletaFruta paletaFruta = new PaletaFruta("Mango", 14.0, true, "Mango maduro");

        System.out.println("Información de PaletaAgua:");
        paletaAgua.mostrarInformacion();
        ((PaletaAgua) paletaAgua).mostrarBaseAgua();
        paletaAgua.cambiarPrecio(2.0);

        System.out.println("\nInformación de PaletaCrema:");
        paletaCrema.mostrarInformacion();
        ((PaletaCrema) paletaCrema).mostrarTexturaCremosa();
        paletaCrema.cambiarPrecio(6.0);

    }
}