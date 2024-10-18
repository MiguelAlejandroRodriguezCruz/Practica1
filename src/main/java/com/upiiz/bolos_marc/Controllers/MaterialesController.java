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

import com.upiiz.bolos_marc.Models.Materiales;
import com.upiiz.bolos_marc.Services.MaterialesService;

@RestController
@RequestMapping("/api/v1/Materiales")
public class MaterialesController {
    @Autowired
    private MaterialesService MaterialesService;

    @GetMapping()
    public ResponseEntity<List<Materiales>> getMateriales() {
        return ResponseEntity.ok(MaterialesService.getAllMateriales());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Materiales> getMateriale(@PathVariable Long id) {
        return ResponseEntity.ok(MaterialesService.getMaterialeById(id));
    }

    @PostMapping()
    public ResponseEntity<Materiales> addMateriale(@RequestBody Materiales Materiale) {
        return ResponseEntity.ok(MaterialesService.createMateriale(Materiale));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Materiales> updateMateriale(@RequestBody Materiales Materiale, @PathVariable Long id) {
        Materiale.setId(id);
        return ResponseEntity.ok(MaterialesService.updateMateriale(Materiale));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarMateriale(@PathVariable Long id) {
        MaterialesService.deleteMateriale(id);
        return ResponseEntity.noContent().build();
    }

}
