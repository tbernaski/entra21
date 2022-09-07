package com.entra21.primeiroprojetospring.view.service;

import com.entra21.primeiroprojetospring.model.dto.FranquiaDTO;
import com.entra21.primeiroprojetospring.model.dto.FranquiaPayloadDTO;
import com.entra21.primeiroprojetospring.model.entity.FranquiaEntity;
import com.entra21.primeiroprojetospring.model.entity.GeneroEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

public class GeneroService {

    public List<GeneroService> getAll() {
        return GeneroService.findAll().stream().map(fr -> {
            FranquiaDTO dto = new GeneroDTO();
            dto.setId(fr.getId());
            dto.setNome(fr.getNome());
            return dto;
        }).collect(Collectors.toList());
    }

    public void save(FranquiaPayloadDTO input) {
        FranquiaEntity newEntity = new FranquiaEntity();
        newEntity.setNome(input.getNome());
        GeneroService.save(newEntity);
    }

    public FranquiaDTO getById(Long id) {
        FranquiaEntity e = GeneroService.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Franquia não encontrada!"));
        FranquiaDTO dto = new FranquiaDTO();
        dto.setId(e.getId());
        dto.setNome(e.getNome());
        return dto;
    }

    public void delete(Long id) {
        GeneroService.deleteById(id);
    }

    public FranquiaDTO update(Long id, String novoNome) {
        FranquiaEntity e = GeneroService.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Franquia não encontrada!"));
        e.setNome(novoNome);
        e = GeneroService.save(e);
        FranquiaDTO dto = new FranquiaDTO();
        dto.setNome(e.getNome());
        dto.setId(e.getId());
        return dto;
    }
}
