/**
 * Class MenuTest
 * author: Owen O'Keeffe
 * created 10/12/2022
 */

package ojo4_MenuManager;

public class MenuTest {

	public static void main(String[] args) {

		Menu menu1 = new Menu("Menu1");
		Menu menu2 = new Menu("Menu2");

		Entree entree1 = new Entree("Filet Mignon", "Our signature Filet is 11 ounces of tender, aged steak cooked to perfection.", 500);
		Entree entree2 = new Entree("Maine Lobster Roll", "Maine lobster, served chilled, touch of mayo, New England style roll.", 450);

		Side side1 = new Side("French Fries", "Our fries here are thick-cut, crispy, and golden-brown", 320);

		Salad salad1 = new Salad("Caesar Salad", "Fresh romaine hearts, romano cheese, creamy caesar dressing, shaved parmesan, fresh ground black pepper", 500);
		Salad salad2 = new Salad("Lettuce Wedge", "Crisp iceberg, field greens, bacon, blue cheese, choice of dressing", 220);

		Dessert dessert1 = new Dessert("Warm Apple Crisp", "Our Delicious Crispy Nutty Topping and Vanilla Ice Cream", 1000);


		menu1.setEntree(entree1);
		menu1.setSalad(salad1);

		menu2.setEntree(entree2);
		menu2.setSide(side1);
		menu2.setSalad(salad2);
		menu2.setDessert(dessert1);

		System.out.println("Name: " + menu1.getName());
		System.out.println("Description: ");
		System.out.println(menu1.description());
		System.out.println("Total Calories: " + menu1.totalCalories() + "\n" + "\n");

		System.out.println("Name: " + menu2.getName());
		System.out.println("Description: ");
		System.out.println(menu2.description());
		System.out.println("Total Calories: " + menu2.totalCalories() + "\n" + "\n");





	}
}
