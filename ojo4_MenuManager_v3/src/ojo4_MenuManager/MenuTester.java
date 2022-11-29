/**
	 * Class MenuTester
 	 * author : Owen O'Keeffe
	 * created: 11/01/2022
	 */
package ojo4_MenuManager;

import java.util.ArrayList;

public class MenuTester{
	public static void main(String[] args){
		MenuManager randomize = new MenuManager("/Users/owenokeeffe/Desktop/Projects/ojo4_cmpinf401/ojo4_MenuManager_v3/data/dishes.txt");
		System.out.println(randomize.minCaloriesMenu());
		System.out.println(randomize.maxCaloriesMenu());
		
		Menu myMenu = randomize.randomMenu();
		System.out.println(myMenu.description()+"\nTotal calories: "+
							myMenu.totalCalories());
		
		ArrayList<Menu> menus = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			menus.add(randomize.randomMenu());
		}
		FileManager.writeMenu("/Users/owenokeeffe/Desktop/Projects/ojo4_cmpinf401/ojo4_MenuManager_v3/data/test.txt", menus);
		}
}
