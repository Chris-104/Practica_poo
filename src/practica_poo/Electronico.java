package practica_poo;

public class Electronico extends Producto {

    private String marca;
    private int    garantiaMeses;
    private int    voltaje;

    public Electronico(String nombre, double precio, String codigo,
                       String marca, int garantiaMeses, int voltaje) {
        super(nombre, precio, codigo);
        this.marca         = marca;
        this.garantiaMeses = garantiaMeses;
        this.voltaje       = voltaje;
    }

    public String getMarca()                  { return marca; }
    public void   setMarca(String marca)      { this.marca = marca; }

    public int    getGarantiaMeses()          { return garantiaMeses; }
    public void   setGarantiaMeses(int g)     { this.garantiaMeses = g; }

    public int    getVoltaje()                { return voltaje; }
    public void   setVoltaje(int v)           { this.voltaje = v; }

    @Override
    public void mostrarInfo() {
        System.out.println("=== ELECTRONICO ===");
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("Marca: " + marca);
        System.out.println("Garantia: " + garantiaMeses + " meses");
        System.out.println("Voltaje: " + voltaje + "V");
    }
}
