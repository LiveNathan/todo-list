package dev.nathanlively.todolist.adapter.in.web.users;

import dev.nathanlively.todolist.adapter.out.persistence.UserMapper;
import dev.nathanlively.todolist.application.domain.model.User;
import dev.nathanlively.todolist.application.port.in.GetUsersUseCase;
import dev.nathanlively.todolist.application.port.out.LoadUsersPort;
import dev.nathanlively.todolist.common.WebAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequiredArgsConstructor
@RequestMapping("/users")
public class GetUsersController {
    private final GetUsersUseCase getUsersUseCase;
    private final LoadUsersPort loadUsersPort;

    @GetMapping
    public String showAllUsers(Model model) {

        List<User> users = getUsersUseCase.getAllUsers();
        List<UserDto> userDtos = loadUsersPort.loadUserDtos(users);

        model.addAttribute("users", userDtos);
        return "users";
    }
}
