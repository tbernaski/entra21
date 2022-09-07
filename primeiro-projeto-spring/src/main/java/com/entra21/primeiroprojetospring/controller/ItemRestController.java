package com.entra21.primeiroprojetospring.controller;

import com.entra21.primeiroprojetospring.model.dto.FranquiaDTO;
import com.entra21.primeiroprojetospring.model.dto.FranquiaPayloadDTO;
import com.entra21.primeiroprojetospring.model.dto.ItemDTO;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemRestController {

    @Autowired
    private itemRepository itemRepository;

    @GetMapping
    public List<ItemDTO> getItems() {
        return itemService.getAll();
    }

    @PostMapping
    public void addItem(@RequestBody FranquiaPayloadDTO newItem) {
        itemService.save(newItem);
    }
}
