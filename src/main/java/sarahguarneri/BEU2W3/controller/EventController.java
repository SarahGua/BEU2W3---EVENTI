package sarahguarneri.BEU2W3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sarahguarneri.BEU2W3.entites.Event;
import sarahguarneri.BEU2W3.repository.CreateEventDTO;
import sarahguarneri.BEU2W3.service.EventService;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    private EventService eventService;

    //GET ALL
    @GetMapping
    public List<Event> getEvents(){
        return eventService.getEvents();
    }

    //POST
    @PostMapping
    public Event CreateEvent(@RequestBody CreateEventDTO body){
        return eventService.save(body);
    }

}
