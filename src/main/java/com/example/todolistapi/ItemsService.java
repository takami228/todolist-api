package com.example.todolistapi;

import com.example.todolistapi.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ItemsService {
    @Autowired
    ItemsRepository repository;

    public List<Item> selectAll(){
        return repository.findAll(new Sort(Sort.Direction.ASC, "id"));
    }

    public Item findById(int id){
        return repository.findOne(id);
    }

    public Item create(Item item){
        return repository.save(item);
    }

    public void update(Item item){
        Item target = repository.findOne(item.getId());
        target.setTitle(item.getTitle());
        target.setDescription(item.getDescription());
        target.setStatus(item.getStatus());
        repository.save(target);
    }

    public void deleteById(int id){
        repository.delete(id);
    }

    public void deleteAll(){
        repository.deleteAll();
    }
}
