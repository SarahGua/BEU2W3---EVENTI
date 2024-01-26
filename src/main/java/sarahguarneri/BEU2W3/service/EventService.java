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
        newEvent.setTitle(body.getTitle());
        newEvent.setDescription(body.getDescription());
        newEvent.setDate(body.getDate());
        newEvent.setPlace(body.getPlace());
        newEvent.setImage(body.getImage());
//        newEvent.setUsers(body.getUserId());
        return eventDAO.save(newEvent);
    }
}
