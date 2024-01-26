package sarahguarneri.BEU2W3.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
public class Event {
    @Id
    @GeneratedValue
    private UUID id;
    private String title;
    private String description;
    private String date;
    private String place;
    private int numbPeople;
    private String image;
    @ManyToMany(mappedBy = "events")
    private List<User> users = new ArrayList<>();
}

