package ejercicio1;

public class PartidaNacimiento {
    //declarando variables
    private String identificador;
    private String nombre;
    private String ciudad;
    private int dia;
    private int mes;
    private int anio;
    private String nombreEstablecimiento;

    public PartidaNacimiento(String identificador,String nombre, String ciudad, int dia, int mes,int anio, String nombreEstablecimiento){
        this.identificador = identificador;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.dia= dia;
        this.mes = mes;
        this.anio = anio;
        this.nombreEstablecimiento = nombreEstablecimiento;
    }

    public int estimarEdadActual(){
        return 2023 - anio;
    }

    @Override
    public String toString(){
        return  "identificador =" + identificador + '\n'+ " Nombre = "+ nombre + '\n'+ " Ciudad = " + ciudad + " Día = " + dia + " Mes = "+ mes + " Anio = " + anio + " Nombre del Establecimiento = "+ nombreEstablecimiento + " Edad Estimada = " + estimarEdadActual();
    }
}
