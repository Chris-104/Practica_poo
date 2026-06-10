package practica_poo;

public class Electronico extends Producto {
    
    private String marca;

    public Electronico(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}