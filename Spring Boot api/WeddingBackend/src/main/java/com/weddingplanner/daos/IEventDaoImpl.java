package com.weddingplanner.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.weddingplanner.pojos.Event;

@Repository
public class IEventDaoImpl implements IEventDao{
	
	@PersistenceContext
	private EntityManager mgr;

	@Override
	public String bookEvent(Event a) {
		mgr.unwrap(Session.class).persist(a);
		return "Event added succesfully" ;
	}

	
	@Override
	 public List<Event> getAllEvents() {
		String jpql = "select e from Event e";
		return mgr.unwrap(Session.class).
				createQuery(jpql, Event.class).getResultList();
	}


	@Override
	public Event getEventById(int id) {
		return mgr.unwrap(Session.class).get(Event.class, id);
	
	}
	 
	@Override
	public Event updateEvent(Event e)
	{
		mgr.unwrap(Session.class).update(e);
		return e;
	}
}
