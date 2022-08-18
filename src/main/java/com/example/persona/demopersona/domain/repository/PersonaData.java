package com.example.persona.demopersona.domain.repository;

import com.example.persona.demopersona.domain.dto.Persona;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PersonaData {

    public List<Persona> agregarData() {
        final List<Persona> nationalTeam = new ArrayList<>();
        nationalTeam.add(new Persona(37, "Claudio Bravo"));
        nationalTeam.add(new Persona(36, "Jean Beausejour"));
        nationalTeam.add(new Persona(34, "Gonzalo Jara"));
        nationalTeam.add(new Persona(33, "Gary Medel"));
        nationalTeam.add(new Persona(32, "Mauricio Isla"));
        nationalTeam.add(new Persona(31, "Charles Aránguiz"));
        nationalTeam.add(new Persona(33, "Arturo Vidal"));
        nationalTeam.add(new Persona(34, "Matias Fernandez"));
        nationalTeam.add(new Persona(36, "Jorge Valdivia"));
        nationalTeam.add(new Persona(31, "Alexis Sánchez"));
        nationalTeam.add(new Persona(30, "Eduardo Vargas"));

        return nationalTeam;
    }
}
