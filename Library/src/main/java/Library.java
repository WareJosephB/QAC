import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Item> repository = new ArrayList<Item>();
	private List<Person> customers;

	public List<Item> getRepository() {
		return repository;
	}

	public Library() {
	}

	public Library(List<Item> repository, List<Person> customers) {
		this.setCustomers(customers);
		this.repository = repository;
	}

	public Library(List<Item> repository) {
		this.repository = repository;
	}

	public List<Person> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Person> customers) {
		this.customers = customers;
	}

}
