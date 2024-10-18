package com.upiiz.bolos_marc.Models;

public class Pedidos {
    private Long id;
    private String modelo;
    private String fechaPedido;
    private String fechaEntrega;
    private int cantidad;
    private int cliente;

    public Pedidos() {
    }

    public Pedidos(long id, String modelo, String fechaPedido, String fechaEntrega, int cantidad, int cliente) {
        this.id = id;
        this.modelo = modelo;
        this.fechaPedido = fechaPedido;
        this.fechaPedido = fechaEntrega;
        this.cantidad = cantidad;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getcliente() {
        return cliente;
    }

    public void setcliente(int cliente) {
        this.cliente = cliente;
    }
}
