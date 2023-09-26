package dev.nathanlively.todolist.application.domain.service;

import dev.nathanlively.todolist.application.domain.model.User;
import dev.nathanlively.todolist.application.port.in.GetUsersUseCase;
import dev.nathanlively.todolist.application.port.out.LoadUsersPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserService implements GetUsersUseCase {

    private final LoadUsersPort loadUsersPort;

    @Override
    public List<User> getAllUsers() {

        List<User> users = loadUsersPort.loadUsers();

        return users;
    }
}
