package org.example.ayudas;

public class Proveedor {

    private String nombreEmpresa;
    private String nombreContacto;
    private String direccion;
    private String numeroTelefono;
    private String correoElectronico;
    private String detalleProducto;
    private Integer precio;
    private Integer tiempoEntrega;
    private String garantia;
    private String sostenibilidad;

    public Proveedor() {
    }

    public Proveedor(String nombreEmpresa, String nombreContacto, String direccion, String numeroTelefono, String correoElectronico, String detalleProducto, Integer precio, Integer tiempoEntrega, String garantia, String sostenibilidad) {
        this.nombreEmpresa = nombreEmpresa;
        this.nombreContacto = nombreContacto;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
        this.detalleProducto = detalleProducto;
        this.precio = precio;
        this.tiempoEntrega = tiempoEntrega;
        this.garantia = garantia;
        this.sostenibilidad = sostenibilidad;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDetalleProducto() {
        return detalleProducto;
    }

    public void setDetalleProducto(String detalleProducto) {
        this.detalleProducto = detalleProducto;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getTiempoEntrega() {
        return tiempoEntrega;
    }

    public void setTiempoEntrega(Integer tiempoEntrega) {
        this.tiempoEntrega = tiempoEntrega;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getSostenibilidad() {
        return sostenibilidad;
    }

    public void setSostenibilidad(String sostenibilidad) {
        this.sostenibilidad = sostenibilidad;
    }
}
