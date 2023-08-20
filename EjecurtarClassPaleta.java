public class Ejecutar {
    public static void main(String[] args) {
        PaletaAgua paletaAgua = new PaletaAgua("Fresa", 15.0, true);
        PaletaCrema paletaCrema = new PaletaCrema("Chocolate", 20.0, true);

        System.out.println("Información de PaletaAgua:");
        paletaAgua.mostrarInformacion();
        paletaAgua.mostrarBaseAgua();
        paletaAgua.cambiarPrecio(2.0);

        System.out.println("\nInformación de PaletaCrema:");
        paletaCrema.mostrarInformacion();
        paletaCrema.mostrarTexturaCremosa();
        paletaCrema.cambiarPrecio(6.0);
    }
}