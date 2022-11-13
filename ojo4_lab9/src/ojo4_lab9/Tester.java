package ojo4_lab9;

public class Tester {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		System.out.println("Circle color: " + circle1.getColor() + "\nCircle Area: " + circle1.getArea());
		Cylinder cylinder1 = new Cylinder();
		System.out.println("Cylinder color: " + cylinder1.getColor() + "\nCylinder Area: " + cylinder1.getArea());
		Staff staff1 = new Staff("Mr. King", "14 Ross Lane", 75000.0 );
		System.out.println("Staff: " + staff1);
		Student student1 = new Student("Owen", "10 Diamond Lane", "CS", 2026, 30000.0);
		System.out.println("Student: " + student1);
	}

}
