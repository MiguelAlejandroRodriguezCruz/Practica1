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

import com.upiiz.bolos_marc.Models.Insumos;
import com.upiiz.bolos_marc.Services.InsumosService;

@RestController
@RequestMapping("/api/v1/Insumos")
public class InsumosController {
    @Autowired
    private InsumosService InsumosService;

    @GetMapping()
    public ResponseEntity<List<Insumos>> getInsumos() {
        return ResponseEntity.ok(InsumosService.getAllInsumos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Insumos> getInsumo(@PathVariable Long id) {
        return ResponseEntity.ok(InsumosService.getInsumoById(id));
    }

    @PostMapping()
    public ResponseEntity<Insumos> addInsumo(@RequestBody Insumos Insumo) {
        return ResponseEntity.ok(InsumosService.createInsumo(Insumo));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Insumos> updateInsumo(@RequestBody Insumos Insumo, @PathVariable Long id) {
        Insumo.setId(id);
        return ResponseEntity.ok(InsumosService.updateInsumo(Insumo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarInsumo(@PathVariable Long id) {
        InsumosService.deleteInsumo(id);
        return ResponseEntity.noContent().build();
    }

}
