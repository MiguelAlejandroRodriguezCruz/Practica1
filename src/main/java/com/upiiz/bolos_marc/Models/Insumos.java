package com.upiiz.bolos_marc.Models;

public class Insumos {
    private Long id;
    private String nombre;
    private String tipo;
    private int cantidadPaquete;
    private int precio;

    public Insumos() {
    }

    public Insumos(long id, String nombre, String tipo, int cantidadPaquete, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidadPaquete = cantidadPaquete;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidadPaquete() {
        return cantidadPaquete;
    }

    public void setCantidadPaquete(int cantidadPaquete) {
        this.cantidadPaquete = cantidadPaquete;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
