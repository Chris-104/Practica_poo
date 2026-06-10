package practica_poo;

public class Alimento extends Producto {

    private String  fechaCaducidad;
    private double  pesoGramos;
    private int     calorias;
    private boolean refrigerado;

    public Alimento(String nombre, double precio, String codigo,
                    String fechaCaducidad, double pesoGramos,
                    int calorias, boolean refrigerado) {
        super(nombre, precio, codigo);
        this.fechaCaducidad = fechaCaducidad;
        this.pesoGramos     = pesoGramos;
        this.calorias       = calorias;
        this.refrigerado    = refrigerado;
    }

    public String getFechaCaducidad()              { return fechaCaducidad; }
    public void   setFechaCaducidad(String f)      { this.fechaCaducidad = f; }

    public double getPesoGramos()                  { return pesoGramos; }
    public void   setPesoGramos(double p)          { this.pesoGramos = p; }

    public int    getCalorias()                    { return calorias; }
    public void   setCalorias(int c)               { this.calorias = c; }

    public boolean isRefrigerado()                 { return refrigerado; }
    public void    setRefrigerado(boolean r)       { this.refrigerado = r; }

    public void mostrarAlmacenamiento() {
        if (refrigerado) {
            System.out.println("Almacenamiento: Mantener refrigerado.");
        } else {
            System.out.println("Almacenamiento: Temperatura ambiente.");
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== ALIMENTO ===");
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("Fecha de caducidad: " + fechaCaducidad);
        System.out.println("Peso: " + pesoGramos + " g");
        System.out.println("Calorias: " + calorias + " kcal");
        mostrarAlmacenamiento();
        
    }
}
