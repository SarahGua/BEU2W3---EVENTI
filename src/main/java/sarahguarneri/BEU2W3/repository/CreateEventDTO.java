package sarahguarneri.BEU2W3.repository;

import lombok.Getter;
import sarahguarneri.BEU2W3.entites.User;


public record CreateEventDTO(
        String title,
        String description,
        String date,
        String place,
        int numberMaxOfPeople,
        String image,
        User userId
) {

//    @Override
//    public String title() {
//        return title;
//    }
//
//    @Override
//    public String description() {
//        return description;
//    }
//
//    @Override
//    public String date() {
//        return date;
//    }
//
//    @Override
//    public String place() {
//        return place;
//    }
//
//    @Override
//    public int numberMaxOfPeople() {
//        return numberMaxOfPeople;
//    }
//
//    @Override
//    public String image() {
//        return image;
//    }
//
//    @Override
//    public User userId() {
//        return userId;
//    }
}
