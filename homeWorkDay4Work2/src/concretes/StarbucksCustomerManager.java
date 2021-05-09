package concretes;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import abstracts.CustomerService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer)  {

		if (customerCheckService.CheckIfRealPerson(customer)) {
			super.add(customer);
			System.out.println("Personel doðrulandý.");

		} else {
			System.out.println("Personel dorðulanamadý.");
		}

	}

}
