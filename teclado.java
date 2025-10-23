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
        Teclado teclado2 = new Teclado("Membrana", "Logitech", "K120", "Blanco", 80, "Inglés");
        Teclado teclado3 = new Teclado("Ergonómico", "Microsoft", "Sculpt", "Gris", 90, "Francés");
        Teclado teclado4 = new Teclado("Inalámbrico", "Apple", "Magic Keyboard", "Plateado", 70, "Alemán");
        Teclado teclado5 = new Teclado("Gaming", "Razer", "BlackWidow", "RGB", 100, "Japonés");
    }
}
