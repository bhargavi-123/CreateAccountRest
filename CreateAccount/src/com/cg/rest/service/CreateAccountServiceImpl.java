package com.cg.rest.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.rest.bean.CustomerBean;
import com.cg.rest.dao.ICreateAccountDao;


@Service("createService")
@Transactional
public class CreateAccountServiceImpl implements ICreateAccountService{
    @Autowired
	ICreateAccountDao createDao;

	@Override
	public boolean createAccount(CustomerBean customer) {
		// TODO Auto-generated method stub
		return createDao.createAccount(customer);
	}

	@Override
	public CustomerBean findCust(int id) {
		// TODO Auto-generated method stub
		return createDao.findCust(id);
	}
	
	
}
