public class Puerta {
    String color;
    String tamaño;
    String tipo;
    String cerradura;
    String material;
    String estado;
    String marca;
    String modelo;

    public Puerta(String color, String tamaño, String tipo, String cerradura, String material, String estado, String marca, String modelo) {
        this.color = color;
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.cerradura = cerradura;
        this.material = material;
        this.estado = estado;
        this.marca = marca;
        this.modelo = modelo;
    }

    public static void main(String[] args) {
        Puerta puerta = new Puerta("Café", "Grande", "Abatible", "Digital", "Madera", "Nueva", "HomeSafe", "SecureX");
    }
}
