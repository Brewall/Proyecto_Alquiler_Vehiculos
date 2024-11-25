package Objeto.User;

public class Administrador  extends  Usuario{
    private String codigoEmpleado;

    public Administrador(String idUsuario, String nombres, String apellidos, String email, String telefono, String codigoEmpleado) {
        super(idUsuario, nombres, apellidos, email, telefono, RolUsuario.ADMINISTRADOR);
        this.codigoEmpleado = codigoEmpleado;
    }


    @Override
    public void registrarUsuario() {

    }

    public void gestionarVehiculos(){}

    public void gestionarUsuarios(){}
}
