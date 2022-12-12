package ojo4_MenuManager;
import java.util.ArrayList;
import java.io.*;

public class FileManager {

	
	/**
	 * Reads a file and creates and returns a list of MenuItems.
	 * @param String the name of the file
	 * @return ArrayList<Entree> is the list of MenuItems from the file.
	 */
	public static ArrayList<MenuItem> readItems(String fileName){
		ArrayList<MenuItem> itemList = new ArrayList<MenuItem>();
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine()) != null) {
				String [] characteristics = line.split("@@");
				if(characteristics[1].equalsIgnoreCase("Entree")) {
					itemList.add(new Entree(characteristics[0], characteristics[2], Integer.parseInt(characteristics[3]), Double.parseDouble(characteristics[4])));
				}
				else if(characteristics[1].equalsIgnoreCase("Side")) {
					itemList.add(new Side(characteristics[0], characteristics[2], Integer.parseInt(characteristics[3]), Double.parseDouble(characteristics[4])));
				}
				else if(characteristics[1].equalsIgnoreCase("Salad")) {
					itemList.add(new Salad(characteristics[0], characteristics[2], Integer.parseInt(characteristics[3]), Double.parseDouble(characteristics[4])));
				}
				else if(characteristics[1].equalsIgnoreCase("Dessert")) {
					itemList.add(new Dessert(characteristics[0], characteristics[2], Integer.parseInt(characteristics[3]), Double.parseDouble(characteristics[4])));

				}

			}
			br.close();
			fr.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return itemList;
	}

	/**
	 * Writes a menu to a file.
	 * @param String the name of the file to write to.
	 * @param ArrayList<Menu> is the list of Menus to write to the file.
	 */
	public static void writeMenu(String fileName, ArrayList<Menu> menus) {
		try {
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			for(Menu menu : menus) {
				bw.write("Menu name: " + menu.getName() + "-->");
				bw.write(menu.description());
				bw.newLine();
			}
			bw.close();
			fw.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}



}
