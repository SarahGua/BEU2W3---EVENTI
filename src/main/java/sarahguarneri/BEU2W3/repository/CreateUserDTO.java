package sarahguarneri.BEU2W3.repository;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import sarahguarneri.BEU2W3.entites.Role;

@Getter
public record CreateUserDTO(
        String name,
        String surname,
        String email,
        String password,
        Role role

) {
}
