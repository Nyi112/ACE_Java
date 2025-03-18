package javaExercise;

public class Emp {
	int id;
	String name;
	Adress address;
	
	public Emp(int id, String name, Adress address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.city + " " + address.state + " " + address.country);
	}
	
	public static void main(String[] args) {
		Adress address1 = new Adress("gzb", "UP", "india");
		Adress address2 = new Adress("gno", "UP", "india");
		Emp e = new Emp(111, "Thomas", address1);
		Emp e2 = new Emp(112, "Nyi Nyi", address2);
		e.display();
		e2.display();
	}
}
