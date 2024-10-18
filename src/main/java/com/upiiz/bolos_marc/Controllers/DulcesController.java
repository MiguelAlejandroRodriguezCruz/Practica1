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

import com.upiiz.bolos_marc.Models.Dulces;
import com.upiiz.bolos_marc.Services.DulcesService;

@RestController
@RequestMapping("/api/v1/Dulces")
public class DulcesController {
    @Autowired
    private DulcesService DulcesService;

    @GetMapping()
    public ResponseEntity<List<Dulces>> getDulces() {
        return ResponseEntity.ok(DulcesService.getAllDulces());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dulces> getDulce(@PathVariable Long id) {
        return ResponseEntity.ok(DulcesService.getDulceById(id));
    }

    @PostMapping()
    public ResponseEntity<Dulces> addDulce(@RequestBody Dulces Dulce) {
        return ResponseEntity.ok(DulcesService.createDulce(Dulce));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Dulces> updateDulce(@RequestBody Dulces Dulce, @PathVariable Long id) {
        Dulce.setId(id);
        return ResponseEntity.ok(DulcesService.updateDulce(Dulce));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarDulce(@PathVariable Long id) {
        DulcesService.deleteDulce(id);
        return ResponseEntity.noContent().build();
    }

}
