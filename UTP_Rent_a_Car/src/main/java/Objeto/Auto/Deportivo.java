package Objeto.Auto;

public class Deportivo extends Vehiculo{

    private int caballosDeFuerza;
    private int velocidadMaxima;

    public Deportivo(String idVehiculo, String marca, String modelo, String placa, String estadoVehiculo, double precioHora, int caballosDeFuerza, int velocidadMaxima) {
        super(idVehiculo, marca, modelo, placa, estadoVehiculo, precioHora, TipoVehiculo.DEPORTIVO);
        this.caballosDeFuerza = caballosDeFuerza;
        this.velocidadMaxima = velocidadMaxima;
    }


    @Override
    public void mostrarDetalles() {

    }
}
