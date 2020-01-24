package com.weddingplanner.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.weddingplanner.pojos.Package;

public interface IPackagesDao extends JpaRepository<Package, Integer>{

	@Query("select p from Package p")
	List<Package> findAllCateringPackages();
}
