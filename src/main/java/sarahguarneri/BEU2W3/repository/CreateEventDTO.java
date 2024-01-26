package sarahguarneri.BEU2W3.repository;

import lombok.Getter;
import sarahguarneri.BEU2W3.entites.User;

@Getter
public record CreateEventDTO(
        String title,
        String description,
        String date,
        String place,
        int numberMaxOfPeople,
        String image,
        User userId
) {
}
