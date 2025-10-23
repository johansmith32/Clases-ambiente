public class Teclado {
    String tipo;
    String marca;
    String modelo;
    String color;
    int porcentaje;
    String idioma;

    public Teclado(String tipo, String marca, String modelo, String color, int porcentaje, String idioma) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.porcentaje = porcentaje;
        this.idioma = idioma;
    }

    void teclear() {}
    void activarAtajos() {}

    public static void main(String[] args) {
        Teclado teclado = new Teclado("Mecánico", "Redragon", "K552", "Negro", 100, "Español");
    }
}
