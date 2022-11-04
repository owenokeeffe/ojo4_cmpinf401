package ojo4_MenuManager;
import java.util.ArrayList;
import java.io.*;

public class FileManager {

	public static ArrayList<Entree> readEntrees(String filename){
		ArrayList<Entree> entreeList = new ArrayList<Entree>();
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);	
			String line = null;
			while((line = br.readLine()) != null) {
				String [] characteristics = line.split("@@");
				entreeList.add(new Entree(characteristics[0], characteristics[1], Integer.parseInt(characteristics[2])));
			}
			br.close();
			fr.close();
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return entreeList;
	}
	
	public static ArrayList<Side> readSides(String filename){
		ArrayList<Side> sideList = new ArrayList<Side>();
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);	
			String line = null;
			while((line = br.readLine()) != null) {
				String [] characteristics = line.split("@@");
				sideList.add(new Side(characteristics[0], characteristics[1], Integer.parseInt(characteristics[2])));
			}
			br.close();
			fr.close();
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return sideList;
	}
	
	
	public static ArrayList<Salad> readSalads(String filename){
		ArrayList<Salad> saladList = new ArrayList<Salad>();
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);	
			String line = null;
			while((line = br.readLine()) != null) {
				String [] characteristics = line.split("@@");
				saladList.add(new Salad(characteristics[0], characteristics[1], Integer.parseInt(characteristics[2])));
			}
			br.close();
			fr.close();
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return saladList;
	}
	
	public static ArrayList<Dessert> readDesserts(String filename){
		ArrayList<Dessert> dessertList = new ArrayList<Dessert>();
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);	
			String line = null;
			while((line = br.readLine()) != null) {
				String [] characteristics = line.split("@@");
				dessertList.add(new Dessert(characteristics[0], characteristics[1], Integer.parseInt(characteristics[2])));
			}
			br.close();
			fr.close();
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return dessertList;
	}
	
	
}
