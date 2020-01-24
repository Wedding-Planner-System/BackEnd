package com.weddingplanner.daos;

import java.util.List;

import com.weddingplanner.pojos.Event;

public interface IEventDao {
	
	public String bookEvent(Event a);
	public List<Event> getAllEvents();
	public Event getEventById(int id);
	public Event updateEvent(Event e);

}
