package com.entra21.primeiroprojetospring.controller;

import com.entra21.primeiroprojetospring.model.dto.GeneroDTO;
import com.entra21.primeiroprojetospring.model.dto.GeneroPayloadDTO;
import com.entra21.primeiroprojetospring.model.entity.GeneroEntity;
import com.entra21.primeiroprojetospring.view.repository.GeneroRepository;
import com.entra21.primeiroprojetospring.view.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/generos")
public class GeneroRestController {

    @Autowired
    private GeneroService generoService;

    @GetMapping
    public List<GeneroDTO> getGeneros() {
        return generoService.getAll();
    }

    @PostMapping
    public void addGenero(@RequestBody GeneroPayloadDTO newGenero) {
        generoService.save(newGenero);
    }

    @GetMapping("/{id}")
    public GeneroDTO getGenero(@PathVariable(name = "id") Long id) {
        return generoService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteGenero(@PathVariable(name = "id") Long id) {
        GeneroService.delete(id);
    }

    @PutMapping("/{id}")
    public GeneroDTO updateGenero(@PathVariable(name = "id") Long id,
                                  @RequestBody String novoNome) {
        return generoService.update(id, novoNome);
    }
}