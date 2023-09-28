package dev.nathanlively.todolist.application.domain.service;

import dev.nathanlively.todolist.application.port.in.RegisterUserDto;
import dev.nathanlively.todolist.application.domain.model.User;
import dev.nathanlively.todolist.application.port.in.GetUsersUseCase;
import dev.nathanlively.todolist.application.port.in.RegisterUserUseCase;
import dev.nathanlively.todolist.application.port.out.CreateUserDto;
import dev.nathanlively.todolist.application.port.out.CreateUserPort;
import dev.nathanlively.todolist.application.port.out.LoadUsersPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserService implements GetUsersUseCase, RegisterUserUseCase {

    private final LoadUsersPort loadUsersPort;
    private final CreateUserPort createUserPort;

    @Override
    public List<User> getAllUsers() {
        return loadUsersPort.loadUsers();
    }

    @Override
    public Boolean register(RegisterUserDto registerUserDto) {
        User user = User.withoutId(registerUserDto.email(), registerUserDto.firstName(), registerUserDto.lastName());
        CreateUserDto userDto = new CreateUserDto(user.getEmail(), user.getFirstName(), user.getLastName());
        return createUserPort.create(userDto);
    }
}
