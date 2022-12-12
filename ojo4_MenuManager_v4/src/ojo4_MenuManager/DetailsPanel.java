package ojo4_MenuManager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.border.EtchedBorder;
import java.awt.Font;

public class DetailsPanel extends JFrame {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuManager mm = new MenuManager("data/dishes.txt");
					Menu m = mm.randomMenu();
					DetailsPanel frame = new DetailsPanel(m);
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
	public DetailsPanel(Menu menu) {
		setTitle("gahdammit");
		this.menu = menu;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		detailTextArea_4.setBounds(79, 1, 89, 26);
		detailsPanel_1.add(detailTextArea_4);
		detailTextArea_4.setColumns(10);
		
		detailTextArea_5 = new JTextArea();
		detailTextArea_5.setBounds(343, 1, 89, 26);
		detailsPanel_1.add(detailTextArea_5);
		detailTextArea_5.setColumns(10);
		
		detailLblNewLabel_5 = new JLabel("Total Price: ");
		detailLblNewLabel_5.setBounds(242, 6, 89, 16);
		detailsPanel_1.add(detailLblNewLabel_5);
	}
}
