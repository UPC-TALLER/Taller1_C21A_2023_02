package ejercicio2;

import java.util.ArrayList;

public class Pasteleria {
    //declarando variables
    private  String numeroRuc;
    private String nombre;
    private String direccion;
    private ArrayList<Producto> productosVendidos;

    public Pasteleria(String numeroRuc, String nombre, String direccion) {
        this.numeroRuc = numeroRuc;
        this.nombre = nombre;
        this.direccion = direccion;
        productosVendidos = new ArrayList<>();
    }

    public ArrayList<Producto> getProductosVendidos(){
        return productosVendidos;
    }

    public void registrarProductoVendido(Producto producto){
        productosVendidos.add(producto);
    }

    public double calcularVentaTotal(){
        double ventaTotal=0;
        for (Producto producto: productosVendidos){
            ventaTotal = ventaTotal + producto.calcularPrecioFinal();
        }
        return ventaTotal;
    }

    @Override
    public String toString() {
        return "Pasteleria{" +
                "numeroRuc='" + numeroRuc + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", productosVendidos=" + productosVendidos +
                ", venta Total = S/ "+ calcularVentaTotal() +
                '}';
    }
}
