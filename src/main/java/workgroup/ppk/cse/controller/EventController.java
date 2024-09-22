/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workgroup.ppk.cse.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import workgroup.ppk.cse.model.Event;
import workgroup.ppk.cse.service.EventService;

/**
 *
 * @author WE ARE ANONYMOUS
 */

@RestController // @RestController will return the data and @Contoller will return file name.
@CrossOrigin
//@RequestMapping("/api")
public class EventController {
    
    @Autowired
    private EventService service;
    
    @RequestMapping("/")
    public String greet(){
        return "Hello World";
    }
    
    @GetMapping("/events")
    public List<Event> getAllEvents(){
        return service.getAllEvents();
    }
    
    @GetMapping("/event/{id}")
    public ResponseEntity<Event> getEvent(@PathVariable String id){
        
        Event product = service.getEventById(id);
        
        if(product != null)
            return new ResponseEntity<>(product, HttpStatus.OK); 
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @PostMapping("/events")
    public void addEvents(@RequestBody Event event){
        service.addEvents(event);
    }
    
    @PutMapping("/events")
    public void updateEvent(@RequestBody Event event){
        service.updateEvent(event);
    }
}
