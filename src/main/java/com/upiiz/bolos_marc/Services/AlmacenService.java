package com.upiiz.bolos_marc.Services;

import java.util.List;
import org.springframework.stereotype.Service;

import com.upiiz.bolos_marc.Models.Almacen;
import com.upiiz.bolos_marc.Repository.AlmacenRepository;

@Service
public class AlmacenService {
    AlmacenRepository AlmacenRepositoyry;

    public AlmacenService(AlmacenRepository AlmacenRepositoyry) {
        this.AlmacenRepositoyry = AlmacenRepositoyry;
    }

    // @GetMapping()
    public List<Almacen> getAllAlmacen() {
        return AlmacenRepositoyry.obtenerTodas();
    }

    // @GetMapping("/{id}")
    public Almacen getDulceById(Long id) {
        return AlmacenRepositoyry.obtnerPorId(id);
    }

    // @PostMapping()
    public Almacen createDulce(Almacen Dulce) {
        return AlmacenRepositoyry.guardar(Dulce);
    }

    // @PutMapping("/{id}")
    public Almacen updateDulce(Almacen Dulce) {
        return AlmacenRepositoyry.actualizar(Dulce);
    }

    // DeleteMapping("/{id}")
    public void deleteDulce(Long id) {
        AlmacenRepositoyry.eliminar(id);
    }

}
