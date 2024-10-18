package com.upiiz.bolos_marc.Services;

import java.util.List;
import org.springframework.stereotype.Service;

import com.upiiz.bolos_marc.Models.Insumos;
import com.upiiz.bolos_marc.Repository.InsumosRepository;

@Service
public class InsumosService {
    InsumosRepository InsumosRepositoyry;

    public InsumosService(InsumosRepository InsumosRepositoyry) {
        this.InsumosRepositoyry = InsumosRepositoyry;
    }

    // @GetMapping()
    public List<Insumos> getAllInsumos() {
        return InsumosRepositoyry.obtenerTodas();
    }

    // @GetMapping("/{id}")
    public Insumos getInsumoById(Long id) {
        return InsumosRepositoyry.obtnerPorId(id);
    }

    // @PostMapping()
    public Insumos createInsumo(Insumos Insumo) {
        return InsumosRepositoyry.guardar(Insumo);
    }

    // @PutMapping("/{id}")
    public Insumos updateInsumo(Insumos Insumo) {
        return InsumosRepositoyry.actualizar(Insumo);
    }

    // DeleteMapping("/{id}")
    public void deleteInsumo(Long id) {
        InsumosRepositoyry.eliminar(id);
    }

}
