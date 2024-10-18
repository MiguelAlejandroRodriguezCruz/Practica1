package com.upiiz.bolos_marc.Repository;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.upiiz.bolos_marc.Models.Dulces;

@Repository
public class DulcesRepository {
    // Almacenar las Dulces
    // Genera de manera unica el id de cada Dulces
    private List<Dulces> Dulces = new ArrayList<Dulces>();
    private AtomicLong id = new AtomicLong();

    public Dulces guardar(Dulces Dulce) {

        Dulce.setId(id.incrementAndGet());
        Dulces.add(Dulce);
        return Dulce;
    }

    // GET - Todas las Dulces
    public List<Dulces> obtenerTodas() {

        return Dulces;
    }

    // GET solo un Dulce
    public Dulces obtnerPorId(Long id) {

        /*
         * for (Dulce Dulce : Dulces) {
         * if (Dulce.getId().equals(id)) {
         * return Dulce;
         * }
         * }
         * return null;
         */
        // Dulces.stream().filter(Dulce ->
        return Dulces.stream().filter(Dulce -> Dulce.getId().equals(id)).findFirst().orElse(null);
    }

    // Delete
    public void eliminar(Long id) {
        Dulces.removeIf(Dulce -> Dulce.getId().equals(id));

    }

    // PUT
    public Dulces actualizar(Dulces Dulce) {
        eliminar(Dulce.getId());
        Dulces.add(Dulce);
        return Dulce;
    }
}
