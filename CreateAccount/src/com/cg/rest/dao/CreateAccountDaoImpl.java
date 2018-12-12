package com.cg.rest.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.rest.bean.CustomerBean;

@Repository("createDao")
public class CreateAccountDaoImpl implements ICreateAccountDao {
   
	
	@PersistenceContext
    EntityManager em;
	
   
   @Override
	public boolean createAccount(CustomerBean customer) {

		
	   // TODO Auto-generated method stub
	   try
	   {
		   em.persist(customer);
		   em.flush();
			return true;
	   }
	   catch(Exception e)
	   {
		   return false;
	   }
	   
	}


@Override
public CustomerBean findCust(int id) {
	// TODO Auto-generated method stub
	CustomerBean c=em.find(CustomerBean.class,id);
	
	return c;
}

}
   

