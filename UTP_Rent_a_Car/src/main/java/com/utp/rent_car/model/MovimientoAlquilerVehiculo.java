package com.utp.rent_car.model;

public class MovimientoAlquilerVehiculo {
    private int idMovimientoAlquilerVehiculo;
    private String fechaSalida;
    private String fechaIngreso;
    private int idTipoMovimiento;

    public MovimientoAlquilerVehiculo() {
    }

    public int getIdMovimientoAlquilerVehiculo() {
        return idMovimientoAlquilerVehiculo;
    }

    public void setIdMovimientoAlquilerVehiculo(int idMovimientoAlquilerVehiculo) {
        this.idMovimientoAlquilerVehiculo = idMovimientoAlquilerVehiculo;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getIdTipoMovimiento() {
        return idTipoMovimiento;
    }

    public void setIdTipoMovimiento(int idTipoMovimiento) {
        this.idTipoMovimiento = idTipoMovimiento;
    }
}
