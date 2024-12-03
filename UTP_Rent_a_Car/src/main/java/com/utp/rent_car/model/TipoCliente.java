package com.utp.rent_car.model;

public class TipoCliente {
    private int idTipoCliente;
    private String tipoCliente;

    public TipoCliente() {
    }

    public int getIdTipoCliente() {
        return idTipoCliente;
    }

    public void setIdTipoCliente(int idTipoCliente) {
        this.idTipoCliente = idTipoCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "TipoCliente{" +
                "idTipoCliente=" + idTipoCliente +
                ", tipoCliente='" + tipoCliente + '\'' +
                '}';
    }
}
