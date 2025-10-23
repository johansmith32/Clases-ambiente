public class Television {
    String marca;
    String modelo;
    String estado;
    boolean tactil;
    String display;
    double pulgadas;
    int cantidadEntradas;
    int cantidadBotones;

    public Television(String marca, String estado, boolean tactil, String display, double pulgadas, int cantidadEntradas, int cantidadBotones, String modelo) {
        this.marca = marca;
        this.estado = estado;
        this.tactil = tactil;
        this.display = display;
        this.pulgadas = pulgadas;
        this.cantidadEntradas = cantidadEntradas;
        this.cantidadBotones = cantidadBotones;
        this.modelo = modelo;
    }

    void prender() {}
    void subirVolumen() {}
    void bajarVolumen() {}
    void proyectar() {}
    void apagar() {}

    public static void main(String[] args) {
        Television tv = new Television("Samsung", "Nuevo", true, "LED", 55.0, 4, 3, "QLED2024");
        Television tv2 = new Television("LG", "Usado", false, "OLED", 65.0, 5, 4, "OLED2023");
        Television tv3 = new Television("Sony", "Nuevo", true, "LCD", 50.0, 3, 2, "BRAVIA2024");
        Television tv4 = new Television("Panasonic", "Reacondicionado", false, "Plasma", 42.0, 2, 3, "Viera2022");
        Television tv5 = new Television("TCL", "Nuevo", true, "QLED", 75.0, 6, 5, "QLED2024Pro");
    }
}