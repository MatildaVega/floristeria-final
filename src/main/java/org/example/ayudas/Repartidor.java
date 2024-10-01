package org.example.ayudas;

public class Repartidor {


    private Integer id;
    private String nombre;
    private String apellido;
    private String correo;
    private String matricula;
    private String tipoVehiculo;
    private Integer capacidadCarga;
    private String horarioDisponibilidad;
    private String zonaEntrega;
    private String metodoComunicacion;


    public Repartidor() {
    }

    public Repartidor(Integer id, String nombre, String apellido, String correo, String matricula, String tipoVehiculo, Integer capacidadCarga, String horarioDisponibilidad, String zonaEntrega, String metodoComunicacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.matricula = matricula;
        this.tipoVehiculo = tipoVehiculo;
        this.capacidadCarga = capacidadCarga;
        this.horarioDisponibilidad = horarioDisponibilidad;
        this.zonaEntrega = zonaEntrega;
        this.metodoComunicacion = metodoComunicacion;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public Integer getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(Integer capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public String getHorarioDisponibilidad() {
        return horarioDisponibilidad;
    }

    public void setHorarioDisponibilidad(String horarioDisponibilidad) {
        this.horarioDisponibilidad = horarioDisponibilidad;
    }

    public String getZonaEntrega() {
        return zonaEntrega;
    }

    public void setZonaEntrega(String zonaEntrega) {
        this.zonaEntrega = zonaEntrega;
    }

    public String getMetodoComunicacion() {
        return metodoComunicacion;
    }

    public void setMetodoComunicacion(String metodoComunicacion) {
        this.metodoComunicacion = metodoComunicacion;
    }
}
