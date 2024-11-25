package Objeto.User;

public class Cliente extends Usuario{
    private String direccion;
    private String dni;

    public Cliente(String idUsuario, String nombres, String apellidos, String email, String telefono, String direccion, String dni) {
        super(idUsuario, nombres, apellidos, email, telefono, RolUsuario.CLIENTE);
        this.direccion = direccion;
        this.dni = dni;
    }

    @Override
    public void registrarUsuario() {

    }

    public void realizarReserva(){}

    public void consultarReserva(){}
}
