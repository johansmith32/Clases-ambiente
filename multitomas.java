public class Multitomas {
    String tipo;
    int cantidadTomas;
    String color;
    String tamaño;
    double longitudCable;
    String ubicacion;

    public Multitomas(String tipo, int cantidadTomas, String color, String tamaño, double longitudCable, String ubicacion) {
        this.tipo = tipo;
        this.cantidadTomas = cantidadTomas;
        this.color = color;
        this.tamaño = tamaño;
        this.longitudCable = longitudCable;
        this.ubicacion = ubicacion;
    }

    void aumentarFlujoDeEnergia() {}

    public static void main(String[] args) {
        Multitomas multitomas = new Multitomas("Protegida", 6, "Blanco", "Grande", 2.0, "Oficina");
    }
}
