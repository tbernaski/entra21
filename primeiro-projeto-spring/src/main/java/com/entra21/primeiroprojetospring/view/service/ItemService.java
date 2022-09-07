package com.entra21.primeiroprojetospring.view.service;

import com.entra21.primeiroprojetospring.model.dto.FranquiaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService {

    @Autowired
    private itemRepository itemRepository;

    public List<DTO> getAll() {
        return itemRepository.map(fr -> {
            FranquiaDTO dto = new FranquiaDTO();
            dto;
            dto;
            return dto;
        }).collect(Collectors.toList());
}
