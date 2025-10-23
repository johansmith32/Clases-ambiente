public class lampara {
    String color;
    String marca;
    String modelo;
    String forma;
    String tamaño;
    int cantidadLeds;

    public lampara(String color, String marca, String modelo, String forma, String tamaño, int cantidadLeds) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.forma = forma;
        this.tamaño = tamaño;
        this.cantidadLeds = cantidadLeds;
    }

    void prender() {}
    void apagar() {}

    public static void main(String[] args) {
        lampara lampara = new lampara("Blanco", "Philips", "LUX200", "Cilíndrica", "Mediana", 24);
        lampara lampara2 = new lampara("Amarillo", "Osram", "BRIGHT100", "Esférica", "Pequeña", 12);
        lampara lampara3 = new lampara("Azul", "GE", "COOL300", "Rectangular", "Grande", 36);
        lampara lampara4 = new lampara("Rojo", "Panasonic", "LIGHT400", "Ovalada", "Mediana", 18);
        lampara lampara5 = new lampara("Verde", "Samsung", "SHINE500", "Cónica", "Pequeña", 20);
    }
}
