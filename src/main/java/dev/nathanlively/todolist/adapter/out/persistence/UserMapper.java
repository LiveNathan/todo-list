package dev.nathanlively.todolist.adapter.out.persistence;

import dev.nathanlively.todolist.application.domain.model.User;
import org.springframework.stereotype.Component;

@Component
class UserMapper {
    User mapToDomainEntity(UserApiEntity userApiEntity) {
        return User.withId(userApiEntity.getId(), userApiEntity.getEmail(), userApiEntity.getFirst_name(), userApiEntity.getLast_name());
    }
}
