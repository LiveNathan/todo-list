package dev.nathanlively.todolist.application.domain.model;

import java.time.LocalDateTime;

public class User {
    private int id;
    private String email;
    private String first_name;
    private String last_name;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}
