package com.weddingplanner.service;

import java.util.List;
import com.weddingplanner.pojos.Venue;

public interface IVenueService {
	List<Venue> getAllVenues();
	Venue getVenueDetails(int id);
	Venue addNewVenueDetails(Venue v);
	void deleteVenue(int venueId);
	Venue updateVenueDetails(Venue v);
}
