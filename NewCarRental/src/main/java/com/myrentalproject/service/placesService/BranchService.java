package com.myrentalproject.service.placesService;
import com.myrentalproject.model.places.Branch;

import java.util.*;
public interface BranchService {
	
	public void SaveOrUpdate(Branch branch );
	public boolean updateBranch( Branch branch);
	public void deleteBranch(int id);
	public Branch FindBranchById(int id);
	public List<Branch> ListAllBranch();
	

}
