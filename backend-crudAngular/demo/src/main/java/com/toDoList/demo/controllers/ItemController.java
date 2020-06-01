package com.toDoList.demo.controllers;

import com.toDoList.demo.models.entities.Item;
import com.toDoList.demo.models.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "api")
public class ItemController {

    @Autowired // Com essa anotação indicamos que os parâmetros do nosso construtor serão injetados
    private ItemRepository itemRepository;

    //Inserindo Novo Item
    @PostMapping(path = "/Item")
    public String newItem (Item item){
        itemRepository.save(item);
        return "Novo Item inserido";
    }
    //Deletando Item
    @DeleteMapping(path = "/Item")
    public String deletandoITem(@PathVariable int id){
        itemRepository.deleteById(id);
        return "Deletado com Sucesso.";
    }
    //Retornando Todos os Items
    @GetMapping(path = "/Item")
    public Iterable<Item> get(){
        return itemRepository.findAll();
    }
    //Buscando por Materia
    @GetMapping(path = "/ItemByMat/{mat}")
    public Optional<List<Item>> searchByMateria(@PathVariable String mat){
        Optional<List<Item>> item =itemRepository.findByMateria(mat);
        return item;
    }
    //Editando Item
    @PutMapping(path = "/Item")
    public Item EditandoItem(@RequestBody Item item){ // Recebendo o Json modificado no front
        return itemRepository.save(item);
    }
}
