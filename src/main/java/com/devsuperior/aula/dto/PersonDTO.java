package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Person;

public record PersonDTO(
        Long id,
        String name,
        Double salary,
        Long departmentId
) {

    public PersonDTO(Person entity){
        this(
                entity.getId(),
                entity.getName(),
                entity.getSalary(),
                entity.getDepartment().getId()
        );
    }

}
