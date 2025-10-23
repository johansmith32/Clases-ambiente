public class Soporte {
    String tipo;
    String material;
    String color;
    String tamaño;
    String marca;
    String modelo;
    String estado;

    public Soporte(String tipo, String material, String color, String tamaño, String marca, String modelo, String estado) {
        this.tipo = tipo;
        this.material = material;
        this.color = color;
        this.tamaño = tamaño;
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
    }

    public static void main(String[] args) {
        Soporte soporte = new Soporte("TV", "Metal", "Negro", "Mediano", "LG", "MountPro", "Nuevo");
    }
}
