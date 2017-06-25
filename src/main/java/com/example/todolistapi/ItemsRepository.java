package com.example.todolistapi;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.todolistapi.entity.Item;

public interface ItemsRepository extends JpaRepository<Item, Integer>{
}
