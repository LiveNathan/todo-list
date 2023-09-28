package dev.nathanlively.todolist.application.port.in;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import static dev.nathanlively.todolist.common.validation.Validation.validate;

public record RegisterUserDto(@Email String email,
                              @NotBlank String firstName,
                              @NotBlank String lastName) {
    public RegisterUserDto(String email, String firstName, String lastName) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        validate(this);
    }
}
