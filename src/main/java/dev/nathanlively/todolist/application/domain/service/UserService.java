package dev.nathanlively.todolist.application.domain.service;

import dev.nathanlively.todolist.application.domain.model.User;
import dev.nathanlively.todolist.application.port.in.GetUsersUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserService implements GetUsersUseCase {
    @Override
    public List<User> getAllUsers() {



        return users;
    }
}
