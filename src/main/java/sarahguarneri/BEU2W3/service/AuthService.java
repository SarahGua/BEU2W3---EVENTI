package sarahguarneri.BEU2W3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sarahguarneri.BEU2W3.entites.User;
import sarahguarneri.BEU2W3.repository.UserLoginDTO;
import sarahguarneri.BEU2W3.security.JWTTools;

@Service
public class AuthService {

    @Autowired
    private UserService userService;

    @Autowired
    private JWTTools jwtTools;

    public String authenticateUser(UserLoginDTO body){
        //1 verifico che email sia corretta
        User user = userService.findDyEmail(body.email());
        //2 se è corretta --> verifico che pssw = db
        if(body.password().equals(user.getPassword())){
        //3 se passw ok --> genero token
            return jwtTools.createToken(user);
        } else {
        //4 se passw NON OK --> 401
        throw new RuntimeException("Credenziali non valide");
        }
    }
}
