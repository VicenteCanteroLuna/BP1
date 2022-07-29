package com.bosonit.BP1.Asignaturas.infrastructure.controller;

import com.bosonit.BP1.Asignaturas.application.AsignaturasService;
import com.bosonit.BP1.Asignaturas.infrastructure.controller.dto.AsignaturaOutputDto;
import com.bosonit.BP1.Asignaturas.infrastructure.controller.dto.AsignaturasOutputDtoFull;
import com.bosonit.BP1.Estudiante.application.EstudianteService;
import com.bosonit.BP1.Estudiante.infrastructure.controller.dto.StudentOutputDtoFull;
import com.bosonit.BP1.Estudiante.infrastructure.controller.dto.StudentOutputDtoSimple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("asignatura/")
public class getAsignaturas {

    @Autowired
    AsignaturasService asignaturasService;

    @GetMapping("{id}")
    public AsignaturaOutputDto dameAsignaturaId(@PathVariable int id) throws Exception {
        return asignaturasService.dameAsignaturaID(id);

    }

    @GetMapping("todos")
    public List<AsignaturasOutputDtoFull> dameAsignaturas() {
        return asignaturasService.dameAsignaturas();
    }
}
