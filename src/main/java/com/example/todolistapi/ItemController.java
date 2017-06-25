package com.example.todolistapi;

import com.example.todolistapi.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    ItemService service;

    @RequestMapping(value="/item/{id}", method= RequestMethod.GET)
    public Item selectItemById(@PathVariable("id") int id){
        return service.findById(id);
    }

    @RequestMapping(value="/item", method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void createItem(@RequestBody Item item){
        service.create(item);
    }

    @RequestMapping(value="/item/{id}", method= RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteItemById(@PathVariable("id") int id){
        service.deleteById(id);
    }

    @RequestMapping(value="/item/{id}", method= RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateItemById(@RequestBody Item item){
        service.update(item);
    }

}
