package com.andrzejn.HomeDevices;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andrzejn.HomeDevices.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
