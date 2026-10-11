package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Department;

public record DepartmentDTO(
        Long id,
        String name
){

    public DepartmentDTO(Department entity){
        this(
                entity.getId(),
                entity.getName()
        );
    }

}
