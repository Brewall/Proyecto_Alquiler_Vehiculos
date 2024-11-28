package Objeto.User;

import java.sql.Timestamp;
public class Cliente extends Persona {
    private int idCliente;
    private int idTipoCliente;
    private int idEmpresa;
    private Timestamp fechaRegistro;

    // Constructor vacío
    public Cliente() {}

    // Constructor con parámetros
    public Cliente(int idCliente, int idTipoCliente, int idEmpresa, Timestamp fechaRegistro, int idPersona,
                   String nombres, String apellidoPaterno, String apellidoMaterno, String dni, String direccion,
                   String telefono, String correo, String genero, String fechaNacimiento) {
        super(idPersona, nombres, apellidoPaterno, apellidoMaterno, dni, direccion, telefono, correo, genero, fechaNacimiento);
        this.idCliente = idCliente;
        this.idTipoCliente = idTipoCliente;
        this.idEmpresa = idEmpresa;
        this.fechaRegistro = fechaRegistro;
    }

    // Getters y Setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdTipoCliente() {
        return idTipoCliente;
    }

    public void setIdTipoCliente(int idTipoCliente) {
        this.idTipoCliente = idTipoCliente;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Timestamp fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
