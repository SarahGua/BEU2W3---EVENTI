package sarahguarneri.BEU2W3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sarahguarneri.BEU2W3.repository.UserLoginDTO;
import sarahguarneri.BEU2W3.repository.UserLoginResponseDTO;
import sarahguarneri.BEU2W3.service.AuthService;

@RestController
@RequestMapping
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public UserLoginResponseDTO login(@RequestBody UserLoginDTO body){
       String accessToken = authService.authenticateUser(body);
       return new UserLoginResponseDTO(accessToken);
    }
}
