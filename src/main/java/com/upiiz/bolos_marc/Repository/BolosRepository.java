package com.upiiz.bolos_marc.Repository;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.upiiz.bolos_marc.Models.Bolos;

@Repository
public class BolosRepository {
    // Almacenar las Bolos
    // Genera de manera unica el id de cada Bolos
    private List<Bolos> Bolos = new ArrayList<Bolos>();
    private AtomicLong id = new AtomicLong();

    public Bolos guardar(Bolos Bolo) {

        Bolo.setId(id.incrementAndGet());
        Bolos.add(Bolo);
        return Bolo;
    }

    // GET - Todas las Bolos
    public List<Bolos> obtenerTodas() {

        return Bolos;
    }

    // GET solo un Bolo
    public Bolos obtnerPorId(Long id) {

        /*
         * for (Bolo Bolo : Bolos) {
         * if (Bolo.getId().equals(id)) {
         * return Bolo;
         * }
         * }
         * return null;
         */
        // Bolos.stream().filter(Bolo ->
        return Bolos.stream().filter(Bolo -> Bolo.getId().equals(id)).findFirst().orElse(null);
    }

    // Delete
    public void eliminar(Long id) {
        Bolos.removeIf(Bolo -> Bolo.getId().equals(id));

    }

    // PUT
    public Bolos actualizar(Bolos Bolo) {
        eliminar(Bolo.getId());
        Bolos.add(Bolo);
        return Bolo;
    }
}
