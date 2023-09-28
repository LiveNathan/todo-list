package dev.nathanlively.todolist.adapter.out.persistence;

import dev.nathanlively.todolist.adapter.in.web.getUsers.GetUsersResponse;
import dev.nathanlively.todolist.adapter.in.web.getUsers.UserDto;
import dev.nathanlively.todolist.application.port.out.CreateUserDto;

interface UserRepository {
    GetUsersResponse getAllUsers();

    Boolean createUser(CreateUserDto userDto);
}
