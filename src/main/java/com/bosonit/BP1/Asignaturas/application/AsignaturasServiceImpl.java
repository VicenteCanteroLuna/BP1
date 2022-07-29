package com.bosonit.BP1.Asignaturas.application;

import com.bosonit.BP1.Asignaturas.domain.Asignaturas;
import com.bosonit.BP1.Asignaturas.infrastructure.controller.dto.AsignaturaOutputDto;
import com.bosonit.BP1.Asignaturas.infrastructure.controller.dto.AsignaturasInputDto;
import com.bosonit.BP1.Asignaturas.infrastructure.controller.dto.AsignaturasOutputDtoFull;
import com.bosonit.BP1.Asignaturas.infrastructure.repository.AsignaturasRepositoryJpa;
import com.bosonit.BP1.Estudiante.infrastructure.repository.StudentRepositoryJpa;
import com.bosonit.BP1.Profesor.domain.Profesor;
import com.bosonit.BP1.Profesor.infrastructure.repository.ProfesorRepositoryJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AsignaturasServiceImpl implements AsignaturasService {

    @Autowired
    AsignaturasRepositoryJpa asignaturasRepositoryJpa;

    @Autowired
    StudentRepositoryJpa studentRepositoryJpa;

    @Autowired
    ProfesorRepositoryJpa profesorRepositoryJpa;


    @Override
    public AsignaturaOutputDto crearAsignatura(AsignaturasInputDto asignaturasInputDto) throws Exception {
       // Profesor profesor= profesorRepositoryJpa.findById(asignaturasInputDto.getProfesorID()).orElse(null);
        //if(profesor==null)
          //  throw new RuntimeException("Necesita asignar un profesor");

        Asignaturas asignaturas = new Asignaturas(asignaturasInputDto);
        asignaturasRepositoryJpa.save(asignaturas);
        return new AsignaturaOutputDto(asignaturas);

    }

    @Override
    public AsignaturaOutputDto dameAsignaturaID(int id) throws Exception {
        return null;
    }

    @Override
    public List<AsignaturasOutputDtoFull> dameAsignaturas() {
        List<AsignaturasOutputDtoFull> listaAsignaturas= new ArrayList<>();
        for(Asignaturas asignaturas : asignaturasRepositoryJpa.findAll()){
            listaAsignaturas.add(new AsignaturasOutputDtoFull(asignaturas));
        }
        return listaAsignaturas;
    }

    @Override
    public AsignaturasOutputDtoFull actualizaAsignatura(int id, AsignaturasInputDto asignaturasInputDto) {
        return null;
    }
}
