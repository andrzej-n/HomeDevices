package com.andrzejn.HomeDevices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andrzejn.HomeDevices.model.Device;
import com.andrzejn.HomeDevices.model.Event;

@RestController
public class EventController {

	@Autowired
	DeviceRepository deviceRepository;
	@Autowired
	EventRepository eventRepository;
	
	@GetMapping("/events")
	public List<Event> getAllEvents() {
		return eventRepository.findAll();
	}
	
	@PostMapping("/devices/{id}/events")
	public Event createEventForDevice(@PathVariable("id") Long id) {
		Device tempDevice = deviceRepository.findOne(id);
		// ...
		return null;
		
	}
	
}
