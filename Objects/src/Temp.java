
public class Temp {

	public static void main(String[] args) {
		/*
		String temp = "Hello";
		System.out.println(temp.length());
		System.out.println(temp.length());
		System.out.println(temp.indexOf('H'));
		*/
		
		Car c1 = new Car();
		c1.color = "blue";
		c1.make = "Ford";
		c1.model = "Focus";
		c1.bodyType = "sedan";
		c1.year = 2022;
		
		Car c2 = new Car();
		c2.color = "green";
		c2.make = "Toyota";
		c2.model = "Land Cruzer";
		c2.bodyType = "SUV";
		c2.year = 2019;
		
		System.out.println(c1.color);
		System.out.println(c2.color);
		c2.color = "Red";
		System.out.println(c2.color);

		
		c1.start();
	}

}
