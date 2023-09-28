package dev.nathanlively.todolist.application.port.in;

import dev.nathanlively.todolist.adapter.in.web.createUser.UserFormDto;
import dev.nathanlively.todolist.application.domain.model.User;

import java.util.List;

public interface RegisterUserUseCase {
    User register(UserFormDto userFormDto);
}
