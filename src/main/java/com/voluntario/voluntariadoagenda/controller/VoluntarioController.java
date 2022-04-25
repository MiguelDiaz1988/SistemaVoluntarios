package com.voluntario.voluntariadoagenda.controller;

import com.voluntario.voluntariadoagenda.entity.Voluntario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("voluntarios")
public class VoluntarioController {
    @RequestMapping("/{id}")
    public Voluntario getVoluntario(int id) {
        // TODO: Obtener voluntario consultado la DB por id
        return new Voluntario();
    }

    @RequestMapping(value="/", method= RequestMethod.POST)
    public Voluntario crearVoluntario(Voluntario nuevoVoluntario) {
        // TODO: Crear voluntario en DB
        return new Voluntario();
    }

    @RequestMapping(value="/{id}", method= RequestMethod.PUT)
    public Voluntario actualizarVoluntario(@PathVariable(name="id") int id, Voluntario voluntario) {
        // TODO: Actualizar datos de voluntario por id
        return new Voluntario();
    }

    @RequestMapping(value="/search", method=RequestMethod.GET)
    public List<Voluntario> buscarVoluntarios(@RequestParam(name="key") String key) {
        // TODO: Buscar voluntarios en base al key y devolver coincidencias
        return new ArrayList<Voluntario>();
    }
}
