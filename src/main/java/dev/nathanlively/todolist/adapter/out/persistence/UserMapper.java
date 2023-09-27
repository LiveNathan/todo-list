package dev.nathanlively.todolist.adapter.out.persistence;

import dev.nathanlively.todolist.adapter.in.web.users.GetUserDataItem;
import dev.nathanlively.todolist.adapter.in.web.users.GetUsersResponse;
import dev.nathanlively.todolist.adapter.in.web.users.UserDto;
import dev.nathanlively.todolist.application.domain.model.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
class UserMapper {
    User mapToDomainEntity(GetUserDataItem getUserDataItem) {
        return User.withId(getUserDataItem.id(), getUserDataItem.email(), getUserDataItem.firstName(), getUserDataItem.lastName());
    }

    List<User> mapToDomainEntity(GetUsersResponse getUsersResponse) {
        return getUsersResponse.data().stream()
                .map(this::mapToDomainEntity)
                .collect(Collectors.toList());
    }

    UserDto userToUserDto(User user) {
        return new UserDto(user.getId(), user.getEmail(), user.getFirstName(), user.getLastName());
    }

    List<UserDto> userToUserDto(List<User> users) {
        return users.stream()
                .map(this::userToUserDto)
                .collect(Collectors.toList());
    }

}
