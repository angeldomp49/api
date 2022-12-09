package org.makechtec.todolist.api.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity( name = "todos")
public class Todo {
    
    @Id
    private long id;
}
