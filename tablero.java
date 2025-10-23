public class Tablero {
    String color;
    String material;
    String tamaño;
    String tipo;
    String marca;
    String forma;
    double altura;

    public Tablero(String color, String material, String tamaño, String tipo, String marca, String forma, double altura) {
        this.color = color;
        this.material = material;
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.marca = marca;
        this.forma = forma;
        this.altura = altura;
    }

    public static void main(String[] args) {
        Tablero tablero = new Tablero("Blanco", "Acrílico", "Grande", "Marcador", "Pilot", "Rectangular", 1.8);
    }
}
