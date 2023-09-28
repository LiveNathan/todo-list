package dev.nathanlively.todolist.adapter.in.web.createUser;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserFormDto {
    @Email String email;
    @NotBlank String firstName;
    @NotBlank String lastName;
}
