package com.myrentalproject.service.placesService;

import java.util.List;

import com.myrentalproject.model.places.Location;;

public interface LocationBo {
	public int SaveOrUpdate(Location location );
	public boolean updateLocation( Location location);
	public boolean deleteLocation(Location location );
	public Location FindLocationById(int id);
	public List<Location> ListAllLocation();
}
