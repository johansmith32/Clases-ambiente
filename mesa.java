public class Mesa {
    String color;
    String material;
    String tamaño;
    String tipo;
    String modelo;
    String marca;
    String estado;
    String forma;
    int cantidadPuestos;

    public Mesa(String color, String material, String tamaño, String tipo, String modelo, String marca, String estado, String forma, int cantidadPuestos) {
        this.color = color;
        this.material = material;
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.modelo = modelo;
        this.marca = marca;
        this.estado = estado;
        this.forma = forma;
        this.cantidadPuestos = cantidadPuestos;
    }

    public static void main(String[] args) {
        Mesa mesa = new Mesa("Marrón", "Madera", "Grande", "Instructor", "MX200", "IKEA", "Nueva", "Rectangular", 2);
        Mesa mesa2 = new Mesa("Negra", "Metal", "Mediana", "Aprendiz", "AP100", "HomeCenter", "Usada", "Hexagonal", 5);
        Mesa mesa3 = new Mesa("Blanca", "Plástico", "Pequeña", "Aprendiz", "CF300", "OfficeDepot", "Nueva", "Hexagonal", 5);
        Mesa mesa4 = new Mesa("Gris", "Vidrio", "Grande", "Aprendiz", "RM400", "IKEA", "Usada", "Hexagonal", 5);
        Mesa mesa5 = new Mesa("Azul", "Madera", "Mediana", "Instructor", "ES500", "HomeCenter", "Nueva", "Rectangular", 2);
    }
}