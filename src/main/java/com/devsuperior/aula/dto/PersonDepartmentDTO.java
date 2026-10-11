package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Person;

public record PersonDepartamentDTO(
        Long id,
        String name,
        Double salary,
        DepartamentDTO department
) {

    public PersonDepartamentDTO(Person entity){
        this(
                entity.getId(),
                entity.getName(),
                entity.getSalary(),
                new DepartamentDTO(entity.getDepartment())
        );
    }

}
