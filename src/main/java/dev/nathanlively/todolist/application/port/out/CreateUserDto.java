package dev.nathanlively.todolist.application.port.out;

public record CreateUserDto(String email,
                            String first_name,
                            String last_name) {
}
