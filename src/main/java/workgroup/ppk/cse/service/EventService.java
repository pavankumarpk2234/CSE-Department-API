/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workgroup.ppk.cse.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import workgroup.ppk.cse.model.Event;
import workgroup.ppk.cse.repo.EventRepo;

/**
 *
 * @author WE ARE ANONYMOUS
 */

@Service
public class EventService {
    
    @Autowired
    private EventRepo repo;

    public List<Event> getAllEvents() {
        return repo.findAll();
    }

    public Event addEvents(Event event) {
      return repo.save(event);
    }

    public Event getEventById(String id) {
        return repo.findById(id).orElse(null);
    }

    public void updateEvent(Event event) {
        repo.save(event);
    }
    
}
