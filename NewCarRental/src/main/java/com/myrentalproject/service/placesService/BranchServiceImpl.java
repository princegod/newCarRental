package com.myrentalproject.service.placesService;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myrentalproject.dao.placesDao.BranchDao;
import com.myrentalproject.model.places.Branch;

@Service
@Transactional
public class BranchServiceImpl implements BranchService{

	@Autowired
	BranchDao branchdao;
	
	@Override
	public void SaveOrUpdate(Branch branch) {
		
		branchdao.saveorupdate(branch);
	}

	@Override
	public boolean updateBranch(Branch branch) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteBranch(int id) {
		
		branchdao.DeleteBranch(id);
	}

	@Override
	public Branch FindBranchById(int id) {
		// TODO Auto-generated method stub
		return branchdao.findBranchById(id);
	}

	@Override
	public List<Branch> ListAllBranch() {
		// TODO Auto-generated method stub
		return branchdao.listAllbranch();
	}
	

}
