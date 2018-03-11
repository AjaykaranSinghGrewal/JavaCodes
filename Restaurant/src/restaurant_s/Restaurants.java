package restaurant_s;

import java.awt.EventQueue;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.border.TitledBorder;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JMenuItem;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.DataOutput;

public class Restaurants {

	private JFrame frame;
	private JTextField textFieldChickenBurger;
	private JTextField textFieldBaconBurger;
	private JTextField textFieldCheeseBurger;
	private JTextField textField_3;
	private JTextField textFieldDrink;
	private JTextField textFieldConvert;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurants window = new Restaurants();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Restaurants() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1000, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel.setBounds(44, 44, 321, 194);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Chicken Burger");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 126, 31);
		panel.add(lblNewLabel);
		
		JLabel lblBaconBurger = new JLabel("Bacon Burger");
		lblBaconBurger.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBaconBurger.setBounds(10, 42, 126, 31);
		panel.add(lblBaconBurger);
		
		JLabel lblCheeseBurger = new JLabel("Cheese Burger");
		lblCheeseBurger.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCheeseBurger.setBounds(10, 73, 126, 31);
		panel.add(lblCheeseBurger);
		
		textFieldChickenBurger = new JTextField();
		textFieldChickenBurger.setBounds(194, 18, 86, 20);
		panel.add(textFieldChickenBurger);
		textFieldChickenBurger.setColumns(10);
		
		textFieldBaconBurger = new JTextField();
		textFieldBaconBurger.setColumns(10);
		textFieldBaconBurger.setBounds(194, 49, 86, 20);
		panel.add(textFieldBaconBurger);
		
		textFieldCheeseBurger = new JTextField();
		textFieldCheeseBurger.setColumns(10);
		textFieldCheeseBurger.setBounds(194, 81, 86, 20);
		panel.add(textFieldCheeseBurger);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQty.setBounds(194, 101, 70, 31);
		panel.add(lblQty);
		
		textFieldDrink = new JTextField();
		textFieldDrink.setColumns(10);
		textFieldDrink.setBounds(194, 128, 86, 20);
		panel.add(textFieldDrink);
		
		JCheckBox chckbxTax = new JCheckBox("Tax");
		chckbxTax.setBounds(194, 155, 97, 23);
		panel.add(chckbxTax);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDrink.setBounds(10, 101, 70, 31);
		panel.add(lblDrink);
		
		JCheckBox chckbxHomeDelivery = new JCheckBox("Home Delivery");
		chckbxHomeDelivery.setBounds(10, 155, 97, 23);
		panel.add(chckbxHomeDelivery);
		
			JComboBox comboBoxDrink = new JComboBox();
		comboBoxDrink.setModel(new DefaultComboBoxModel(new String[] {"Select a Drink", "Juice", "Tea", "Cola", "Coffee"}));
		comboBoxDrink.setBounds(10, 128, 109, 20);
		panel.add(comboBoxDrink);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_1.setBounds(375, 44, 290, 194);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBoxCurrency = new JComboBox();
		comboBoxCurrency.setModel(new DefaultComboBoxModel(new String[] {"Choose One", "Canada"}));
		comboBoxCurrency.setBounds(94, 22, 109, 20);
		panel_1.add(comboBoxCurrency);
		
		textFieldConvert = new JTextField();
		textFieldConvert.setColumns(10);
		textFieldConvert.setBounds(94, 79, 109, 35);
		panel_1.add(textFieldConvert);
		
		JLabel label_convert = new JLabel("");
		label_convert.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_convert.setBounds(104, 125, 87, 14);
		panel_1.add(label_convert);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double cad = 2.03;
				double converttext = Double.parseDouble(textFieldConvert.getText());
				
