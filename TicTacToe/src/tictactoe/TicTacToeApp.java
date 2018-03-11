package tictactoe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTacToeApp {

	private JFrame frame;
	private String startGame = "X";
	private int xCount = 0;
	private int oCount = 0;
	private JLabel jlblplayerX;
	private JLabel jlblplayerO;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToeApp window = new TicTacToeApp();
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
	public TicTacToeApp() {
		initialize();
	}
	
	private void playGame(JButton btn) {
		JFrame jframe1 = new JFrame("Choose Again");
		if(btn.getText() == "")
		{
			btn.setText(startGame);
			
			//set color to X and O
			if(startGame.equalsIgnoreCase("X")) {
				btn.setForeground(Color.red);
			}
			else {
				btn.setForeground(Color.blue);
			}
			//method to choose next player
			choosePlayer();
		}
		else {
			JOptionPane.showMessageDialog(jframe1, "Please choose another field");
		}
	}
	
	private void choosePlayer() {
		if(startGame.equalsIgnoreCase("X")) {
			startGame = "O";
		}
		else {
			startGame = "X";
		}
	}
	
	private void winningGame() {
		JFrame jframe1 = new JFrame("Win");
		
		String b1 = btnNewButton_1.getText();
		String b2 = btnNewButton_2.getText();
		String b3 = btnNewButton_3.getText();
		
		String b4 = btnNewButton_4.getText();
		String b5 = btnNewButton_5.getText();
		String b6 = btnNewButton_6.getText();
		
		String b7 = btnNewButton_7.getText();
		String b8 = btnNewButton_8.getText();
		String b9 = btnNewButton_9.getText();
		
		if ((b1 ==("X") && b2 == ("X") && b3 == ("X")) || (b4 ==("X") && b5 == ("X") && b6 == ("X")) 
				|| (b7 ==("X") && b8 == ("X") && b9 == ("X")) || (b1 ==("X") && b4 == ("X") && b7 == ("X"))
				|| (b2 ==("X") && b5 == ("X") && b8 == ("X")) || (b3 ==("X") && b6 == ("X") && b9 == ("X"))
				|| (b1 ==("X") && b5 == ("X") && b9 == ("X")) || (b3 ==("X") && b5 == ("X") && b7 == ("X"))) {
			JOptionPane.showMessageDialog(jframe1, "Player X Wins");
			xCount++;
			gameScore();
		} 
		else if ((b1 ==("O") && b2 == ("O") && b3 == ("O")) || (b4 ==("O") && b5 == ("O") && b6 == ("O")) 
				|| (b7 ==("O") && b8 == ("O") && b9 == ("O")) || (b1 ==("O") && b4 == ("O") && b7 == ("O"))
				|| (b2 ==("O") && b5 == ("O") && b8 == ("O")) || (b3 ==("O") && b6 == ("O") && b9 == ("O"))
				|| (b1 ==("O") && b5 == ("O") && b9 == ("O")) || (b3 ==("O") && b5 == ("O") && b7 == ("O"))) {
			JOptionPane.showMessageDialog(jframe1, "Player O Wins");
			oCount++;
			gameScore();
		} 
	}
	
	private void gameScore() {
		jlblplayerX.setText(String.valueOf(xCount));
		jlblplayerO.setText(String.valueOf(oCount));
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 518, 391);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Tic Tac Toe");
		label.setFont(new Font("Gadugi", Font.BOLD, 23));
		label.setBounds(203, 0, 118, 31);
		frame.getContentPane().add(label);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 42, 482, 299);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(3, 5, 2, 2));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playGame(btnNewButton_1);
				winningGame();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 70));
		panel_1.add(btnNewButton_1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playGame(btnNewButton_2);
				winningGame();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 70));
		panel_2.add(btnNewButton_2, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playGame(btnNewButton_3);
				winningGame();
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 70));
		panel_3.add(btnNewButton_3, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Player X:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_4.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		jlblplayerX = new JLabel("");
		jlblplayerX.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_5.add(jlblplayerX, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playGame(btnNewButton_4);
				winningGame();
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 70));
		panel_6.add(btnNewButton_4, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playGame(btnNewButton_5);
				winningGame();
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 70));
		panel_7.add(btnNewButton_5, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playGame(btnNewButton_6);
				winningGame();
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 70));
		panel_8.add(btnNewButton_6, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Player O:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_10.add(lblNewLabel_2, BorderLayout.CENTER);
		
		JPanel panel_11 = new JPanel();
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		jlblplayerO = new JLabel("");
		jlblplayerO.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_11.add(jlblplayerO, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playGame(btnNewButton_7);
				winningGame();
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 70));
		panel_12.add(btnNewButton_7, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		btnNewButton_8 = new JButton("");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playGame(btnNewButton_8);
				winningGame();
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 70));
		panel_9.add(btnNewButton_8, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		btnNewButton_9 = new JButton("");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playGame(btnNewButton_9);
				winningGame();
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 70));
		panel_13.add(btnNewButton_9, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame jframe = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(jframe, "Confirm if you want to leave?", "Tic Tac Toe",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION);
				{
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_14.add(btnExit, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNewButton_1.setText(null);
				btnNewButton_2.setText(null);
				btnNewButton_3.setText(null);
				btnNewButton_4.setText(null);
				btnNewButton_5.setText(null);
				btnNewButton_6.setText(null);
				btnNewButton_7.setText(null);
				btnNewButton_8.setText(null);
				btnNewButton_9.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_15.add(btnReset, BorderLayout.CENTER);
	}
}
