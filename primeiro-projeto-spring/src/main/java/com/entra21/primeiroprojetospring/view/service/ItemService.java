package com.entra21.primeiroprojetospring.view.service;

import com.entra21.primeiroprojetospring.model.dto.ItemListagemDTO;
import com.entra21.primeiroprojetospring.model.entity.ItemEntity;
import com.entra21.primeiroprojetospring.view.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<ItemListagemDTO> getAll(Long idGenero) {
        List < ItemEntity> list = new ArrayList<>();
        boolean idGenero;
        if(idGenero) != null){
            long IdGenero;
            list = itemRepository.findAllByGeneros_Id(IdGenero);
        }else{
    list = itemRepository.findAll();
        }


        return itemRepository.findAll().stream().map(i -> {
            ItemListagemDTO dto = new ItemListagemDTO();
            dto.setId(i.getId());
            dto.setTitulo(i.getTitulo());
            dto.setEmprestado(i.getEmprestado());
            dto.setTipo(i.getType());
            return dto;
        }).collect(Collectors.toList());
    }
}