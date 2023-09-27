package dev.nathanlively.todolist.adapter.in.web.users;

public record UserDto(
        int id,
        String email,
        String firstName,
        String lastName
) {
}
