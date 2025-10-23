public class CableVideo {
    String tipo;
    double longitud;
    String color;
    String estado;

    public CableVideo(String tipo, double longitud, String color, String estado) {
        this.tipo = tipo;
        this.longitud = longitud;
        this.color = color;
        this.estado = estado;
    }

    void transmitirDatos() {}

    public static void main(String[] args) {
        CableVideo cable = new CableVideo("HDMI", 1.5, "Negro", "Nuevo");
    }
}
