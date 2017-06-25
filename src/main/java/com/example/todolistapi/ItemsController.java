package com.example.todolistapi;

import com.example.todolistapi.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemsController {
    @Autowired
    ItemsService service;

    @RequestMapping(value="/items", method= RequestMethod.GET)
    public List<Item> itemSelectAll(){
        return service.selectAll();
    }

    @RequestMapping(value="/items/{id}", method= RequestMethod.GET)
    public Item selectItemById(@PathVariable("id") int id){
        return service.findById(id);
    }

    @RequestMapping(value="/items", method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void createItem(@RequestBody Item item){
        service.create(item);
    }

    @RequestMapping(value="/items/{id}", method= RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteItemById(@PathVariable("id") int id){
        service.deleteById(id);
    }

    @RequestMapping(value="/items/{id}", method= RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateItemById(@RequestBody Item item){
        service.update(item);
    }


    @RequestMapping(value="/items", method= RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void itemDeleteAll(){
        service.deleteAll();
    }
}
