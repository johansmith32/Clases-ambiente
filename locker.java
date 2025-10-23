public class Locker {
    String color;
    String tamaño;
    String marca;
    String modelo;
    int cantidadCajones;
    String forma;
    String estado;

    public Locker(String color, String tamaño, String marca, String modelo, int cantidadCajones, String forma, String estado) {
        this.color = color;
        this.tamaño = tamaño;
        this.marca = marca;
        this.modelo = modelo;
        this.cantidadCajones = cantidadCajones;
        this.forma = forma;
        this.estado = estado;
    }

    void guardarObjetos() {}

    public static void main(String[] args) {
        Locker locker = new Locker("Gris", "Grande", "MetalBox", "L500", 4, "Rectangular", "Nuevo");
    }
}
