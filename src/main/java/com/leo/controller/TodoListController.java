package com.leo.controller;

import com.leo.dao.TodoRepository;
import com.leo.model.Todo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author LIULE9
 */
@RestController
@RequestMapping("/todos")
public class TodoListController {

    @Autowired
    private TodoRepository repository;


    @GetMapping
    public List<Todo> showAll() {
        return repository.findAll();
    }

    @PostMapping
    public String addTodo(@RequestBody Todo todo) {
        if (!checkTodo(todo)) {
            return "add todo fail";
        }
        repository.save(todo);
        return "add todo success";
    }


    @PutMapping("/{id}")
    public String updateTodo(@PathVariable("id") String id, @RequestBody Todo todo) {
        if (!StringUtils.isNotBlank(id)) {
            return "update todo fail";
        }
        repository.saveAndFlush(todo);
        return "update todo success";
    }


    @DeleteMapping("/{id}")
    public String deleteTodo(@PathVariable("id") String id) {
        if (!StringUtils.isNotBlank(id)) {
            return "delete todo fail";
        }
        try {
            Todo todo = repository.getOne(id);
            repository.delete(todo);
            return "delete success";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "can not find todo by this id";
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
