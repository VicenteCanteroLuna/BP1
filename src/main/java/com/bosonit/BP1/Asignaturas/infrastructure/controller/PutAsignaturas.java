package com.bosonit.BP1.Asignaturas.infrastructure.controller;

import com.bosonit.BP1.Asignaturas.application.AsignaturasService;
import com.bosonit.BP1.Asignaturas.infrastructure.controller.dto.AsignaturaOutputDto;
import com.bosonit.BP1.Asignaturas.infrastructure.controller.dto.AsignaturasInputDto;
import com.bosonit.BP1.Asignaturas.infrastructure.controller.dto.AsignaturasOutputDtoFull;
import com.bosonit.BP1.Errores.NotFoundException;
import com.bosonit.BP1.Estudiante.application.EstudianteService;
import com.bosonit.BP1.Estudiante.infrastructure.controller.dto.StudentInputDto;
import com.bosonit.BP1.Estudiante.infrastructure.controller.dto.StudentOutputDtoFull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PutAsignaturas {


    @Autowired
    AsignaturasService asignaturasService;


    @RequestMapping(value = "/asignatura/{id}", method = RequestMethod.PUT)
    ResponseEntity<AsignaturasOutputDtoFull> actualizaAsignatura(@PathVariable("id") int id, @RequestBody AsignaturasInputDto asignaturasInputDto) throws Exception {
        try {
            return new ResponseEntity<>(asignaturasService.actualizaAsignatura(id, asignaturasInputDto), HttpStatus.OK);
        } catch (Exception e) {
            throw new NotFoundException("No existe el id");
        }
    }
}
