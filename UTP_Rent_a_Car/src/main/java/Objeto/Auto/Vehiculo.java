package Objeto.Auto;

public abstract class Vehiculo {
    private String idVehiculo;
    private String marca;
    private String modelo;
    private String placa;
    private String estadoVehiculo;
    private double precioHora;
    protected enum TipoVehiculo {SUV, PICKUP, SEDAN, DEPORTIVO, HATCHBACK}
    TipoVehiculo tipo;

    public Vehiculo(String idVehiculo, String marca, String modelo, String placa, String estadoVehiculo, double precioHora, TipoVehiculo tipo) {
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.estadoVehiculo = estadoVehiculo;
        this.precioHora = precioHora;
        this.tipo = tipo;
    }

    public abstract void mostrarDetalles();
}
