package com.upiiz.bolos_marc.Services;

import java.util.List;
import org.springframework.stereotype.Service;

import com.upiiz.bolos_marc.Models.Dulces;
import com.upiiz.bolos_marc.Repository.DulcesRepository;

@Service
public class DulcesService {
    DulcesRepository DulcesRepositoyry;

    public DulcesService(DulcesRepository DulcesRepositoyry) {
        this.DulcesRepositoyry = DulcesRepositoyry;
    }

    // @GetMapping()
    public List<Dulces> getAllDulces() {
        return DulcesRepositoyry.obtenerTodas();
    }

    // @GetMapping("/{id}")
    public Dulces getDulceById(Long id) {
        return DulcesRepositoyry.obtnerPorId(id);
    }

    // @PostMapping()
    public Dulces createDulce(Dulces Dulce) {
        return DulcesRepositoyry.guardar(Dulce);
    }

    // @PutMapping("/{id}")
    public Dulces updateDulce(Dulces Dulce) {
        return DulcesRepositoyry.actualizar(Dulce);
    }

    // DeleteMapping("/{id}")
    public void deleteDulce(Long id) {
        DulcesRepositoyry.eliminar(id);
    }

}
