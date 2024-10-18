package com.upiiz.bolos_marc.Repository;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.upiiz.bolos_marc.Models.Insumos;

@Repository
public class InsumosRepository {
    // Almacenar las Insumos
    // Genera de manera unica el id de cada Insumos
    private List<Insumos> Insumos = new ArrayList<Insumos>();
    private AtomicLong id = new AtomicLong();

    public Insumos guardar(Insumos Insumo) {

        Insumo.setId(id.incrementAndGet());
        Insumos.add(Insumo);
        return Insumo;
    }

    // GET - Todas las Insumos
    public List<Insumos> obtenerTodas() {

        return Insumos;
    }

    // GET solo un Insumo
    public Insumos obtnerPorId(Long id) {

        /*
         * for (Insumo Insumo : Insumos) {
         * if (Insumo.getId().equals(id)) {
         * return Insumo;
         * }
         * }
         * return null;
         */
        // Insumos.stream().filter(Insumo ->
        return Insumos.stream().filter(Insumo -> Insumo.getId().equals(id)).findFirst().orElse(null);
    }

    // Delete
    public void eliminar(Long id) {
        Insumos.removeIf(Insumo -> Insumo.getId().equals(id));

    }

    // PUT
    public Insumos actualizar(Insumos Insumo) {
        eliminar(Insumo.getId());
        Insumos.add(Insumo);
        return Insumo;
    }
}
