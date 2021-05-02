package Concrete;

import Abstract.BaseCustomerManager;
import Entities.*;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
private CustomerCheckService customerCheckService;
public NeroCustomerManager(CustomerCheckService customerCheckService) {	
	this.customerCheckService = customerCheckService;
}

public  void Save(Customer customer) throws Exception
{
    if (customerCheckService.CheckIfRealPerson(customer))
    {
        super.Save(customer);
    	//base.Save(customer);
    }
    else
    {
        throw new Exception("Not a valid person");
    }
}
}
