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
        Puerta puerta2 = new Puerta("Blanca", "Mediana", "Corredera", "Llave", "Metal", "Usada", "SafeHome", "LockPro");
        Puerta puerta3 = new Puerta("Negra", "Pequeña", "Plegable", "Biométrica", "PVC", "Nueva", "SecureIt", "BioLock");
        Puerta puerta4 = new Puerta("Roja", "Grande", "Abatible", "Llave", "Madera", "Usada", "DoorGuard", "ClassicLock");
        Puerta puerta5 = new Puerta("Azul", "Mediana", "Corredera", "Digital", "Metal", "Nueva", "TechSafe", "DigitLock");
    }
}
