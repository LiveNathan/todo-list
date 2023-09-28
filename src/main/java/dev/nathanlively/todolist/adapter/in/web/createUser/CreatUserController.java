package dev.nathanlively.todolist.adapter.in.web.createUser;

import dev.nathanlively.todolist.application.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/users/create")
public class CreatUserController {

    @GetMapping
    public String showCreateUsers(Model model) {
        model.addAttribute("userFormDto", new UserFormDto());
        return "create";
    }

    @PostMapping
    public String registerUser(Model model, @ModelAttribute UserFormDto userFormDto) {
        userFormDto.validate();
        return "redirect:/users";
    }

}
