package practica_poo;

public class principal {

    public static void main(String[] args) {

        Electronico elec1 = new Electronico("Laptop Lenovo", 850.00, "E001",
                "Lenovo", 24, 110);
        Electronico elec2 = new Electronico("Audifonos Sony", 120.50, "E002",
                "Sony", 12, 5);

        Alimento ali1 = new Alimento("Leche Entera", 1.25, "A001",
                "25/12/2026", 1000.0, 150, true);
        Alimento ali2 = new Alimento("Galletas Oreo", 2.75, "A002",
                "10/08/2027", 250.0, 480, false);

        Producto[] productos = { elec1, elec2, ali1, ali2 };

        System.out.println("########################################");
        System.out.println("#     CATALOGO DE PRODUCTOS DE TIENDA   #");
        System.out.println("########################################");
        System.out.println();

        for (int i = 0; i < productos.length; i++) {
            System.out.println("----------------------------------------");
            productos[i].mostrarInfo();
            System.out.println();
        }

        System.out.println("########################################");
        System.out.println("Total de productos registrados: " + productos.length);
        System.out.println("########################################");
    }
}
