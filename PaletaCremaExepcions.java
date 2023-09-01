package Ejercicio3JerarquíaPaletasPaleteríaExepcions;
public class PaletaCrema extends Paleta{
    private boolean cremosa;

    public PaletaCrema(String sabor, double precio, boolean cremosa) {
        super(sabor, precio, true);
        this.cremosa = cremosa;
    }

    public void mostrarTexturaCremosa() {
        System.out.println("Textura cremosa: " + (cremosa ? "Sí" : "No"));
    }

    @Override
    public void cambiarPrecio(double cambio) {
        super.cambiarPrecio(cambio);
        System.out.println("Nuevo precio de PaletaCrema: $" + precio);
    }
}