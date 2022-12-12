/**
 * Class Menu
 * author: Owen O'Keeffe
 * created 10/12/2022
 */




package ojo4_MenuManager;

public class Menu {

	String name;
	Entree entree;
	Salad salad;
	Side side;
	Dessert dessert;


	public Menu(String name) {
		this.name = name;
	}

	public Menu(String name, Entree entree, Side side) {
		this.name = name;
		this.entree = entree;
		this.side = side;
	}

	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.salad = salad;
		this.dessert = dessert;
	}


	public int totalCalories(){
		int caloriesSum = 0;
		if(entree != null)
			caloriesSum += entree.getCals(); 
		if(salad != null)
			caloriesSum += salad.getCals(); 
		if(side != null)
			caloriesSum += side.getCals(); 
		if(dessert != null)
			caloriesSum += dessert.getCals(); 
		return caloriesSum;
	}

	public String description() {
		String desc = "";
		if (entree != null){
			desc += ("Entree: " + entree.getName() + " - " + entree.getDesc() );
		}
		if (salad != null){
			desc += (" Salad: " + salad.getName() + " - " + salad.getDesc() );
		}
		if (side != null){
			desc += (" Side: " + side.getName() + " - " + side.getDesc() );
		}
		if (dessert != null){
			desc += (" Dessert: " + dessert.getName() + " - " + dessert.getDesc() );
		}

		return desc;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Entree getEntree() {
		return entree;
	}
	public void setEntree(Entree entree) {
		this.entree = entree;
	}
	public Salad getSalad() {
		return salad;
	}
	public void setSalad(Salad salad) {
		this.salad = salad;
	}
	public Side getSide() {
		return side;
	}
	public void setSide(Side side) {
		this.side = side;
	}
	public Dessert getDessert() {
		return dessert;
	}
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}

	@Override
	public String toString() {
		return this.name;
	}
}

