package com.upiiz.bolos_marc.Services;

import java.util.List;
import org.springframework.stereotype.Service;

import com.upiiz.bolos_marc.Models.Bolos;
import com.upiiz.bolos_marc.Repository.BolosRepository;

@Service
public class BolosService {
    BolosRepository BolosRepositoyry;

    public BolosService(BolosRepository BolosRepositoyry) {
        this.BolosRepositoyry = BolosRepositoyry;
    }

    // @GetMapping()
    public List<Bolos> getAllBolos() {
        return BolosRepositoyry.obtenerTodas();
    }

    // @GetMapping("/{id}")
    public Bolos getBoloById(Long id) {
        return BolosRepositoyry.obtnerPorId(id);
    }

    // @PostMapping()
    public Bolos createBolo(Bolos Bolo) {
        return BolosRepositoyry.guardar(Bolo);
    }

    // @PutMapping("/{id}")
    public Bolos updateBolo(Bolos Bolo) {
        return BolosRepositoyry.actualizar(Bolo);
    }

    // DeleteMapping("/{id}")
    public void deleteBolo(Long id) {
        BolosRepositoyry.eliminar(id);
    }

}
