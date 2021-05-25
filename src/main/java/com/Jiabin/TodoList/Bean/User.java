package com.Jiabin.TodoList.Bean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "User")
public class User {
    private static final long serialVersionUID = 1L;
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ")
    @SequenceGenerator(name = "SEQ", sequenceName = "USER_SEQ")
    @Column(name = "user_id")
    private int id;
    @Column(name = "username", unique = true, nullable = false)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "User")
    private List<Task> todoList = new ArrayList<>();
    @Column(name = "role", nullable = false)
    private String role;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Task> getTodoList() {
        return todoList;
    }

    public void setTodoList(List<Task> todoList) {
        this.todoList = todoList;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", todoList=" + todoList +
                ", role='" + role + '\'' +
                '}';
    }
}
