package Objeto.User;

public class Conductor extends Usuario {
    private String codigoEmpleado;

    public Conductor(String idUsuario, String nombres, String apellidos, String email, String telefono, String codigoEmpleado) {
        super(idUsuario, nombres, apellidos, email, telefono, RolUsuario.CONDUCTOR);
        this.codigoEmpleado = codigoEmpleado;
    }

    @Override
    public void registrarUsuario() {

    }


}
