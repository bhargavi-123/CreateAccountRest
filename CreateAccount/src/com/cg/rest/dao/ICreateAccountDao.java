package com.cg.rest.dao;

import com.cg.rest.bean.CustomerBean;

public interface ICreateAccountDao {

	public boolean createAccount(CustomerBean customer);

	public CustomerBean findCust(int id);
}
