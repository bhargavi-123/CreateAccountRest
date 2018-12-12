package com.cg.rest.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.rest.bean.CustomerBean;
/*import org.springframework.web.bind.annotation.CrossOrigin;*/
import com.cg.rest.service.ICreateAccountService;



//@CrossOrigin(origins = "http://localhost:8081")
@Controller
public class CreateController {
	
	@Autowired
	ICreateAccountService createService;
	

	/*private Map<String, CustomerBean> customer = new HashMap<String, CustomerBean>();*/

	//@RequestMapping(value = "/customer/create",headers="Accept=application/json",method = RequestMethod.POST)
	/*@RequestMapping(value ="/customer/create/",consumes = MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json",method = RequestMethod.POST)
	public String createAccount() {
		
		return "createaccount.jsp";
	}*/
	@RequestMapping(value="all",method=RequestMethod.GET)
	public String addCustomer(@ModelAttribute("my")CustomerBean customer)
	{
		
		return "addcustomer";
	}
	
	
	/*@RequestMapping(value="success",method=RequestMethod.GET)
	public String addCustomer1()
	{
		
		return "success";
	}
	*/
	//List<CustomerBean> list=new ArrayList<CustomerBean>();
	@RequestMapping(value="success", method=RequestMethod.POST)
	public ModelAndView insertEmployee(@Valid @ModelAttribute("my") CustomerBean customer,BindingResult result){
		//System.out.println("Name is "+emp.getEmpName());
		boolean res=false;
		if(result.hasErrors()){
			
		 return new ModelAndView("addcustomer");
		}else{
	  	res= createService.createAccount(customer);
	  	//list.add(customer);
	  	
	  	
		}
		return new ModelAndView("success","edata",res);
		
	}
	
	
	@RequestMapping(value="/customer/display/{id}",method = RequestMethod.GET,headers="Accept=application/json")
	public String showCustomer(@PathVariable("id") int id)
	{
		  CustomerBean customer=createService.findCust(id);
	      return customer.toString();
		
	}
	
	
	
}

