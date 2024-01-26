package sarahguarneri.BEU2W3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import sarahguarneri.BEU2W3.entites.Role;
import sarahguarneri.BEU2W3.entites.User;
import sarahguarneri.BEU2W3.repository.CreateUserDTO;
import sarahguarneri.BEU2W3.repository.UserDAO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private PasswordEncoder bcrypt;

    public List<User> getUsers(){
        return userDAO.findAll();
    }

    public User save(CreateUserDTO body){
        User newUser = new User();
        newUser.setEmail(body.email());
        newUser.setName(body.name());
        newUser.setSurname(body.surname());
        newUser.setPassword(bcrypt.encode(body.password()));
        newUser.setRole(Role.ORGANIZER);
        return userDAO.save(newUser);
    }

    public Optional<User> findById(UUID id){
        return userDAO.findById(id);
    }

    public User findDyEmail(String email){
        return userDAO.findByEmail(email);
    }
}
