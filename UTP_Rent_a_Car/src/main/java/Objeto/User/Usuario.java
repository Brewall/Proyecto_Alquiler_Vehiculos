package Objeto.User;

public abstract class Usuario {
    private String idUsuario;
    private String nombres;
    private String apellidos;
    private String email;
    private String telefono;
    protected enum RolUsuario {CLIENTE, ADMINISTRADOR, OFICINISTA, CONDUCTOR}
    RolUsuario rol;

    public Usuario(String idUsuario, String nombres, String apellidos, String email, String telefono, RolUsuario rol) {
        this.idUsuario = idUsuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.rol = rol;
    }

    public void iniciarSesion(){}
    public void cerrarSesion(){}

    public abstract void registrarUsuario();
}
