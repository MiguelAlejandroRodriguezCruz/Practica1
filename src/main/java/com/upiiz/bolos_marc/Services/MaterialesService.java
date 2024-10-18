package com.upiiz.bolos_marc.Services;

import java.util.List;
import org.springframework.stereotype.Service;

import com.upiiz.bolos_marc.Models.Materiales;
import com.upiiz.bolos_marc.Repository.MaterialesRepository;

@Service
public class MaterialesService {
    MaterialesRepository MaterialesRepositoyry;

    public MaterialesService(MaterialesRepository MaterialesRepositoyry) {
        this.MaterialesRepositoyry = MaterialesRepositoyry;
    }

    // @GetMapping()
    public List<Materiales> getAllMateriales() {
        return MaterialesRepositoyry.obtenerTodas();
    }

    // @GetMapping("/{id}")
    public Materiales getMaterialeById(Long id) {
        return MaterialesRepositoyry.obtnerPorId(id);
    }

    // @PostMapping()
    public Materiales createMateriale(Materiales Materiale) {
        return MaterialesRepositoyry.guardar(Materiale);
    }

    // @PutMapping("/{id}")
    public Materiales updateMateriale(Materiales Materiale) {
        return MaterialesRepositoyry.actualizar(Materiale);
    }

    // DeleteMapping("/{id}")
    public void deleteMateriale(Long id) {
        MaterialesRepositoyry.eliminar(id);
    }

}
