package com.weddingplanner.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.weddingplanner.daos.IVenueDao;
import com.weddingplanner.pojos.Venue;



@Service
@Transactional
public class VenueServiceImpl implements IVenueService {
	@Autowired
	private IVenueDao dao;

	

	@Override
	public List<Venue> getAllVenues() {
		// TODO Auto-generated method stub
		return dao.findAllVenues();
	}

	@Override
	public Venue getVenueDetails(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public Venue addNewVenueDetails(Venue v) {
		// TODO Auto-generated method stub
		return dao.save(v);
	}

	@Override
	public void deleteVenue(int venueId) {
		dao.deleteById(venueId);
		
	}

	@Override
	public Venue updateVenueDetails(Venue v) {
		// TODO Auto-generated method stub
		return dao.save(v);
	}
	

	
	
	

}
