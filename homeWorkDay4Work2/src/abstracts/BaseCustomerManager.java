package abstracts;

import entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void add(Customer customer) {
		System.out.println("Kullanc� kaydedildi." + customer.getName());
		
		
		
	}
	
	
	

}
