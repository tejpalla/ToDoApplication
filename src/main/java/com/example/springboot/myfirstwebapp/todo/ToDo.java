package com.example.springboot.myfirstwebapp.todo;

import java.time.LocalDate;

public class ToDo {

    private long id;
    private String username;
    private String description;
    private LocalDate targetdate; //storing dates
    private boolean done;

    public ToDo(long id, String username, String description, LocalDate targetdate, boolean done) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetdate = targetdate;
        this.done = done;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetdate() {
        return this.targetdate;
    }

    public void setTargetdate(LocalDate targetdate) {
        this.targetdate = targetdate;
    }

    public boolean isDone() {
        return this.done;
    }

    public boolean getDone() {
        return this.done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", username='" + getUsername() + "'" +
            ", description='" + getDescription() + "'" +
            ", targetdate='" + getTargetdate() + "'" +
            ", done='" + isDone() + "'" +
            "}";
    }
    
}
