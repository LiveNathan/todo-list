package dev.nathanlively.todolist.adapter.out.persistence;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserApiEntity {
    private int id;
    private String email;
    private String first_name;
    private String last_name;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}
