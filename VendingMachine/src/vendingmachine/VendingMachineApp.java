package vendingmachine;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.RootPaneUI;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.RootPaneContainer;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VendingMachineApp {

	private JFrame frame;
	private JTextField textFieldInsertMoney;
	private JTextField textFieldChange;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VendingMachineApp window = new VendingMachineApp();
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
	public VendingMachineApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblVendingMachine = new JLabel("VENDING MACHINE");
		lblVendingMachine.setFont(new Font("Yu Gothic Light", Font.BOLD, 20));
		lblVendingMachine.setBounds(125, 11, 198, 29);
		frame.getContentPane().add(lblVendingMachine);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "SELECT AN ITEM", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(59, 110, 322, 151);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnDorito = new JRadioButton("Dorito  $1.50");
		rdbtnDorito.setBounds(209, 21, 107, 23);
		panel.add(rdbtnDorito);
		
		JRadioButton rdbtnSodaWater = new JRadioButton("Soda Water  $1.75");
		rdbtnSodaWater.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		rdbtnSodaWater.setBounds(0, 49, 117, 23);
		panel.add(rdbtnSodaWater);
		
		JRadioButton rdbtnPepsi = new JRadioButton("Pepsi  $1.25");
		rdbtnPepsi.setBounds(0, 21, 98, 23);
		panel.add(rdbtnPepsi);
		
		JRadioButton rdbtnWater = new JRadioButton("Water  $1.00");
		rdbtnWater.setBounds(209, 49, 98, 23);
		panel.add(rdbtnWater);
		
		JRadioButton rdbtnGingerAle = new JRadioButton("Ginger Ale $1.25");
		rdbtnGingerAle.setBounds(0, 80, 115, 23);
		panel.add(rdbtnGingerAle);
		
		JRadioButton rdbtnFanta = new JRadioButton("Fanta  $1.25");
		rdbtnFanta.setBounds(209, 80, 98, 23);
		panel.add(rdbtnFanta);
		
		JButton btnPurchase = new JButton("Purchase");
		btnPurchase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double money = 0;
				money = Double.parseDouble(textFieldInsertMoney.getText());
				
				if(rdbtnDorito.isSelected()) {
					money -= 1.50;
				}
				else if(rdbtnFanta.isSelected()) {
					money -= 1.25;
				} 
				else if(rdbtnGingerAle.isSelected()) {
					money -= 1.25;
				}
				else if(rdbtnPepsi.isSelected()) {
					money -= 1.25;
				}
				else if(rdbtnSodaWater.isSelected()) {
					money -= 1.75;
				}
				else if(rdbtnWater.isSelected()) {
					money -= 1.00;
				}
				
				if (money < 0) {
					JOptionPane.showMessageDialog(frame, "Not Enough Money");
				}
				else {
					textFieldChange.setText(Double.toString(money));
				}
			}
		});
		btnPurchase.setBounds(0, 121, 89, 23);
		panel.add(btnPurchase);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdbtnDorito.setSelected(false);
				rdbtnFanta.setSelected(false);
				rdbtnGingerAle.setSelected(false);
				rdbtnPepsi.setSelected(false);
				rdbtnSodaWater.setSelected(false);
				rdbtnWater.setSelected(false);
				textFieldInsertMoney.setText(null);
				textFieldChange.setText(null);
			}
		});
		btnClear.setBounds(126, 121, 73, 23);
		panel.add(btnClear);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnCancel.setBounds(233, 121, 89, 23);
		panel.add(btnCancel);
		
		JLabel lblInsertMoney = new JLabel("Insert Money");
		lblInsertMoney.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblInsertMoney.setBounds(108, 38, 95, 29);
		frame.getContentPane().add(lblInsertMoney);
		
		JLabel lblChange = new JLabel("Change");
		lblChange.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblChange.setBounds(108, 70, 95, 29);
		frame.getContentPane().add(lblChange);
		
		textFieldInsertMoney = new JTextField();
		textFieldInsertMoney.setBounds(234, 44, 86, 20);
		frame.getContentPane().add(textFieldInsertMoney);
		textFieldInsertMoney.setColumns(10);
		
		textFieldChange = new JTextField();
		textFieldChange.setColumns(10);
		textFieldChange.setBounds(234, 76, 86, 20);
		frame.getContentPane().add(textFieldChange);
	}
}
