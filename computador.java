public class Computador {
    String tipo;
    String marca;
    String modelo;
    String color;
    String tamaño;
    String sistemaOperativo;
    int RAM;
    int discoDuro;
    String procesador;
    int almacenamiento;
    String estado;
    int cantidadEntradas;

    public Computador(String tipo, String marca, String modelo, String color, String tamaño, String sistemaOperativo, int RAM, int discoDuro, String procesador, int almacenamiento, String estado, int cantidadEntradas) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tamaño = tamaño;
        this.sistemaOperativo = sistemaOperativo;
        this.RAM = RAM;
        this.discoDuro = discoDuro;
        this.procesador = procesador;
        this.almacenamiento = almacenamiento;
        this.estado = estado;
        this.cantidadEntradas = cantidadEntradas;
    }

    void prender() {}
    void apagar() {}
    void subirVolumen() {}
    void bajarVolumen() {}
    void proyectar() {}
    void conectarWifi() {}
    void conectarBluetooth() {}
    void ejecutarAplicaciones() {}

    public static void main(String[] args) {
        Computador pc = new Computador("Portátil", "HP", "Pavilion", "Negro", "15 pulgadas", "Windows 11", 16, 512, "Intel i7", 1000, "Nuevo", 4);
        Computador laptop = new Computador("Laptop", "Dell", "XPS 13", "Plateado", "13 pulgadas", "Windows 10", 8, 256, "Intel i5", 500, "Usado", 3);
        Computador laptop2 = new Computador("laptop", "Dell", "Latitud", "Gris espacial", "11 pulgadas", "Windows 11", 6, 128, "Intel i5", 256, "Nuevo", 2);
        Computador laptop3 = new Computador("laptop", "Lenovo", "ThinkSystem", "Negro", "Rack 1U", "Linux", 64, 2048, "AMD EPYC", 4000, "Nuevo", 8);
        Computador laptop4 = new Computador("laptop", "Asus", "ROG", "Rojo", "N/A", "Windows 11", 32, 1024, "Intel i9", 2000, "Nuevo", 6);
    }
}
