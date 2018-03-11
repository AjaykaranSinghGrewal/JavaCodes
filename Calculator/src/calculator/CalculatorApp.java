package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class CalculatorApp {

	private JFrame frame;
	private JTextField txtDisplay;
	
	private double firstNum;
	private double secondNum;
	private double result;
	private String operations;
	private String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorApp window = new CalculatorApp();
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
	public CalculatorApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 294, 384);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(10, 11, 258, 28);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btn7 = new JButton("7");
	
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		
		btn7.setBounds(10, 112, 57, 40);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setBounds(77, 112, 57, 40);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn9.setBounds(144, 112, 57, 40);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText(null);
				operations = "+";
			}
		});
		btnPlus.setBounds(211, 112, 57, 40);
		frame.getContentPane().add(btnPlus);
		
		JButton btn4 = new JButton("4");
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn4.setBounds(10, 175, 57, 40);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn5.setBounds(77, 175, 57, 40);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn6.setBounds(144, 175, 57, 40);
		frame.getContentPane().add(btn6);
		
		JButton btnSubtract = new JButton("-");
		
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText(null);
				operations = "-";
			}
		});
		btnSubtract.setBounds(211, 175, 57, 40);
		frame.getContentPane().add(btnSubtract);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn1.setBounds(10, 234, 57, 40);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn2.setBounds(77, 234, 57, 40);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn3.setBounds(144, 234, 57, 40);
		frame.getContentPane().add(btn3);
		
		JButton btnMultiply = new JButton("*");
		
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText(null);
				operations = "*";
			}
		});
		btnMultiply.setBounds(211, 234, 57, 40);
		frame.getContentPane().add(btnMultiply);
		
		JButton btn0 = new JButton("0");
		
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn0.setBounds(10, 294, 57, 40);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setBounds(77, 294, 57, 40);
		frame.getContentPane().add(btnDot);
		
		JButton btnPM = new JButton("+/-");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops * (-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPM.setBounds(144, 294, 57, 40);
		frame.getContentPane().add(btnPM);
		
		JButton btnEqual = new JButton("=");
		
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String answer;
				secondNum = Double.parseDouble(txtDisplay.getText());
				
				if (operations.equals("+")) {
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations.equals("-")) {
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				} 
				else if (operations.equals("*")) {
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations.equals("/")) {
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations.equals("%")) {
					result = firstNum % secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
			}
		});
		btnEqual.setBounds(211, 294, 57, 40);
		frame.getContentPane().add(btnEqual);
		
		JButton btnBack = new JButton("back");
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backspace = null;
				
				if(txtDisplay.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length() - 1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
			}
		});
		btnBack.setBounds(10, 50, 57, 40);
		frame.getContentPane().add(btnBack);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtDisplay.setText(null);
			}
		});
		btnClear.setBounds(77, 50, 57, 40);
		frame.getContentPane().add(btnClear);
		
		JButton btnPercentage = new JButton("%");
		
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText(null);
				operations = "%";
			}
		});
		btnPercentage.setBounds(144, 50, 57, 40);
		frame.getContentPane().add(btnPercentage);
		
		JButton btnDivide = new JButton("/");
		
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText(null);
				operations = "/";
			}
		});
		btnDivide.setBounds(211, 50, 57, 40);
		frame.getContentPane().add(btnDivide);
	}
}
