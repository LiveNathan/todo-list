package dev.nathanlively.todolist.adapter.in.web;

import dev.nathanlively.todolist.application.domain.model.User;
import dev.nathanlively.todolist.application.port.in.GetUsersUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
class GetUsersController {

    private final GetUsersUseCase getUsersUseCase;

    @GetMapping("/users")
    String showAllUsers(Model model) {

        List<User> users = getUsersUseCase.getAllUsers();

        model.addAttribute("users", users);
        return "users";
    }
}
