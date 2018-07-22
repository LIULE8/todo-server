package com.leo.controller;

import com.leo.dao.TodoRepository;
import com.leo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author LIULE9
 */
@RestController
public class TodoListController {

    @Autowired
    private TodoRepository repository;

    @GetMapping("/todo/showAll")
    public List<Todo> showAll() {
        return repository.findAll();
    }

}
