package com.cg.aps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cg.aps.entities.VehicleEntity;
/**
* @author Rashi Goenka
*            
*/

@Service
public interface VehicleServiceInt  {

	public void add(VehicleEntity bean);
	
	public void update(VehicleEntity bean);
	
	public void delete(VehicleEntity bean);
	
	public List<VehicleEntity> findByName(String name);
	
	public Optional<VehicleEntity> findByPk(String id);
	
	public List<VehicleEntity> search();
	
	
}
