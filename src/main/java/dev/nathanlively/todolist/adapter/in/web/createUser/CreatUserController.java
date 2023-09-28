package dev.nathanlively.todolist.adapter.in.web.createUser;

import dev.nathanlively.todolist.application.port.in.RegisterUserDto;
import dev.nathanlively.todolist.application.port.in.RegisterUserUseCase;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
@RequestMapping("/users/create")
public class CreatUserController {

    private final RegisterUserUseCase registerUserUseCase;

    @GetMapping
    public String showCreateUsers(Model model, RedirectAttributes redirectAttributes) {
        model.addAttribute("userFormDto", new UserFormDto());
        redirectAttributes.addFlashAttribute("error", model.asMap().get("error"));
        return "create";
    }

    @PostMapping
    public String registerUser(Model model, @Valid @ModelAttribute UserFormDto userFormDto, RedirectAttributes redirectAttributes) {
        RegisterUserDto registerUserDto = new RegisterUserDto(userFormDto.getEmail(), userFormDto.getFirstName(), userFormDto.getLastName());
        Boolean success = null;
        try {
            success = registerUserUseCase.register(registerUserDto);
        } catch (RuntimeException e) {
            redirectAttributes.addFlashAttribute("error", "There was a problem creating a new user. Error: " + e.getMessage());
            return "redirect:/users/create";
        }
        if (!success) {
            redirectAttributes.addFlashAttribute("error", "There was a problem creating a new user.");
            return "redirect:/users/create";
        }

        redirectAttributes.addFlashAttribute("success", "User created successfully.");
        return "redirect:/users";
    }

}
