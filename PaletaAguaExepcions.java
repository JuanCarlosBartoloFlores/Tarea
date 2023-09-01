package Ejercicio3JerarquíaPaletasPaleteríaExepcions;
public class PaletaAgua extends Paleta {
    private boolean baseAgua;

    public PaletaAgua(String sabor, double precio, boolean baseAgua) {
        super(sabor, precio, true);
        this.baseAgua = baseAgua;
    }

    public void mostrarBaseAgua() {
        System.out.println("Base de agua: " + (baseAgua ? "Sí" : "No"));
    }

    @Override
    public void cambiarPrecio(double cambio) {
        super.cambiarPrecio(cambio);
        System.out.println("Nuevo precio de PaletaAgua: $" + precio);
    }
}