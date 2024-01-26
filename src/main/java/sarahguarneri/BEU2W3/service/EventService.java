package sarahguarneri.BEU2W3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sarahguarneri.BEU2W3.entites.Event;
import sarahguarneri.BEU2W3.repository.CreateEventDTO;
import sarahguarneri.BEU2W3.repository.EventDAO;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    private EventDAO eventDAO;

    public List<Event> getEvents(){
        return eventDAO.findAll();
    }

    public Event
    save(CreateEventDTO body){
        Event newEvent = new Event();
        newEvent.setTitle(body.title());
        newEvent.setDescription(body.description());
        newEvent.setDate(body.date());
        newEvent.setPlace(body.place());
        newEvent.setImage(body.image());
//        newEvent.setUsers(body.getUserId());
        return eventDAO.save(newEvent);
    }
}
