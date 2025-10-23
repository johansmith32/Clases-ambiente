public class Ventana {
    String color;
    String tamaño;
    String tipo;
    String cerradura;
    double transparencia;
    String tipoVidrio;
    String estado;

    public Ventana(String color, String tamaño, String tipo, String cerradura, double transparencia, String tipoVidrio, String estado) {
        this.color = color;
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.cerradura = cerradura;
        this.transparencia = transparencia;
        this.tipoVidrio = tipoVidrio;
        this.estado = estado;
    }

    public static void main(String[] args) {
        Ventana ventana = new Ventana("Blanca", "Grande", "Corrediza", "Automática", 0.9, "Templado", "Nueva");
    }
}
