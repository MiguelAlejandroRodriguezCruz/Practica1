package com.upiiz.bolos_marc.Services;

import java.util.List;
import org.springframework.stereotype.Service;

import com.upiiz.bolos_marc.Models.Pedidos;
import com.upiiz.bolos_marc.Repository.PedidosRepository;

@Service
public class PedidosService {
    PedidosRepository PedidosRepositoyry;

    public PedidosService(PedidosRepository PedidosRepositoyry) {
        this.PedidosRepositoyry = PedidosRepositoyry;
    }

    // @GetMapping()
    public List<Pedidos> getAllPedidos() {
        return PedidosRepositoyry.obtenerTodas();
    }

    // @GetMapping("/{id}")
    public Pedidos getPedidoById(Long id) {
        return PedidosRepositoyry.obtnerPorId(id);
    }

    // @PostMapping()
    public Pedidos createPedido(Pedidos Pedido) {
        return PedidosRepositoyry.guardar(Pedido);
    }

    // @PutMapping("/{id}")
    public Pedidos updatePedido(Pedidos Pedido) {
        return PedidosRepositoyry.actualizar(Pedido);
    }

    // DeleteMapping("/{id}")
    public void deletePedido(Long id) {
        PedidosRepositoyry.eliminar(id);
    }

}
