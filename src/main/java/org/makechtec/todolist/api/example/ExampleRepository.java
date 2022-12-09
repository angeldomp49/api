package org.makechtec.todolist.api.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleRepository extends JpaRepository<Todo, Integer>{
    
    @Procedure("delete_todo")
    public void deleteTodo( long id);
}
