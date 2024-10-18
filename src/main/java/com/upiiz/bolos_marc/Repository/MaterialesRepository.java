package com.upiiz.bolos_marc.Repository;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.upiiz.bolos_marc.Models.Materiales;

@Repository
public class MaterialesRepository {
    // Almacenar las Materiales
    // Genera de manera unica el id de cada Materiales
    private List<Materiales> Materiales = new ArrayList<Materiales>();
    private AtomicLong id = new AtomicLong();

    public Materiales guardar(Materiales Materiale) {

        Materiale.setId(id.incrementAndGet());
        Materiales.add(Materiale);
        return Materiale;
    }

    // GET - Todas las Materiales
    public List<Materiales> obtenerTodas() {

        return Materiales;
    }

    // GET solo un Materiale
    public Materiales obtnerPorId(Long id) {

        /*
         * for (Materiale Materiale : Materiales) {
         * if (Materiale.getId().equals(id)) {
         * return Materiale;
         * }
         * }
         * return null;
         */
        // Materiales.stream().filter(Materiale ->
        return Materiales.stream().filter(Materiale -> Materiale.getId().equals(id)).findFirst().orElse(null);
    }

    // Delete
    public void eliminar(Long id) {
        Materiales.removeIf(Materiale -> Materiale.getId().equals(id));

    }

    // PUT
    public Materiales actualizar(Materiales Materiale) {
        eliminar(Materiale.getId());
        Materiales.add(Materiale);
        return Materiale;
    }
}
