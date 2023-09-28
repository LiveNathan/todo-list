package dev.nathanlively.todolist.adapter.in.web.getUsers;

public record UserDto(
        int id,
        String email,
        String firstName,
        String lastName
) {
}
