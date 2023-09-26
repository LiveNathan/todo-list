package dev.nathanlively.todolist.adapter.out.persistence;

import dev.nathanlively.todolist.application.domain.model.User;
import dev.nathanlively.todolist.application.port.out.LoadUsersPort;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
class UserPersistenceAdapter implements LoadUsersPort {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public List<User> loadUsers() {


        return users;
    }
}
