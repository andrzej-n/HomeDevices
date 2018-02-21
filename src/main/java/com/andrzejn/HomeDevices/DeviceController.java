package com.andrzejn.HomeDevices;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.andrzejn.HomeDevices.model.Device;
import com.andrzejn.HomeDevices.model.Event;

@RestController
public class DeviceController {

	@Autowired
	DeviceRepository deviceRepository;
	// temp
	@Autowired
	EventRepository eventRepository;
	
	@GetMapping("/devices")
	public List<Device> getAllDevices() {
		return deviceRepository.findAll();
	}
	
	@GetMapping("/devices/{id}")
	public ResponseEntity<Device> getDevice(@PathVariable("id") Long id) {
		Device device = deviceRepository.findOne(id);
		if (device != null) {
			return ResponseEntity.ok().body(device);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PostMapping("/devices")
	public Device createDevice(@Valid @RequestBody Device device) {
		Device temp  = deviceRepository.save(device);
		Event ev = new Event(device);
		eventRepository.save(ev);
		return temp;
	}
	
@GetMapping("/devices/{id}/events")
public ResponseEntity<List<Event>> getDeviceEvents(@PathVariable("id") Long id) {
	Device tempDevice = deviceRepository.findOne(id);
	if (tempDevice != null) {
		return ResponseEntity.ok().body(tempDevice.getEvents());
	} else {
		return ResponseEntity.notFound().build();
	}	
	
}
	
}
