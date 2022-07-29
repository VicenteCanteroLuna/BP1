package com.bosonit.BP1.Asignaturas.infrastructure.controller;

import com.bosonit.BP1.Asignaturas.application.AsignaturasService;
import com.bosonit.BP1.Asignaturas.infrastructure.controller.dto.AsignaturaOutputDto;
import com.bosonit.BP1.Asignaturas.infrastructure.controller.dto.AsignaturasInputDto;
import com.bosonit.BP1.Estudiante.application.EstudianteService;
import com.bosonit.BP1.Estudiante.infrastructure.controller.dto.StudentInputDto;
import com.bosonit.BP1.Estudiante.infrastructure.controller.dto.StudentOutputDtoFull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostAsignaturas {


    @Autowired
    AsignaturasService asignaturasService;

    @PostMapping("/asignatura")
    public AsignaturaOutputDto postAsignatura(@RequestBody AsignaturasInputDto asignaturasInputDto) throws Exception{

        return asignaturasService.crearAsignatura(asignaturasInputDto);


    }
}
