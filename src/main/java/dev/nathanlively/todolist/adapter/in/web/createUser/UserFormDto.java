package dev.nathanlively.todolist.adapter.in.web.createUser;

import dev.nathanlively.todolist.common.validation.Validation;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import static dev.nathanlively.todolist.common.validation.Validation.validate;

public record UserFormDto(@Email String email,
                          @NotBlank String firstName,
                          @NotBlank String lastName) {
    public UserFormDto(String email, String firstName, String lastName) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UserFormDto() {
        this(null, null, null);
    }

    public void validate() {
        Validation.validate(this);
    }
}
