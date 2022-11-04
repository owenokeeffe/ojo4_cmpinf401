package ojo4_MenuManager;
import java.util.ArrayList;

	public class MenuRandomize{
		ArrayList<Entree> entrees;
		ArrayList<Side> sides;
		ArrayList<Salad> salads;
		ArrayList<Dessert> desserts;

		public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile) {
			entrees = FileManager.readEntrees(entreeFile);
			sides = FileManager.readSides(sideFile);
			salads = FileManager.readSalads(saladFile);
			desserts = FileManager.readDesserts(dessertFile);
		}
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
	}
	
