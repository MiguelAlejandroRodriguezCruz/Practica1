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

import com.upiiz.bolos_marc.Models.Bolos;
import com.upiiz.bolos_marc.Services.BolosService;

@RestController
@RequestMapping("/api/v1/Bolos")
public class BolosController {
    @Autowired
    private BolosService BolosService;

    @GetMapping()
    public ResponseEntity<List<Bolos>> getBolos() {
        return ResponseEntity.ok(BolosService.getAllBolos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bolos> getBolo(@PathVariable Long id) {
        return ResponseEntity.ok(BolosService.getBoloById(id));
    }

    @PostMapping()
    public ResponseEntity<Bolos> addBolo(@RequestBody Bolos Bolo) {
        return ResponseEntity.ok(BolosService.createBolo(Bolo));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Bolos> updateBolo(@RequestBody Bolos Bolo, @PathVariable Long id) {
        Bolo.setId(id);
        return ResponseEntity.ok(BolosService.updateBolo(Bolo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarBolo(@PathVariable Long id) {
        BolosService.deleteBolo(id);
        return ResponseEntity.noContent().build();
    }

}
