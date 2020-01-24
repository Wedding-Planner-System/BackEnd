package com.weddingplanner.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.weddingplanner.daos.IPackagesDao;
import com.weddingplanner.pojos.Package;
@Service
@Transactional
public class PackageServiceImpl implements IPackagesService {

	
	@Autowired
	private IPackagesDao dao;
	
	 public PackageServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public List<Package> getAllCateringPackages() {
		return dao.findAllCateringPackages();
	}

}
