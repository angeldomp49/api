package org.makechtec.todolist.api.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @Autowired
    private ExampleRepository exampleRepository;
    
    @GetMapping("/example")
    @ResponseBody
    public String getExample(){
        exampleRepository.deleteTodo(0);
        return "hello";
    }
}
