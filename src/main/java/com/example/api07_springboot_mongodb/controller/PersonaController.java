package com.example.api07_springboot_mongodb.controller;

import com.example.api07_springboot_mongodb.model.Persona;
import com.example.api07_springboot_mongodb.service.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api07/v1")
@RequiredArgsConstructor
public class PersonaController {

    private final PersonaService personaService;

    @PostMapping("/personas")
    public void save(@RequestBody Persona persona){
        personaService.save(persona);
    }

    @GetMapping("/personas")
    public List<Persona> findAll(){
        return personaService.findAll();
    }

    @GetMapping("/personas/{id}")
    public Persona findById (@PathVariable String id){
        return personaService.findById(id).get();
    }

    @DeleteMapping("/personas/{id}")
    public void deleteByID(@PathVariable String id){
        personaService.deleteByID(id);
    }

    @PutMapping("/personas")
    public void update (@RequestBody Persona persona){
        personaService.save(persona);
    }

}
