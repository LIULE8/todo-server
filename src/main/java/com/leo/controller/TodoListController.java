package com.leo.controller;

import com.leo.model.Todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LIULE9
 */
@RestController
public class TodoListController {


    @GetMapping("/todo/showAll")
    public List<Todo> showAll() {
        System.out.println("12312321");
        List<Todo> todos = new ArrayList<>();
        todos.add(new Todo("1", "asd", false));
        todos.add(new Todo("2", "22sss", false));
        todos.add(new Todo("3", "1111", false));
        todos.add(new Todo("4", "iwre12", false));
        return todos;
    }

}
