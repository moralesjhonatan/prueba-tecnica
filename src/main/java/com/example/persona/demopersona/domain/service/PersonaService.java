package com.example.persona.demopersona.domain.service;

import com.example.persona.demopersona.domain.dto.Persona;
import com.example.persona.demopersona.domain.dto.Response;
import com.example.persona.demopersona.domain.repository.PersonaData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonaService {

    PersonaData data = new PersonaData();
    List<Response> lista = new ArrayList<>();
    List<Persona> personasPorEdad;

    public List<Response> personasPorEdad() {
        List<Persona> personas = data.agregarData();
        List<Persona> personasTemp;

        for (Persona per: personas) {
            Response response = new Response();
            response.setEdad(per.getAge());
            personasTemp = personas.stream().filter(f -> f.getAge() == per.getAge()).collect(Collectors.toList());
            response.setPersonas(personasTemp);
            lista.add(response);
        }
        return lista;
    }

    public List<Response> personasPorEdadOrdenado() {
        List<Persona> personas = data.agregarData();
        List<Persona> personasTemp;

        for (Persona per: personas) {
            Response response = new Response();
            response.setEdad(per.getAge());
            personasTemp = personas.stream()
                    .filter(f -> f.getAge() == per.getAge())
                    .sorted((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()))
                    .collect(Collectors.toList());

            response.setPersonas(personasTemp);
            lista.add(response);
        }

        return lista;
    }
}
