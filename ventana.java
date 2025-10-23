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
        Ventana ventana2 = new Ventana("Marrón", "Mediana", "Abatible", "Manual", 0.8, "Laminado", "Usada");
        Ventana ventana3 = new Ventana("Negra", "Pequeña", "Fija", "Sin cerradura", 1.0, "Simple", "Nueva");
        Ventana ventana4 = new Ventana("Gris", "Grande", "Oscilobatiente", "Automática", 0.7, "Doble", "Usada");
        Ventana ventana5 = new Ventana("Azul", "Mediana", "Pivotante", "Manual", 0.85, "Templado", "Nueva");
    }
}
