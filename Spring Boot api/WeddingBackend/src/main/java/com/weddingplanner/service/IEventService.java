package com.weddingplanner.service;

import java.util.List;

import com.weddingplanner.pojos.Event;

public interface IEventService {
	public String addEvent(Event e);
	public List<Event> getAllEvents();
	public Event getEventById(int id);
	public Event updateEvent(Event e);

}
