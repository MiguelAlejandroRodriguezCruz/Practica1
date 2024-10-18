package com.upiiz.bolos_marc.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upiiz.bolos_marc.Models.Pedidos;
import com.upiiz.bolos_marc.Services.PedidosService;

@RestController
@RequestMapping("/api/v1/Pedidos")
public class PedidosController {
    @Autowired
    private PedidosService PedidosService;

    @GetMapping()
    public ResponseEntity<List<Pedidos>> getPedidos() {
        return ResponseEntity.ok(PedidosService.getAllPedidos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedidos> getPedido(@PathVariable Long id) {
        return ResponseEntity.ok(PedidosService.getPedidoById(id));
    }

    @PostMapping()
    public ResponseEntity<Pedidos> addPedido(@RequestBody Pedidos Pedido) {
        return ResponseEntity.ok(PedidosService.createPedido(Pedido));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pedidos> updatePedido(@RequestBody Pedidos Pedido, @PathVariable Long id) {
        Pedido.setId(id);
        return ResponseEntity.ok(PedidosService.updatePedido(Pedido));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPedido(@PathVariable Long id) {
        PedidosService.deletePedido(id);
        return ResponseEntity.noContent().build();
    }

}
