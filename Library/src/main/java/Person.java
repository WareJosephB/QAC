import java.util.ArrayList;
import java.util.List;

public class Person {

	private String name;
	private int age;
	private String contactDetails;

	private List<String> checkedOut = new ArrayList<String>();

	public Person(String name, int age, String contactDetails) {
		this.setName(name);
		this.setAge(age);
		this.setContactDetails(contactDetails);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void checkOut(String name) {
		this.checkedOut.add(name);
	}

	public void checkIn(String name) {
		this.checkedOut.remove(name);

	}

}
