package Objeto.User;

public class Oficinista extends Usuario{
    private String codigoEmpleado;

    public Oficinista(String idUsuario, String nombres, String apellidos, String email, String telefono, String codigoEmpleado) {
        super(idUsuario, nombres, apellidos, email, telefono, RolUsuario.OFICINISTA);
        this.codigoEmpleado = codigoEmpleado;
    }

    @Override
    public void registrarUsuario() {

    }

    public void atenderCliente(){}

    public void gestionarPagos(){}
}
