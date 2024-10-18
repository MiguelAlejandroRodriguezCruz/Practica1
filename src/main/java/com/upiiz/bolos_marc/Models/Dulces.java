package com.upiiz.bolos_marc.Models;

public class Dulces {
    private Long id;
    private String nombre;
    private float precio;
    private int piezas;

    public Dulces() {
    }

    public Dulces(long id, String nombre, float precio, int piezas) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.piezas = piezas;
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

    public int getPiezas() {
        return piezas;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

}
