package com.leo.model;


import javax.persistence.*;

/**
 * @author LIULE9
 */
@Entity
public class Todo {

    private String id;
    private String name;
    private boolean complete;


    public Todo(String id, String name, boolean complete) {
        this.id = id;
        this.name = name;
        this.complete = complete;
    }

    public Todo() {
    }

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "complete")
    public boolean getComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", complete='" + complete + '\'' +
                '}';
    }
}
