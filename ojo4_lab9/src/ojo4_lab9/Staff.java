package ojo4_lab9;

public class Staff extends Person {

	private String school;
	private double pay;
	
	public Staff(String name, String address, double pay) {
		super(name, address);
		this.pay = pay;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}
	
	public String toString() {
		return this.getName() + ", " + this.getAddress() + ", " + this.getPay();
	}
	
}
