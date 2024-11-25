package Objeto.Auto;

public class Hachtback extends Vehiculo{
    private int caballosDeFuerza;

    public Hachtback(String idVehiculo, String marca, String modelo, String placa, String estadoVehiculo, double precioHora, int caballosDeFuerza) {
        super(idVehiculo, marca, modelo, placa, estadoVehiculo, precioHora, TipoVehiculo.HATCHBACK);
        this.caballosDeFuerza = caballosDeFuerza;
    }


    @Override
    public void mostrarDetalles() {

    }
}
