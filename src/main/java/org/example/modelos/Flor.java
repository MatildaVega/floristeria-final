package org.example.modelos;

public class Flor {

    private String tipo;
    private String nombre;
    private String color;
    private Integer numeroPetalos;
    private String clasificacionBotanica;
    private String durabilidad;
    private String cuidados;
    private String usoComun;
    private Integer precio;
    private String proveedores;


    public Flor() {
    }

    public Flor(String tipo, String nombre, String color, Integer numeroPetalos, String clasificacionBotanica, String durabilidad, String cuidados, String usoComun, Integer precio, String proveedores) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.color = color;
        this.numeroPetalos = numeroPetalos;
        this.clasificacionBotanica = clasificacionBotanica;
        this.durabilidad = durabilidad;
        this.cuidados = cuidados;
        this.usoComun = usoComun;
        this.precio = precio;
        this.proveedores = proveedores;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getNumeroPetalos() {
        return numeroPetalos;
    }

    public void setNumeroPetalos(Integer numeroPetalos) {
        this.numeroPetalos = numeroPetalos;
    }

    public String getClasificacionBotanica() {
        return clasificacionBotanica;
    }

    public void setClasificacionBotanica(String clasificacionBotanica) {
        this.clasificacionBotanica = clasificacionBotanica;
    }

    public String getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(String durabilidad) {
        this.durabilidad = durabilidad;
    }

    public String getCuidados() {
        return cuidados;
    }

    public void setCuidados(String cuidados) {
        this.cuidados = cuidados;
    }

    public String getUsoComun() {
        return usoComun;
    }

    public void setUsoComun(String usoComun) {
        this.usoComun = usoComun;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getProveedores() {
        return proveedores;
    }

    public void setProveedores(String proveedores) {
        this.proveedores = proveedores;
    }
}
