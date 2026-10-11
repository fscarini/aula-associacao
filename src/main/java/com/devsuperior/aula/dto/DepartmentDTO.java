package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Department;
import com.devsuperior.aula.entities.Person;

public record DepartamentDTO (
        Long id,
        String name
){

    public DepartamentDTO(Department entity){
        this(
                entity.getId(),
                entity.getName()
        );
    }

}
