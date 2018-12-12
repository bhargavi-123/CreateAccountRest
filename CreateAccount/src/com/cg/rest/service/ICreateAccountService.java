package com.cg.rest.service;

import com.cg.rest.bean.CustomerBean;

public interface ICreateAccountService {
     
	public boolean createAccount(CustomerBean customer);

	public CustomerBean findCust(int id);

	
	
}
