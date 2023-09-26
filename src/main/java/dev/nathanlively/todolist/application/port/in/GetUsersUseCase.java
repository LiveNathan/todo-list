package dev.nathanlively.todolist.application.port.in;

import dev.nathanlively.todolist.application.domain.model.User;

import java.util.List;

public interface GetUsersUseCase {
    List<User> getAllUsers();
}
