package sarahguarneri.BEU2W3.repository;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import sarahguarneri.BEU2W3.entites.Role;


public record CreateUserDTO(
        String name,
        String surname,
        String email,
        String password,
        Role role

) {
//    @Override
//    public String name() {
//        return name;
//    }
//
//    @Override
//    public String surname() {
//        return surname;
//    }
//
//    @Override
//    public String email() {
//        return email;
//    }
//
//    @Override
//    public String password() {
//        return password;
//    }
//
//    @Override
//    public Role role() {
//        return role;
//    }


}
