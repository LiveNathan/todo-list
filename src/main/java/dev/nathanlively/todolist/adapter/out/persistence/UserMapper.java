package dev.nathanlively.todolist.adapter.out.persistence;

import dev.nathanlively.todolist.application.domain.model.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
class UserMapper {
    User mapToDomainEntity(UserApiEntity userApiEntity) {
        return User.withId(userApiEntity.getId(), userApiEntity.getEmail(), userApiEntity.getFirst_name(), userApiEntity.getLast_name());
    }

    List<User> mapToDomainEntity(List<UserApiEntity> userApiEntities) {
        return userApiEntities.stream()
                .map(this::mapToDomainEntity)
                .collect(Collectors.toList());
    }
}
