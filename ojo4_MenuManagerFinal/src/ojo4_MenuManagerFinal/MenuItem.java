/**
	 * Class MenuItem
 	 * author : Owen O'Keeffe
	 * created: 11/20/2022
	 */
package ojo4_MenuManager;

public class MenuItem {

	private String name;
	private String desc;
	private int cals;
	private double price;
	
	
	/**
	 * Constructor assigns name, description, calories, and price
	 */
	public MenuItem(String name, String desc, int cals, double price) {
		this.name = name;
		this.desc = desc;
		this.cals = cals;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getCals() {
		return cals;
	}

	public void setCals(int cals) {
		this.cals = cals;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.getName() + ", Description: " + this.getDesc() + ", Calories: " + this.getCals() + ", Price: " + this.getPrice();
	}
	
	
}
