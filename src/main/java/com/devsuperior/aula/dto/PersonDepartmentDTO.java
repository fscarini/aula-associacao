package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Person;

public record PersonDepartmentDTO(
        Long id,
        String name,
        Double salary,
        DepartmentDTO department
) {

    public PersonDepartmentDTO(Person entity){
        this(
                entity.getId(),
                entity.getName(),
                entity.getSalary(),
                new DepartmentDTO(entity.getDepartment())
        );
    }

}
