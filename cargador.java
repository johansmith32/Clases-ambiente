public class Cargador {
    String tipo;
    String marca;
    String modelo;
    String color;
    double longitudCable;
    String tipoEntrada;
    String estado;

    public Cargador(String tipo, String marca, String modelo, String color, double longitudCable, String tipoEntrada, String estado) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.longitudCable = longitudCable;
        this.tipoEntrada = tipoEntrada;
        this.estado = estado;
    }

    void pasoDeElectricidad() {}

    public static void main(String[] args) {
        Cargador cargador = new Cargador("USB-C", "Anker", "PowerLine", "Blanco", 1.5, "Tipo C", "Nuevo");
    }
}
