public class PaletaCrema extends Paleta{
        // Atributo adicional
        private boolean cremosa;

    public PaletaCrema(String sabor, double precio, boolean cremosa) {
        super(sabor, precio);
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