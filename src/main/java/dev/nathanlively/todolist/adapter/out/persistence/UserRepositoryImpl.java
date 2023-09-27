package dev.nathanlively.todolist.adapter.out.persistence;

import dev.nathanlively.todolist.application.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@Repository
@RequiredArgsConstructor
class UserRepositoryImpl implements UserRepository {

    private final RestTemplate restTemplate;

    @Override
    public List<UserApiEntity> getAllUsers() {
        ResponseEntity<List<UserApiEntity>> response = restTemplate.exchange(
                "http://demo.codingnomads.co:8080/tasks_api/users",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<UserApiEntity>>() {}
        );
        return response.getBody();
    }
}
