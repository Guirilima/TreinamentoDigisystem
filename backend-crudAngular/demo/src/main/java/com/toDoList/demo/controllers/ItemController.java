package com.toDoList.demo.controllers;

import com.toDoList.demo.models.entities.Item;
import com.toDoList.demo.service.ItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api")
@Api(value = "API REST To Do List")
@CrossOrigin(origins = "*") //Liberando acesso para todos os dominios acessarem
public class ItemController {

    //Injetando nosso Service
    @Autowired
    private ItemService itemService;

    //Inserindo Novo Item
    @PostMapping(path = "/item") //REQUISIÇÂO
    @ResponseStatus(HttpStatus.CREATED) // HTTP 201 => CRIADO COM SUCESSO
    @ApiOperation(value = "Inserir nova tarefa") //SWAGGER
    public String newItem (@RequestBody Item item){ //Recebendo no corpo da Requisição
        itemService.save(item); //SALVANDO
        return "Novo Item inserido"; //RETORNANDO MSG DE SUCESSO
    }

    //Deletando Item
    @DeleteMapping(path = "/item/{id}")
    @ApiOperation(value = "Deletando uma tarefa por Id num parâmetro")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletandoITem(@PathVariable int id){
        itemService.delete(id); // criando método lá na classe itemService
    }

    //Retornando Todos os Items
    @GetMapping(path = "/item")
    @ApiOperation(value = "Retornando todas as tarefas")
    public Iterable<Item> get(){
        return itemService.findAll();
    }


//    //Buscando por Materia
//    @GetMapping(path = "/item/mat/{mat}")
//    public ResponseEntity<List<Item>> searchByMateria(@PathVariable String mat){
//        Optional<List<Item>> itemMat = itemRepository.findByMateria(mat);
//        if(itemMat.isPresent()){
//            return  ResponseEntity.ok(itemMat.get());
//        }else {
//            return ResponseEntity.notFound().build();
//        }
//    }

    //Buscando pelo ID
    @GetMapping(path = "/item/id/{id}")
    @ApiOperation(value = "Retornando Item por ID")
    public ResponseEntity<Item> searchByID(@PathVariable int id){
        Item itemID = itemService.findById(id);
        return ResponseEntity.ok(itemID);
    }

    //Editando item
    @PutMapping(path = "/item/{id}")
    @ApiOperation(value = "Editando um determinado item ")
    public ResponseEntity<Item> EditandoItembyID(@PathVariable("id") int id,@RequestBody Item dto){ // Recebendo o Json modificado no front
//        itemService.update(id,dto); // Colocar numa variavel e chamar-lo abaixo, ou . . .
        return ResponseEntity.ok(itemService.update(id,dto)); // Criei método novo lá no itemService
    }
}