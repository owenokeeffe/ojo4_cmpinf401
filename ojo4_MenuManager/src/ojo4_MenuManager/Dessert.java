/**
 * Class Dessert
 * author: Owen O'Keeffe
 * created 10/12/2022
 */

package ojo4_MenuManager;

public class Dessert {

	String name;
	String desc;
	int cals;

	public Dessert(String name, String desc, int cals) {
		this.name = name;
		this.desc = desc;
		this.cals = cals;
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




}
