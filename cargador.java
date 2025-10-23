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
        Cargador cargador1 = new Cargador("Micro-USB", "Samsung", "FastCharge", "Negro", 1.0, "Micro-USB", "Usado");
        Cargador cargador2 = new Cargador("Lightning", "Apple", "MagSafe", "Gris", 1.2, "Lightning", "Nuevo");
        Cargador cargador3 = new Cargador("USB-A", "Belkin", "BoostCharge", "Azul", 2.0, "USB-A", "Nuevo");
        Cargador cargador4 = new Cargador("USB-C", "RAVPower", "PD Pioneer", "Rojo", 1.8, "Tipo C", "Usado");
        Cargador cargador5 = new Cargador("Micro-USB", "LG", "QuickCharge", "Verde", 1.3, "Micro-USB", "Nuevo");
    }
}
