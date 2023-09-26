package dev.nathanlively.todolist.application.domain.model;

import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
public class User {
    private int id;
    private String email;
    private String first_name;
    private String last_name;

    public static User withId(int id, String email, String first_name, String last_name) {
        return new User(id, email, first_name, last_name);
    }
}
