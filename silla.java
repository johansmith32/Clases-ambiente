public class Silla {
    String color;
    String material;
    String tamaño;
    String tipo;
    String modelo;
    String marca;
    String estado;
    String forma;

    public Silla(String color, String material, String tamaño, String tipo, String modelo, String marca, String estado, String forma) {
        this.color = color;
        this.material = material;
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.modelo = modelo;
        this.marca = marca;
        this.estado = estado;
        this.forma = forma;
    }

    public static void main(String[] args) {
        Silla silla = new Silla("Negro", "Acolchado", "Mediana", "Aprendiz", "X100", "Rimax", "Nueva", "Normal");
        Silla silla2 = new Silla("Azul", "Plastico", "Mediana", "Aprendiz", "B200", "OfficePro", "Medio dañada", "Normal");
        Silla silla3 = new Silla("Rojo", "Acolchado", "Mediana", "Aprendiz", "C300", "HomeStyle", "Antigua", "Normal");
        Silla silla4 = new Silla("Verde", "Acolchado", "Mediana", "Instructor", "D400", "GardenLux", "Nueva", "Normal");
        Silla silla5 = new Silla("Blanco", "Plastico", "Mediana", "Aprendiz", "E500", "Executive", "Dañada", "Normal");
    }
}