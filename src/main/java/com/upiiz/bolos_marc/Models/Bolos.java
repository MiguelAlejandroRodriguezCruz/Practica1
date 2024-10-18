package com.upiiz.bolos_marc.Models;

public class Bolos {
    private Long id;
    private String modelo;
    private float precio;
    private String insumos;

    public Bolos() {
    }

    public Bolos(long id, String modelo, float precio, String insumos) {
        this.id = id;
        this.modelo = modelo;
        this.precio = precio;
        this.insumos = insumos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getmodelo() {
        return modelo;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }

    public float getprecio() {
        return precio;
    }

    public void setprecio(float precio) {
        this.precio = precio;
    }

    public String getInsumos() {
        return insumos;
    }

    public void setInsumos(String insumos) {
        this.insumos = insumos;
    }

}
