package Objeto.Auto;

public class Sedan extends Vehiculo{
    private int caballosDeFuerza;

    public Sedan(String idVehiculo, String marca, String modelo, String placa, String estadoVehiculo, double precioHora, int caballosDeFuerza) {
        super(idVehiculo, marca, modelo, placa, estadoVehiculo, precioHora, TipoVehiculo.SEDAN);
        this.caballosDeFuerza = caballosDeFuerza;
    }


    @Override
    public void mostrarDetalles() {

    }
}
