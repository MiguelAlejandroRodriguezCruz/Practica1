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

import com.upiiz.bolos_marc.Models.Almacen;
import com.upiiz.bolos_marc.Services.AlmacenService;

@RestController
@RequestMapping("/api/v1/Almacen")
public class AlmacenController {
    @Autowired
    private AlmacenService AlmacenService;

    @GetMapping()
    public ResponseEntity<List<Almacen>> getAlmacen() {
        return ResponseEntity.ok(AlmacenService.getAllAlmacen());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Almacen> getDulce(@PathVariable Long id) {
        return ResponseEntity.ok(AlmacenService.getDulceById(id));
    }

    @PostMapping()
    public ResponseEntity<Almacen> addDulce(@RequestBody Almacen Dulce) {
        return ResponseEntity.ok(AlmacenService.createDulce(Dulce));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Almacen> updateDulce(@RequestBody Almacen Dulce, @PathVariable Long id) {
        Dulce.setId(id);
        return ResponseEntity.ok(AlmacenService.updateDulce(Dulce));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarDulce(@PathVariable Long id) {
        AlmacenService.deleteDulce(id);
        return ResponseEntity.noContent().build();
    }

}
