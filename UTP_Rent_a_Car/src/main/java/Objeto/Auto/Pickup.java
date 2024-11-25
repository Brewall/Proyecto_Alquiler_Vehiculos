package Objeto.Auto;

public class Pickup extends Vehiculo{

    private String traccion;
    private int caballosDeFuerza;

    public Pickup(String idVehiculo, String marca, String modelo, String placa, String estadoVehiculo, double precioHora, String traccion, int caballosDeFuerza) {
        super(idVehiculo, marca, modelo, placa, estadoVehiculo, precioHora, TipoVehiculo.PICKUP);
        this.traccion = traccion;
        this.caballosDeFuerza = caballosDeFuerza;
    }


    @Override
    public void mostrarDetalles() {

    }

}
