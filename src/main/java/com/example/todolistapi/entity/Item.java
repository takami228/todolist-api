package com.example.todolistapi.entity;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import lombok.Data;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
@Entity
@Table(name="items")
public class Item {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=1, max=255)
    private String title;

    @NotNull
    @Size(min=1, max=1024)
    private String description;

    @NotNull
    private int status;
}