package com.upiiz.bolos_marc.Models;

public class Materiales {
    private Long id;
    private String nombre;
    private float precio;
    private int unidades;

    public Materiales() {
    }

    public Materiales(long id, String nombre, float precio, int unidades) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.unidades = unidades;
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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

}
