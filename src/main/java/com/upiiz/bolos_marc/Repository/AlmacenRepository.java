package com.upiiz.bolos_marc.Repository;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.upiiz.bolos_marc.Models.Almacen;

@Repository
public class AlmacenRepository {
    // Almacenar las Almacen
    // Genera de manera unica el id de cada Almacen
    private List<Almacen> Almacen = new ArrayList<Almacen>();
    private AtomicLong id = new AtomicLong();

    public Almacen guardar(Almacen Dulce) {

        Dulce.setId(id.incrementAndGet());
        Almacen.add(Dulce);
        return Dulce;
    }

    // GET - Todas las Almacen
    public List<Almacen> obtenerTodas() {

        return Almacen;
    }

    // GET solo un Dulce
    public Almacen obtnerPorId(Long id) {

        /*
         * for (Dulce Dulce : Almacen) {
         * if (Dulce.getId().equals(id)) {
         * return Dulce;
         * }
         * }
         * return null;
         */
        // Almacen.stream().filter(Dulce ->
        return Almacen.stream().filter(Dulce -> Dulce.getId().equals(id)).findFirst().orElse(null);
    }

    // Delete
    public void eliminar(Long id) {
        Almacen.removeIf(Dulce -> Dulce.getId().equals(id));

    }

    // PUT
    public Almacen actualizar(Almacen Dulce) {
        eliminar(Dulce.getId());
        Almacen.add(Dulce);
        return Dulce;
    }
}
