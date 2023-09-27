package dev.nathanlively.todolist.application.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User {
    private int id;
    private String email;
    private String firstName;
    private String lastName;

    public static User withId(int id, String email, String firstName, String lastName) {
        return new User(id, email, firstName, lastName);
    }
}
