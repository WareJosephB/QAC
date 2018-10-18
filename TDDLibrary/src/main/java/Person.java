public class Person {

	private int age;
	private String name;
	private static int N = 1;
	private int idNum;

	public Person(String name, int age) {
		this.setName(name);
		this.setAge(age);
		this.idNum = N;
		N += 1;
	}

	public int getIdNum() {
		return idNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void Birthday() {
		this.age += 1;
	}

}