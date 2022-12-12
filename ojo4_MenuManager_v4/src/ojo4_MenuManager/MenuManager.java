/**
	 * Class MenuManager
 	 * author : Owen O'Keeffe
	 * created: 11/01/2022
	 */
package ojo4_MenuManager;

import java.util.ArrayList;

public class MenuManager {
	private ArrayList<Entree> entrees;
	private ArrayList<Side> sides;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;
	
	
	
	public MenuManager(String dishesFile) {
		ArrayList<MenuItem> dishes = FileManager.readItems(dishesFile);
		entrees = new ArrayList<Entree>();
		sides = new ArrayList<Side>();
		salads = new ArrayList<Salad>();
		desserts = new ArrayList<Dessert>();
		for(MenuItem item : dishes) {
			if(item instanceof Entree)
				entrees.add((Entree) item);
			else if(item instanceof Side)
				sides.add((Side) item);
			else if(item instanceof Salad)
				salads.add((Salad) item);
			else if(item instanceof Dessert)
				desserts.add((Dessert) item);
		}
	}
	
	/**
	 * Given a four lists of Entrees, Sides, Salads, and Desserts, 
	 * create a menu by randomly picking an element from each of the lists.
	 */
	public Menu randomMenu() {
		Menu randMenu = new Menu("Random Menu");
		if(entrees.size() > 0)
			randMenu.setEntree(entrees.get((int) (Math.random() * entrees.size())));
		if(sides.size() > 0)
			randMenu.setSide(sides.get((int) (Math.random() * sides.size())));
		if(salads.size() > 0)
			randMenu.setSalad(salads.get((int) (Math.random() * salads.size())));
		if(desserts.size() > 0)
			randMenu.setDessert(desserts.get((int) (Math.random() * desserts.size())));
		
		return randMenu;
	}
	/**
	 * Finds the menu which has the lowest amount of calories
	 * @return Menu object represent the menu with the lowest number of calories
	 */
	public Menu minCaloriesMenu() {
		Menu lowestCals = new Menu("Lowest Calories");
		Entree lowestEntree = null;
		Side lowestSide = null;
		Salad lowestSalad = null;
		Dessert lowestDessert = null;
		
		if(entrees.size() > 0) {
			int lowest = Integer.MAX_VALUE;
			for(Entree e : entrees)
				if(e.getCals() < lowest) {
					lowest = e.getCals();
					lowestEntree = e;
				}
		}
		
		if(sides.size() > 0) {
			int lowest = Integer.MAX_VALUE;
			for(Side s : sides)
				if(s.getCals() < lowest) {
					lowest = s.getCals();
					lowestSide = s;
				}
		}
		
		if(salads.size() > 0) {
			int lowest = Integer.MAX_VALUE;
			for(Salad s : salads)
				if(s.getCals() < lowest) {
					lowest = s.getCals();
					lowestSalad = s;
				}
		}
		
		if(desserts.size() > 0) {
			int lowest = Integer.MAX_VALUE;
			for(Dessert d : desserts)
				if(d.getCals() < lowest) {
					lowest = d.getCals();
					lowestDessert = d;
				}
		}
		lowestCals.setEntree(lowestEntree);
		lowestCals.setSide(lowestSide);
		lowestCals.setSalad(lowestSalad);
		lowestCals.setDessert(lowestDessert);

		return lowestCals;
	}
	
	/**
	 * Finds the menu which has the highest amount of calories
	 * @return Menu object represent the menu with the highest number of calories
	 */
	public Menu maxCaloriesMenu() {
		Menu highestCals = new Menu("Highest Calories");
		Entree highestEntree = null;
		Side highestSide = null;
		Salad highestSalad = null;
		Dessert highestDessert = null;
		
		if(entrees.size() > 0) {
			int highest = Integer.MIN_VALUE;
			for(Entree e : entrees)
				if(e.getCals() > highest) {
					highest = e.getCals();
					highestEntree = e;
				}
		}
		
		if(sides.size() > 0) {
			int highest = Integer.MIN_VALUE;
			for(Side s : sides)
				if(s.getCals() > highest) {
					highest = s.getCals();
					highestSide = s;
				}
		}
		
		if(salads.size() > 0) {
			int highest = Integer.MIN_VALUE;
			for(Salad s : salads)
				if(s.getCals() > highest) {
					highest = s.getCals();
					highestSalad = s;
				}
		}
		
		if(desserts.size() > 0) {
			int highest = Integer.MIN_VALUE;
			for(Dessert d : desserts)
				if(d.getCals() > highest) {
					highest = d.getCals();
					highestDessert = d;
				}
		}
		highestCals.setEntree(highestEntree);
		highestCals.setSide(highestSide);
		highestCals.setSalad(highestSalad);
		highestCals.setDessert(highestDessert);

		return highestCals;
	}
	
	
	public ArrayList<Entree> getEntrees() {
		return entrees;
	}
	public void setEntrees(ArrayList<Entree> entrees) {
		this.entrees = entrees;
	}
	public ArrayList<Side> getSides() {
		return sides;
	}
	public void setSides(ArrayList<Side> sides) {
		this.sides = sides;
	}
	public ArrayList<Salad> getSalads() {
		return salads;
	}
	public void setSalads(ArrayList<Salad> salads) {
		this.salads = salads;
	}
	public ArrayList<Dessert> getDesserts() {
		return desserts;
	}
	public void setDesserts(ArrayList<Dessert> desserts) {
		this.desserts = desserts;
	}
	
}
