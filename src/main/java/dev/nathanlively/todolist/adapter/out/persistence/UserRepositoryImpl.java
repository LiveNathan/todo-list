package dev.nathanlively.todolist.adapter.out.persistence;

import dev.nathanlively.todolist.adapter.in.web.getUsers.GetUsersResponse;
import dev.nathanlively.todolist.adapter.in.web.getUsers.UserDto;
import dev.nathanlively.todolist.application.port.out.CreateUserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
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

    @Override
    public Boolean createUser(CreateUserDto userDto) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<CreateUserDto> entity = new HttpEntity<>(userDto, headers);

        try {
            ResponseEntity<Void> response = restTemplate.exchange(
                    "http://demo.codingnomads.co:8080/tasks_api/users",
                    HttpMethod.POST,
                    entity,
                    Void.class
            );

            return response.getStatusCode().equals(HttpStatus.CREATED);
        } catch (HttpClientErrorException e) {
            if (e.getStatusCode().value() == 400) {
                throw new RuntimeException("Error while creating user: " + e.getResponseBodyAsString());
            }
            throw e;
        }
    }
}
