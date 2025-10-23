public class ElementoAseo {
    String tipo;
    String marca;
    double altura;
    String color;
    String estado;

    public ElementoAseo(String tipo, String marca, double altura, String color, String estado) {
        this.tipo = tipo;
        this.marca = marca;
        this.altura = altura;
        this.color = color;
        this.estado = estado;
    }

    public static void main(String[] args) {
        ElementoAseo escoba = new ElementoAseo("Escoba", "AsearPlus", 1.2, "Verde", "Nuevo");
    }
}
