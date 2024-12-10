package com.example.springboot.user;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signIn")
    public UserDto signIn(@RequestBody UserDto userDto) {
        System.out.println("@PostMapping(\"/signIn\")");
        return this.userService.signIn(userDto);
    }

    @PostMapping("/signUp")
    public void signUp(@RequestBody UserDto userDto) throws Exception {
        System.out.println("@PostMapping(\"/signUp\")");
        this.userService.signUp(userDto); // TODO message d'erreur personnalisé
    }

    @PutMapping("/user")
    public void editUser(@RequestBody UserDto userDto) { // TODO vérifier l'appartenance du compte
        System.out.println("@PutMapping(\"/editUser\")");
        this.userService.editUser(userDto);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable String id) { // TODO vérifier l'appartenance du compte
        System.out.println("@DeleteMapping(\"/deleteUser\")");
        this.userService.deleteUser(id);
    }
}
