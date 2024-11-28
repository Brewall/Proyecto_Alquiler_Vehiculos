package Objeto.User;

import java.util.Date;
public class Empleado extends Persona{
    private int idEmpleado;
    private Date fechaContratacion;
    private int idRol;

    // Constructor vacío
    public Empleado() {}

    // Constructor con parámetros
    public Empleado(int idEmpleado, Date fechaContratacion, int idRol, int idPersona,
                    String nombres, String apellidoPaterno, String apellidoMaterno, String dni, String direccion,
                    String telefono, String correo, String genero, String fechaNacimiento) {
        super(idPersona, nombres, apellidoPaterno, apellidoMaterno, dni, direccion, telefono, correo, genero, fechaNacimiento);
        this.idEmpleado = idEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.idRol = idRol;
    }

    // Getters y Setters
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }
}
