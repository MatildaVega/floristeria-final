package org.example.modelos;

public class Cliente {

    private Integer id;
    private String nombre;
    private Integer telefono;
    private String direccion;
    private String correo;
    private String codigoPostal;
    private String florEscogida;
    private String estiloArreglo;
    private String tipoPago;
    private String intruccionEspecial;


    public Cliente() {
    }

    public Cliente(Integer id, String nombre, Integer telefono, String direccion, String correo, String codigoPostal, String florEscogida, String estiloArreglo, String tipoPago, String intruccionEspecial) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.codigoPostal = codigoPostal;
        this.florEscogida = florEscogida;
        this.estiloArreglo = estiloArreglo;
        this.tipoPago = tipoPago;
        this.intruccionEspecial = intruccionEspecial;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getFlorEscogida() {
        return florEscogida;
    }

    public void setFlorEscogida(String florEscogida) {
        this.florEscogida = florEscogida;
    }

    public String getEstiloArreglo() {
        return estiloArreglo;
    }

    public void setEstiloArreglo(String estiloArreglo) {
        this.estiloArreglo = estiloArreglo;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getIntruccionEspecial() {
        return intruccionEspecial;
    }

    public void setIntruccionEspecial(String intruccionEspecial) {
        this.intruccionEspecial = intruccionEspecial;
    }
}

