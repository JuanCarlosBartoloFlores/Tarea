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

        System.out.println("\nInformación de PaletaFruta:");
        paletaFruta.mostrarInformacion();
        paletaFruta.mostrarSaborFruta();
        paletaFruta.cambiarPrecio(3.5);
    }
}
