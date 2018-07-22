package com.leo.controller;

import com.leo.dao.TodoRepository;
import com.leo.model.Todo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping("/todo/add")
    public String addTodo(Todo todo) {
        if (!checkTodo(todo)) {
            return "add todo fail";
        }
        repository.save(todo);
        return "add todo success";
    }

    private boolean checkTodo(Todo todo) {
        boolean flag = true;
        if (todo == null) {
            flag = false;
        } else if (!StringUtils.isNotBlank(todo.getId())) {
            flag = false;
        } else if (!StringUtils.isNotBlank(todo.getName())) {
            flag = false;
        }
        return flag;
    }

}
