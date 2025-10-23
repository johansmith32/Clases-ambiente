public class Lampara {
    String color;
    String marca;
    String modelo;
    String forma;
    String tamaño;
    int cantidadLeds;

    public Lampara(String color, String marca, String modelo, String forma, String tamaño, int cantidadLeds) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.forma = forma;
        this.tamaño = tamaño;
        this.cantidadLeds = cantidadLeds;
    }

    void prender() {}
    void apagar() {}

    public static void main(String[] args) {
        Lampara lampara = new Lampara("Blanco", "Philips", "LUX200", "Cilíndrica", "Mediana", 24);
    }
}
