package dev.nathanlively.todolist.adapter.out.persistence;

import dev.nathanlively.todolist.adapter.in.web.users.GetUsersResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
@RequiredArgsConstructor
class UserRepositoryImpl implements UserRepository {

    private final RestTemplate restTemplate;

    @Override
    public GetUsersResponse getAllUsers() {
        ResponseEntity<GetUsersResponse> response = restTemplate.exchange(
                "http://demo.codingnomads.co:8080/tasks_api/users",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {
                }
        );
        return response.getBody();
    }
}
