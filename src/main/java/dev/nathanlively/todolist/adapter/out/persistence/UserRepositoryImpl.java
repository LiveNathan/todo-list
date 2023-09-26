package dev.nathanlively.todolist.adapter.out.persistence;

import dev.nathanlively.todolist.application.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Repository
@RequiredArgsConstructor
class UserRepositoryImpl implements UserRepository {

    private final RestTemplate restTemplate;

    @Override
    public List<User> getAllUsers() {
        return restTemplate.getForObject("http://demo.codingnomads.co:8080/tasks_api/users", ResponseEntity.class).getBody().getData();
    }
}
