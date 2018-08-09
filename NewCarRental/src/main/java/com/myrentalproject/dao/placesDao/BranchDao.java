package com.myrentalproject.dao.placesDao;

import java.util.List;

import com.myrentalproject.model.places.Branch;


public interface BranchDao {

	 public void saveorupdate(final Branch branch);
	 	public boolean update(final Branch branch);
	 	public Branch findBranchById(int id);
	 	public void DeleteBranch(final int id);
	 	public List<Branch> listAllbranch();
}
