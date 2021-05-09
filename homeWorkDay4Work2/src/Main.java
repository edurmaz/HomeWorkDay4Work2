import java.time.LocalDate;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import adapter.MernisServiceAdapter;
import concretes.NeroCustomerManager;
import concretes.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.add(new Customer(1, "emre", "durmaz", LocalDate.of(1989, 04, 20), "23645108518"));

	}

}
