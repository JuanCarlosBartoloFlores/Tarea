package Ejercicio3JerarquíaPaletasPaleteríaExepcions;
public class PaletaFruta extends Paleta {
    private String saborFruta;

    public PaletaFruta(String sabor, double precio, boolean tieneAzucar, String saborFruta) {
        super(sabor, precio, tieneAzucar);
        this.saborFruta = saborFruta;
    }

    public void mostrarSaborFruta() {
        System.out.println("Sabor de fruta: " + saborFruta);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        mostrarSaborFruta();
    }
}
