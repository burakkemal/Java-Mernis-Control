import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager baseCustomerManager = new NeroCustomerManager(new CustomerCheckManager());
			
		
        Customer customer=new Customer();
        customer.setId(1);
        customer.setFirstName("Burak kemal");
        customer.setLastName("Koyuncu");
        customer.setDateOfBirth(LocalDate.of(1997, 05, 27));
        customer.setNationaltyId("12345678988");
        baseCustomerManager.Save(customer);
        
        

	}

}
