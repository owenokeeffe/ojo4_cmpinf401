package ojo4_MenuManager;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.Writer;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.JList;

public class MenuManagerGUI extends JFrame {

	private JPanel contentPane;
	private MenuManager menuManager;
	private DefaultListModel listModel;
	private ArrayList<Menu> menus;
	private DetailsPanel dp;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1_1_1;
	private JLabel lblNewLabel_1_1_1_1;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JButton btnNewButton;
	private JPanel panel_1;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_1;
	private JPanel panel_2;
	private GridBagLayout gbl_panel_2;
	private JLabel lblNewLabel_3;
	private GridBagConstraints gbc_lblNewLabel_3;
	private JList list;
	private GridBagConstraints gbc_list;
	private JPanel panel_3;
	private JButton btnNewButton_6;
	private JButton btnNewButton_5;
	private JButton btnNewButton_4;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuManagerGUI frame = new MenuManagerGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuManagerGUI() {
		menuManager = new MenuManager("data/dishes.txt");
		menus = new ArrayList<>();
		listModel = new DefaultListModel();
		
		setTitle("Menu Manager");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(0, 0, 212, 137);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("Build your own Menu");
		lblNewLabel.setBounds(25, 6, 131, 16);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Entree");
		lblNewLabel_1.setBounds(6, 25, 39, 16);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_1_1 = new JLabel("Side");
		lblNewLabel_1_1.setBounds(6, 45, 39, 16);
		panel.add(lblNewLabel_1_1);
		
		lblNewLabel_1_1_1 = new JLabel("Salad");
		lblNewLabel_1_1_1.setBounds(6, 67, 39, 16);
		panel.add(lblNewLabel_1_1_1);
		
		lblNewLabel_1_1_1_1 = new JLabel("Dessert");
		lblNewLabel_1_1_1_1.setBounds(6, 86, 48, 16);
		panel.add(lblNewLabel_1_1_1_1);
		
		comboBox = new JComboBox();
		comboBox.setBounds(57, 23, 123, 20);
		panel.add(comboBox);
		
		ArrayList<Entree> fileEntrees = menuManager.getEntrees();
		for(Entree e : fileEntrees)
			comboBox.addItem(e);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(57, 41, 123, 20);
		panel.add(comboBox_1);
		
		ArrayList<Side> fileSides = menuManager.getSides();
		for(Side s : fileSides)
			comboBox_1.addItem(s);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(57, 63, 123, 20);
		panel.add(comboBox_2);
		
		ArrayList<Salad> fileSalads = menuManager.getSalads();
		for(Salad s : fileSalads)
			comboBox_2.addItem(s);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setBounds(57, 82, 123, 20);
		panel.add(comboBox_3);
		ArrayList<Dessert> fileDesserts = menuManager.getDesserts();
		for(Dessert d : fileDesserts)
			comboBox_3.addItem(d);
		
		btnNewButton = new JButton("Create menu with these dishes");
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnNewButton.setBounds(6, 102, 188, 29);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Entree entree = (Entree) comboBox.getSelectedItem();
				Salad salad = (Salad) comboBox_2.getSelectedItem();
				Side side = (Side) comboBox_1.getSelectedItem();
				Dessert dessert = (Dessert) comboBox_3.getSelectedItem();
				Menu newMenu = new Menu(JOptionPane.showInputDialog("What is the name of this menu?", null), entree, side, salad, dessert);
				menus.add(newMenu);
				listModel.addElement(newMenu);
			}
		}) ;
		
		panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(0, 149, 212, 123);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(4, 1, 0, 4));
		
		btnNewButton_2 = new JButton("Generate a Random Menu");
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu randMenu = menuManager.randomMenu();
				randMenu.setName(JOptionPane.showInputDialog("What is the name of this menu?", null));
				menus.add(randMenu);
				listModel.addElement(randMenu);
			}
		});
		
		lblNewLabel_2 = new JLabel("Or Generate a Menu");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		panel_1.add(lblNewLabel_2);
		panel_1.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Generate a Minimum Calories Menu");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu minMenu = menuManager.minCaloriesMenu();
				minMenu.setName(JOptionPane.showInputDialog("What is the name of this menu?", null));
				menus.add(minMenu);
				listModel.addElement(minMenu);
			}
		});
		btnNewButton_3.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		panel_1.add(btnNewButton_3);
		
		btnNewButton_1 = new JButton("Generate a Maximum Calories Menu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu maxMenu = menuManager.maxCaloriesMenu();
				maxMenu.setName(JOptionPane.showInputDialog("What is the name of this menu?", null));
				menus.add(maxMenu);
				listModel.addElement(maxMenu);
			}
		});
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		panel_1.add(btnNewButton_1);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_2.setBounds(224, 0, 220, 217);
		contentPane.add(panel_2);
		gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] {0, 1};
		gbl_panel_2.rowHeights = new int[] {0, 0, 2};
		gbl_panel_2.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		lblNewLabel_3 = new JLabel("Created Menus:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 0;
		panel_2.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		list = new JList(listModel);
		gbc_list = new GridBagConstraints();
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0;
		gbc_list.gridy = 1;
		panel_2.add(list, gbc_list);
		
		panel_3 = new JPanel();
		panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_3.setBounds(224, 229, 220, 37);
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 3, 2, 0));
		
		btnNewButton_6 = new JButton("Details");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(list.getSelectedValue()!= null) {
					if(dp != null)
						dp.dispose();
					Menu m = (Menu) list.getSelectedValue();
					dp = new DetailsPanel(m);
					dp.setVisible(true);
				}
			}});
		btnNewButton_6.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		panel_3.add(btnNewButton_6);
		
		btnNewButton_5 = new JButton("Delete All");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModel.removeAllElements();
			}
		});
		btnNewButton_5.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		panel_3.add(btnNewButton_5);
		
		btnNewButton_4 = new JButton("Save to File");
		btnNewButton_4.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileManager.writeMenu("data/menus.txt", menus);
			}
		});
		panel_3.add(btnNewButton_4);
	}
	class DetailsPanel extends JFrame {

		private JPanel contentPane;
		private JTextArea detailTextArea;
		private JTextArea detailTextArea_1;
		private JTextArea detailTextArea_2;
		private JTextArea detailTextArea_3;
		private JLabel detailLblNewLabel_2;
		private JLabel detailLblNewLabel_3;
		private JPanel detailsPanel_1;
		private JLabel detailLblNewLabel_4;
		private JTextArea detailTextArea_4;
		private JTextArea detailTextArea_5;
		private JLabel detailLblNewLabel_5;
		private Menu menu;

		public DetailsPanel(Menu menu) {
			this.menu = menu;
			
			setTitle("Menu: " + menu.getName());
			
			this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JPanel detailsPanel = new JPanel();
			detailsPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			detailsPanel.setBounds(6, 6, 438, 217);
			contentPane.add(detailsPanel);
			detailsPanel.setLayout(null);
			
			JLabel detailLblNewLabel = new JLabel("Entree");
			detailLblNewLabel.setBounds(6, 6, 114, 45);
			detailsPanel.add(detailLblNewLabel);
			
			detailTextArea = new JTextArea();
			detailTextArea.setWrapStyleWord(true);
			detailTextArea.setLineWrap(true);
			detailTextArea.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
			detailTextArea.setEditable(false);
			detailTextArea.setBounds(114, 0, 318, 51);
			detailsPanel.add(detailTextArea);
			detailTextArea.append(menu.getEntree().getName() + "\n" + menu.getEntree().getDesc() + "\n" + "Calories: " + menu.getEntree().getCals() + "     Price: $" + menu.getEntree().getPrice());
			detailTextArea.setColumns(10);
			
			JLabel detailLblNewLabel_1 = new JLabel("Side");
			detailLblNewLabel_1.setBounds(6, 57, 114, 45);
			detailsPanel.add(detailLblNewLabel_1);
			
			detailTextArea_1 = new JTextArea();
			detailTextArea_1.setWrapStyleWord(true);
			detailTextArea_1.setLineWrap(true);
			detailTextArea_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
			detailTextArea_1.setEditable(false);
			detailTextArea_1.setBounds(114, 54, 318, 51);
			detailsPanel.add(detailTextArea_1);
			detailTextArea_1.append(menu.getSide().getName() + "\n" + menu.getSide().getDesc() + "\n" + "Calories: " + menu.getSide().getCals() + "     Price: $" + menu.getSide().getPrice());
			detailTextArea_1.setColumns(10);
			
			detailTextArea_2 = new JTextArea();
			detailTextArea_2.setWrapStyleWord(true);
			detailTextArea_2.setLineWrap(true);
			detailTextArea_2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
			detailTextArea_2.setEditable(false);
			detailTextArea_2.setColumns(10);
			detailTextArea_2.setBounds(114, 108, 318, 51);
			detailTextArea_2.append(menu.getSalad().getName() + "\n" + menu.getSalad().getDesc() + "\n" + "Calories: " + menu.getSalad().getCals() + "     Price: $" + menu.getSalad().getPrice());
			detailsPanel.add(detailTextArea_2);
			
			detailTextArea_3 = new JTextArea();
			detailTextArea_3.setWrapStyleWord(true);
			detailTextArea_3.setLineWrap(true);
			detailTextArea_3.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
			detailTextArea_3.setEditable(false);
			detailTextArea_3.setColumns(10);
			detailTextArea_3.setBounds(114, 162, 318, 51);
			detailTextArea_3.append(menu.getDessert().getName() + "\n" + menu.getDessert().getDesc() + "\n" + "Calories: " + menu.getDessert().getCals() + "     Price: $" + menu.getDessert().getPrice());
			detailsPanel.add(detailTextArea_3);
			
			detailLblNewLabel_2 = new JLabel("Salad");
			detailLblNewLabel_2.setBounds(6, 111, 114, 45);
			detailsPanel.add(detailLblNewLabel_2);
			
			detailLblNewLabel_3 = new JLabel("Dessert");
			detailLblNewLabel_3.setBounds(6, 165, 114, 45);
			detailsPanel.add(detailLblNewLabel_3);
			
			detailsPanel_1 = new JPanel();
			detailsPanel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			detailsPanel_1.setBounds(6, 235, 438, 31);
			contentPane.add(detailsPanel_1);
			detailsPanel_1.setLayout(null);
			
			detailLblNewLabel_4 = new JLabel("Calories:");
			detailLblNewLabel_4.setBounds(6, 6, 61, 16);
			detailsPanel_1.add(detailLblNewLabel_4);
			
			detailTextArea_4 = new JTextArea();
			detailTextArea_4.setEditable(false);
			detailTextArea_4.setBounds(79, 1, 89, 26);
			detailsPanel_1.add(detailTextArea_4);
			detailTextArea_4.append(menu.totalCalories() + "");
			detailTextArea_4.setColumns(10);
			
			detailTextArea_5 = new JTextArea();
			detailTextArea_5.setEditable(false);
			detailTextArea_5.setBounds(343, 1, 89, 26);
			detailTextArea_5.append(menu.getPrice() + "");
			detailsPanel_1.add(detailTextArea_5);
			detailTextArea_5.setColumns(10);
			
			detailLblNewLabel_5 = new JLabel("Total Price: ");
			detailLblNewLabel_5.setBounds(242, 6, 89, 16);
			detailsPanel_1.add(detailLblNewLabel_5);
		}
	}

}
