package dev.nathanlively.todolist.application.port.in;

public interface RegisterUserUseCase {
    Boolean register(RegisterUserDto registerUserDto);
}
