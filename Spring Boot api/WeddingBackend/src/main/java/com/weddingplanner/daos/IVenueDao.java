package com.weddingplanner.daos;

import com.weddingplanner.pojos.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IVenueDao extends JpaRepository<Venue, Integer> {

	@Query("select v from Venue v")
	List<Venue> findAllVenues();
	
	
}
