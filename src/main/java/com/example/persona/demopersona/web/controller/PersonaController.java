package com.example.persona.demopersona.web.controller;

import com.example.persona.demopersona.domain.dto.Response;
import com.example.persona.demopersona.domain.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/persona")
public class PersonaController {
    private final PersonaService service;

    @Autowired
    public PersonaController(PersonaService service) {
        this.service = service;
    }

    @GetMapping("/porEdad")
    public ResponseEntity<List<Response>> getPersonasPorEdad() {
        return new ResponseEntity<>(service.personasPorEdad(), HttpStatus.OK);
    }

    @GetMapping("/porEdadOrdenado")
    public ResponseEntity<List<Response>> getPersonasPorEdadOrdenado() {
        return new ResponseEntity<>(service.personasPorEdadOrdenado(), HttpStatus.OK);
    }
}
