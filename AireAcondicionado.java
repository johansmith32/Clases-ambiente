public class AireAcondicionado {
    String marca;
    String modelo;
    String tipo;
    String color;
    String tamaño;
    String estado;

    public AireAcondicionado(String marca, String modelo, String tipo, String color, String tamaño, String estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.color = color;
        this.tamaño = tamaño;
        this.estado = estado;
    }

    void prender() {}
    void apagar() {}
    void ventilar() {}
    void cambiarModo() {}

    public static void main(String[] args) {
        AireAcondicionado aire = new AireAcondicionado("Samsung", "CoolMax200", "Split", "Blanco", "Mediano", "Nuevo");
        AireAcondicionado aire2 = new AireAcondicionado("LG", "AirPro300", "Ventana", "Gris", "Grande", "Usado");
        AireAcondicionado aire3 = new AireAcondicionado("Daikin", "FreshBreeze100", "Portátil", "Blanco", "Pequeño", "Nuevo");
        AireAcondicionado aire4 = new AireAcondicionado("Hitachi", "ComfortPlus400", "Split", "Negro", "Grande", "Usado");
        AireAcondicionado aire5 = new AireAcondicionado("Mitsubishi", "EcoAir500", "Ventana", "Blanco", "Mediano", "Nuevo");

    }
}
