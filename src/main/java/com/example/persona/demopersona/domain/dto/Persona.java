package com.example.persona.demopersona.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Persona {

    private int age;
    private String name;

    public Persona(final int age, final String name) {
        super();
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
