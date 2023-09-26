package dev.nathanlively.todolist.application.port.out;

import dev.nathanlively.todolist.application.domain.model.User;

import java.time.LocalDateTime;
import java.util.List;

public interface LoadUsersPort {
    List<User> loadUsers();

}
