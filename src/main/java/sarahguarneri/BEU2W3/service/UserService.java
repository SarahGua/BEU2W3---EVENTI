package sarahguarneri.BEU2W3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sarahguarneri.BEU2W3.entites.User;
import sarahguarneri.BEU2W3.repository.CreateUserDTO;
import sarahguarneri.BEU2W3.repository.UserDAO;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public List<User> getUsers(){
        return userDAO.findAll();
    }

    public User save(CreateUserDTO body){
        User newUser = new User();
        newUser.setEmail(body.getEmail());
        newUser.setName(body.getName());
        newUser.setSurname(body.getSurname());
        newUser.setPassword(body.getPassword());
        newUser.setRole(body.getRole());
        return userDAO.save(newUser);
    }
}
