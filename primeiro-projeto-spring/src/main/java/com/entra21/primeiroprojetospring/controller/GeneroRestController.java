package com.entra21.primeiroprojetospring.controller;

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
    public List<GeneroEntity> getGeneros() {
        return GeneroService.findAll();
    }

    @PostMapping
    public void addFranquia(@RequestBody GeneroEntity newgenero) {
        GeneroService.save(newgenero);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GeneroEntity> getFranquia(@PathVariable(name = "id") Long id) {
        Optional<GeneroEntity> franquia = generoService.findById(id);
        if (franquia.isPresent()) {
            return ResponseEntity.ok(franquia.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public void deleteFranquia(@PathVariable(name = "id") Long id) {
        generoService.deleteById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GeneroEntity> updateFranquia(@PathVariable(name = "id") Long id,
                                                       @RequestBody String novoNome) {
        Optional<GeneroEntity> entity = generoService.findById(id);
        if (entity.isPresent()) {
            entity.get().setNome(novoNome);
            return ResponseEntity.ok(generoService.save(new GeneroEntity().get()));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
