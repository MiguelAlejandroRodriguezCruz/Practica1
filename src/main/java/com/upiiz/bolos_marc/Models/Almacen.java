package com.upiiz.bolos_marc.Models;

public class Almacen {
    private Long id;
    private String fechas;

    public Almacen() {
    }

    public Almacen(long id, String fechas) {
        this.id = id;
        this.fechas = fechas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFechas() {
        return fechas;
    }

    public void setFechas(String fechas) {
        this.fechas = fechas;
    }

}
