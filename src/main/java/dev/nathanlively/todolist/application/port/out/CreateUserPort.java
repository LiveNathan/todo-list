package dev.nathanlively.todolist.application.port.out;

import dev.nathanlively.todolist.adapter.in.web.getUsers.UserDto;
import dev.nathanlively.todolist.application.domain.model.User;

import java.util.List;

public interface CreateUserPort {
    Boolean create(CreateUserDto createUserDto);
//    List<UserDto> loadUserDtos(List<User> users);

}
