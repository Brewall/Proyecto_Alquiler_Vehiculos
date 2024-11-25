package Objeto.Auto;

public class SUV extends Vehiculo{
    private String traccion;

    public SUV(String idVehiculo, String marca, String modelo, String placa, String estadoVehiculo, double precioHora, String traccion) {
        super(idVehiculo, marca, modelo, placa, estadoVehiculo, precioHora, TipoVehiculo.SUV);
        this.traccion = traccion;
    }


    @Override
    public void mostrarDetalles() {

    }


}
