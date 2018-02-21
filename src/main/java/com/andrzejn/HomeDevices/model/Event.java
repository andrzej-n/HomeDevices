package com.andrzejn.HomeDevices.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private LocalDateTime eventTime;
	@ManyToOne
	private Device device;

	public Event() {
		
	}

	public Event(Device device) {
		this.device = device;
		this.eventTime = LocalDateTime.now();
	}
}
