package dev.nathanlively.todolist.adapter.out.persistence;

import dev.nathanlively.todolist.adapter.in.web.getUsers.GetUsersResponse;
import dev.nathanlively.todolist.adapter.in.web.getUsers.UserDto;
import dev.nathanlively.todolist.application.domain.model.User;
import dev.nathanlively.todolist.application.port.out.LoadUsersPort;
import dev.nathanlively.todolist.common.PersistenceAdapter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@PersistenceAdapter
class UserPersistenceAdapter implements LoadUsersPort {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public List<User> loadUsers() {

        GetUsersResponse getUsersResponse = userRepository.getAllUsers();

        return userMapper.mapToDomainEntity(getUsersResponse);
    }

    @Override
    public List<UserDto> loadUserDtos(List<User> users) {
        return userMapper.userToUserDto(users);
    }
}
