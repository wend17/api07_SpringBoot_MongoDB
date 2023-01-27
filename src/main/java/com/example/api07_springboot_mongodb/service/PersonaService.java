package com.example.api07_springboot_mongodb.service;

import com.example.api07_springboot_mongodb.model.Persona;
import com.example.api07_springboot_mongodb.repository.PersonaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonaService {

    private final PersonaRepository personaRepository;

    public void save (Persona persona){
        personaRepository.save(persona);
    }

    public List <Persona> findAll(){
        return personaRepository.findAll();
    }

    public Optional<Persona> findById(String id){
        return personaRepository.findById(id);
    }

    public  void deleteByID (String id){
        personaRepository.deleteById(id);
    }

}
