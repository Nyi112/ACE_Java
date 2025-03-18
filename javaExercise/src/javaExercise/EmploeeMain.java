package javaExercise;

public class EmploeeMain {
	public static void main(String []args) {
		Employee emp = new Employee();
		emp.setEmpId(4);
		emp.setName("Nyi Nyi");
		System.out.println(emp.getEmpId());
		System.out.println(emp);
	}
}
