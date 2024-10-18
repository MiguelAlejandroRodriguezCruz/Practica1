package com.upiiz.bolos_marc.Repository;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.upiiz.bolos_marc.Models.Pedidos;

@Repository
public class PedidosRepository {
    // Almacenar las Pedidos
    // Genera de manera unica el id de cada Pedidos
    private List<Pedidos> Pedidos = new ArrayList<Pedidos>();
    private AtomicLong id = new AtomicLong();

    public Pedidos guardar(Pedidos Pedido) {

        Pedido.setId(id.incrementAndGet());
        Pedidos.add(Pedido);
        return Pedido;
    }

    // GET - Todas las Pedidos
    public List<Pedidos> obtenerTodas() {

        return Pedidos;
    }

    // GET solo un Pedido
    public Pedidos obtnerPorId(Long id) {

        /*
         * for (Pedido Pedido : Pedidos) {
         * if (Pedido.getId().equals(id)) {
         * return Pedido;
         * }
         * }
         * return null;
         */
        // Pedidos.stream().filter(Pedido ->
        return Pedidos.stream().filter(Pedido -> Pedido.getId().equals(id)).findFirst().orElse(null);
    }

    // Delete
    public void eliminar(Long id) {
        Pedidos.removeIf(Pedido -> Pedido.getId().equals(id));

    }

    // PUT
    public Pedidos actualizar(Pedidos Pedido) {
        eliminar(Pedido.getId());
        Pedidos.add(Pedido);
        return Pedido;
    }
}
