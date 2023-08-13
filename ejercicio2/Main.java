package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Pasteleria pasteleria1= new Pasteleria("12345678901","Moderna","Calle real 123");

        Producto producto1 = new Producto("COD1","pan integral", 10, 2);

        pasteleria1.registrarProductoVendido(producto1);

        System.out.println(pasteleria1);

    }
}
