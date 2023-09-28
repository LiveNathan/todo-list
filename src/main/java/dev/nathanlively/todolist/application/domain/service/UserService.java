package dev.nathanlively.todolist.application.domain.service;

import dev.nathanlively.todolist.adapter.in.web.createUser.UserFormDto;
import dev.nathanlively.todolist.application.domain.model.User;
import dev.nathanlively.todolist.application.port.in.GetUsersUseCase;
import dev.nathanlively.todolist.application.port.in.RegisterUserUseCase;
import dev.nathanlively.todolist.application.port.out.LoadUsersPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserService implements GetUsersUseCase, RegisterUserUseCase {

    private final LoadUsersPort loadUsersPort;

    @Override
    public List<User> getAllUsers() {
        return loadUsersPort.loadUsers();
    }

    @Override
    public User register(UserFormDto userFormDto) {
        return null;
    }
}
