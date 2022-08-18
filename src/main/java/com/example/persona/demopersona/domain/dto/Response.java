package com.example.persona.demopersona.domain.dto;

import lombok.Data;

import java.util.List;

@Data
public class Response {

    private int edad;
    private List<Persona> personas;
}
