package ejercicio2;

public class Producto {
    //declarando variables
    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto(String codigo, String nombre, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public double calcularPrecioFinal(){
        return precio * cantidad * 1.18;
    }

    @Override
    public String toString() {
        return " codigo = " + codigo +'\n'+ " Nombre =" + nombre + " cantidad = " + cantidad + " Precio = "+ " Precio final = "+ calcularPrecioFinal();
    }
}