				if(comboBoxCurrency.getSelectedItem().equals("Canada")) {
					String convertcad = String.format("%.2f", cad * converttext);
					label_convert.setText(convertcad);
				}
				
			}
		});
		btnConvert.setBounds(10, 160, 89, 23);
		panel_1.add(btnConvert);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textFieldConvert.setText(null);
				label_convert.setText(null);
			}
		});
		btnClose.setBounds(191, 160, 89, 23);
		panel_1.add(btnClose);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_2.setBounds(44, 249, 321, 166);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCostOfDelivery = new JLabel("Cost of Delivery");
		lblCostOfDelivery.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCostOfDelivery.setBounds(20, 106, 126, 31);
		panel_2.add(lblCostOfDelivery);
		
		JLabel lblCostOfMeal = new JLabel("Cost of Meal");
		lblCostOfMeal.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCostOfMeal.setBounds(20, 64, 126, 31);
		panel_2.add(lblCostOfMeal);
		
		JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
		lblCostOfDrinks.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCostOfDrinks.setBounds(20, 16, 126, 31);
		panel_2.add(lblCostOfDrinks);
		
		JLabel labelCostOfDrinks = new JLabel("");
		labelCostOfDrinks.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		labelCostOfDrinks.setBounds(196, 26, 87, 14);
		panel_2.add(labelCostOfDrinks);
		
		JLabel labelCostOfMeal = new JLabel("");
		labelCostOfMeal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		labelCostOfMeal.setBounds(196, 74, 87, 14);
		panel_2.add(labelCostOfMeal);
		
		JLabel labelCostOfDelivery = new JLabel("");
		labelCostOfDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		labelCostOfDelivery.setBounds(196, 116, 87, 14);
		panel_2.add(labelCostOfDelivery);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_4.setBounds(689, 44, 285, 383);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 24, 265, 348);
		panel_4.add(tabbedPane);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_6, null);
		panel_6.setLayout(null);
		
		JLabel labelreceipt = new JLabel("");
		labelreceipt.setBounds(10, 11, 240, 298);
		panel_6.add(labelreceipt);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_7, null);
		panel_7.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_3.setColumns(10);
		textField_3.setBounds(0, 0, 258, 28);
		panel_7.add(textField_3);
		
		JButton button = new JButton("back");
		button.setBounds(0, 39, 57, 40);
		panel_7.add(button);
		
		JButton button_1 = new JButton("7");
		button_1.setBounds(0, 101, 57, 40);
		panel_7.add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.setBounds(0, 164, 57, 40);
		panel_7.add(button_2);
		
		JButton button_3 = new JButton("1");
		button_3.setBounds(0, 223, 57, 40);
		panel_7.add(button_3);
		
		JButton button_4 = new JButton("0");
		button_4.setBounds(0, 283, 57, 40);
		panel_7.add(button_4);
		
		JButton button_5 = new JButton(".");
		button_5.setBounds(67, 283, 57, 40);
		panel_7.add(button_5);
		
		JButton button_6 = new JButton("2");
		button_6.setBounds(67, 223, 57, 40);
		panel_7.add(button_6);
		
		JButton button_7 = new JButton("5");
		button_7.setBounds(67, 164, 57, 40);
		panel_7.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.setBounds(67, 101, 57, 40);
		panel_7.add(button_8);
		
		JButton button_9 = new JButton("C");
		button_9.setBounds(67, 39, 57, 40);
		panel_7.add(button_9);
		
		JButton button_10 = new JButton("%");
		button_10.setBounds(134, 39, 57, 40);
		panel_7.add(button_10);
		
		JButton button_11 = new JButton("9");
		button_11.setBounds(134, 101, 57, 40);
		panel_7.add(button_11);
		
		JButton button_12 = new JButton("6");
		button_12.setBounds(134, 164, 57, 40);
		panel_7.add(button_12);
		
		JButton button_13 = new JButton("3");
		button_13.setBounds(134, 223, 57, 40);
		panel_7.add(button_13);
		
		JButton button_14 = new JButton("+/-");
		button_14.setBounds(134, 283, 57, 40);
		panel_7.add(button_14);
		
		JButton button_15 = new JButton("=");
		button_15.setBounds(201, 283, 57, 40);
		panel_7.add(button_15);
		
		JButton button_16 = new JButton("*");
		button_16.setBounds(201, 223, 57, 40);
		panel_7.add(button_16);
		
		JButton button_17 = new JButton("-");
		button_17.setBounds(201, 164, 57, 40);
		panel_7.add(button_17);
		
		JButton button_18 = new JButton("+");
		button_18.setBounds(201, 101, 57, 40);
		panel_7.add(button_18);
		
		JButton button_19 = new JButton("/");
		button_19.setBounds(201, 39, 57, 40);
		panel_7.add(button_19);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_5.setBounds(54, 435, 625, 63);
		frame.getContentPane().add(panel_5);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ChicBurger = Double.parseDouble(textFieldChickenBurger.getText());
				double iChicBurger = 2.39;
				double Burger = (ChicBurger * iChicBurger);
				String pMeal = String.format("%.2f", Burger);
				labelCostOfMeal.setText(pMeal);
				
				double BaconBurger = Double.parseDouble(textFieldBaconBurger.getText());
				double iBaconBurger = 4.39;
				double BBurger = (BaconBurger * iBaconBurger);
				String bpMeal = String.format("%.2f", BBurger + Burger);
				labelCostOfMeal.setText(bpMeal);
				
				double CheeseBurger = Double.parseDouble(textFieldCheeseBurger.getText());
				double iCheeseBurger = 3.39;
				double cBurger = (CheeseBurger * iCheeseBurger);
				String cpMeal = String.format("%.2f", Burger + cBurger + BBurger);
				labelCostOfMeal.setText(cpMeal);
				
				double iDelivery = 3.39;
				if(chckbxHomeDelivery.isSelected()) {
					String pDelivery = String.format("%.2f", iDelivery);
					labelCostOfDelivery.setText(pDelivery);
				}
				else {
					labelCostOfDelivery.setText("0");
				}
				
				double drinks = Double.parseDouble(textFieldDrink.getText());
				double tea = 1.20 * drinks;
				double cola = 0.90 * drinks;
				double juice = 1.50 * drinks;
				double coffee = 1.25 * drinks;
				
				if (comboBoxDrink.getSelectedItem().equals("Juice")) {
					String pJuice = String.format("%.2f", juice);
					labelCostOfDrinks.setText(pJuice);
				}
				else if (comboBoxDrink.getSelectedItem().equals("Tea")) {
					String pTea = String.format("%.2f", tea);
					labelCostOfDrinks.setText(pTea);
				}
				else if (comboBoxDrink.getSelectedItem().equals("Cola")) {
					String pCola = String.format("%.2f", cola);
					labelCostOfDrinks.setText(pCola);
				}
				else if (comboBoxDrink.getSelectedItem().equals("Coffee")) {
					String pCoffee = String.format("%.2f", coffee);
					labelCostOfDrinks.setText(pCoffee);
				}
				else {
					labelCostOfDrinks.setText("0");
				}
				
				double cTotal1 = Double.parseDouble(labelCostOfMeal.getText());
				double cTotal2 = Double.parseDouble(labelCostOfDelivery.getText());
				double cTotal3 = Double.parseDouble(labelCostOfDrinks.getText());
				double cTotal = cTotal1 + cTotal2 + cTotal3;
				
				if(chckbxTax.isSelected()) {
					String iTotal = String.format("%.2f", cTotal);
					//labelTax.setText(iTotal);
				}
			}
		});
		panel_5.add(btnTotal);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double qty1 = Double.parseDouble(textFieldChickenBurger.getText());
				double qty2 = Double.parseDouble(textFieldBaconBurger.getText());
				double qty3 = Double.parseDouble(textFieldCheeseBurger.getText());
				
				labelreceipt.setText("Restaurant Management System" + "\n" + qty1 + " Chicken Burger\n"
						+ qty3 + " Cheese Burger\n" + qty2 + " Bacon Burger\n");
			}
		});
		panel_5.add(btnReceipt);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelCostOfDelivery.setText(null);
				labelCostOfMeal.setText(null);
				labelCostOfDrinks.setText(null);
				textFieldChickenBurger.setText(null);
				textFieldBaconBurger.setText(null);
				textFieldCheeseBurger.setText(null);
				textFieldConvert.setText(null);
				textFieldDrink.setText(null);
				comboBoxCurrency.setSelectedItem("Choose One");
				comboBoxDrink.setSelectedItem("Select a Drink");				
			}
		});
		panel_5.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		panel_5.add(btnExit);
		
		JLabel lblManagementSystem = new JLabel("Management System");
		lblManagementSystem.setBounds(493, 14, 172, 19);
		frame.getContentPane().add(lblManagementSystem);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(375, 249, 298, 166);
		frame.getContentPane().add(panel_8);
		panel_8.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(10, 0, 280, 166);
		panel_8.add(panel_3);
		
		JLabel label = new JLabel("Tax");
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(10, 11, 126, 31);
		panel_3.add(label);
		
		JLabel label_1 = new JLabel("Subtotal");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(10, 59, 126, 31);
		panel_3.add(label_1);
		
		JLabel label_2 = new JLabel("Total");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(10, 101, 126, 31);
		panel_3.add(label_2);
		
		JLabel label_4 = new JLabel("");
		label_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_4.setBounds(166, 116, 87, 14);
		panel_3.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_5.setBounds(166, 70, 87, 14);
		panel_3.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_6.setBounds(166, 28, 87, 14);
		panel_3.add(label_6);
	}
}
