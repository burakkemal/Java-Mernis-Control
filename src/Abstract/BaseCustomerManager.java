package Abstract;

import Entities.*;

public abstract class BaseCustomerManager implements CustomerService {
	public void Save (Customer customer) throws Exception {
		System.out.println("saved to db"+customer.getFirstName());
	}
}
