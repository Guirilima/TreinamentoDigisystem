package com.toDoList.demo.service;

import com.toDoList.demo.exception.ItemNotFoundException;
import com.toDoList.demo.models.entities.Item;
import com.toDoList.demo.models.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired // Com essa anotação indicamos que os parâmetros do nosso construtor serão injetados
    private ItemRepository itemRepository;

    public Iterable<Item> findAll() {
        return itemRepository.findAll();
    }

    public Item findById(int id) {
        Optional<Item> itemID = itemRepository.findById(id);

        if(itemID.isPresent()){
            return itemID.get();
        }else {
            throw new ItemNotFoundException();
        }
    }

    public Item save(Item item) {
        return itemRepository.save(item);
    }

    public Item update(int id, Item dto) {

        Optional<Item> itemEntity = itemRepository.findById(id) ;
        final Item item; // Pesquisar

        if(itemEntity.isPresent()){
            item = itemEntity.get();
        }else {
            throw new ItemNotFoundException();
        }
        item.setMateria(dto.getMateria()); //salvando manualmente
        item.setTarefa(dto.getTarefa());
        item.setDtEntrega(dto.getDtEntrega());
        item.setStatus(dto.getStatus());

        return itemRepository.save(item); //retornando item atualizado
    }

    public void delete(int id) {
        //final Item item = findById(id);
        //itemRepository.delete(item);   //OU
        itemRepository.deleteById(id);
    }
}
