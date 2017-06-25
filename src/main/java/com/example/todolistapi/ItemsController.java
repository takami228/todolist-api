package com.example.todolistapi;

import com.example.todolistapi.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    ItemService service;

    @RequestMapping(method= RequestMethod.GET)
    public List<Item> itemSelectAll(){
        return service.selectAll();
    }

    @RequestMapping(method= RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void itemDeleteAll(){
        service.deleteAll();
    }
}
