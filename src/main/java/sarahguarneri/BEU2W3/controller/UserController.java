package sarahguarneri.BEU2W3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sarahguarneri.BEU2W3.entites.User;
import sarahguarneri.BEU2W3.repository.CreateUserDTO;
import sarahguarneri.BEU2W3.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //GET ALL
    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }

    //POST
    @PostMapping
    public User createUser(@RequestBody CreateUserDTO body){
        return userService.save(body);
    }
}
