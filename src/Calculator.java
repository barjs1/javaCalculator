import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;

import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField input;
	public JLabel lbl1;
	public double answer,number;
	int operation;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void addinput(String str) {
		input.setText(input.getText()+str);
		
	}
	
	public void calculate() {
		switch(operation) {
		case 1 : 
			answer = number+Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 2 : 
			answer = number-Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 3 : 
			answer = number*Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 4 : 
			answer = number/Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		}
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setTitle("Hesap Makinesi");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel screen = new JPanel();
		screen.setBackground(new Color(255, 0, 0));
		screen.setBounds(10, 11, 314, 80);
		contentPane.add(screen);
		screen.setLayout(null);
		
		input = new JTextField();
		input.setBackground(new Color(255, 255, 255));
		input.setEditable(false);
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setFont(new Font("Trebuchet MS", Font.PLAIN, 30));
		input.setBounds(10, 27, 294, 42);
		screen.add(input);
		input.setColumns(10);
		
		JLabel lbl1 = new JLabel("number");
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl1.setBounds(154, 2, 150, 14);
		screen.add(lbl1);
		lbl1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JPanel kontrol = new JPanel();
		kontrol.setBackground(new Color(255, 0, 0));
		kontrol.setBounds(10, 107, 314, 378);
		contentPane.add(kontrol);
		kontrol.setLayout(new GridLayout(4, 4, 20, 20));
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addinput(e.getActionCommand());
				    
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		kontrol.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addinput(e.getActionCommand());
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		kontrol.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("9");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addinput(e.getActionCommand());
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		kontrol.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_3 = new JButton("+");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation=1;
				input.setText("");
				lbl1.setText(number+e.getActionCommand());
				
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		kontrol.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_2 = new JButton("4");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addinput(e.getActionCommand());
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		kontrol.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_4 = new JButton("5");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addinput(e.getActionCommand());
			}
		});
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		kontrol.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("6");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addinput(e.getActionCommand());
			}
		});
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 30));
		kontrol.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("-");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation=2;
				input.setText("");
				
				lbl1.setText(number+e.getActionCommand());
			}
		});
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.BOLD, 30));
		kontrol.add(btnNewButton_1_6);
		
		JButton btnNewButton_1_7 = new JButton("1");
		btnNewButton_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addinput(e.getActionCommand());
			}
		});
		btnNewButton_1_7.setFont(new Font("Tahoma", Font.BOLD, 30));
		kontrol.add(btnNewButton_1_7);
		
		JButton btnNewButton_1_8 = new JButton("2");
		btnNewButton_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addinput(e.getActionCommand());
			}
		});
		btnNewButton_1_8.setFont(new Font("Tahoma", Font.BOLD, 30));
		kontrol.add(btnNewButton_1_8);
		
		JButton btnNewButton_1_9 = new JButton("3");
		btnNewButton_1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addinput(e.getActionCommand());
			}
		});
		btnNewButton_1_9.setFont(new Font("Tahoma", Font.BOLD, 30));
		kontrol.add(btnNewButton_1_9);
		
		JButton btnNewButton_1_10 = new JButton("X");
		btnNewButton_1_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation=3;
				input.setText("");
				
				lbl1.setText(number+e.getActionCommand());
			}
		});
		btnNewButton_1_10.setFont(new Font("Tahoma", Font.PLAIN, 30));
		kontrol.add(btnNewButton_1_10);
		
		JButton btnNewButton_1_9_1 = new JButton("0");
		btnNewButton_1_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addinput(e.getActionCommand());
			}
		});
		btnNewButton_1_9_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		kontrol.add(btnNewButton_1_9_1);
		
		JButton btnNewButton_1_9_2 = new JButton("=");
		btnNewButton_1_9_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				lbl1.setText("");
			}
		});
		btnNewButton_1_9_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		kontrol.add(btnNewButton_1_9_2);
		
		JButton btnNewButton_1_9_3 = new JButton("C");
		btnNewButton_1_9_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(" ");
			}
		});
		btnNewButton_1_9_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		kontrol.add(btnNewButton_1_9_3);
		
		JButton btnNewButton_1_9_4 = new JButton("%");
		btnNewButton_1_9_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation=4;
				input.setText("");
				
				lbl1.setText(number+e.getActionCommand());
			}
		});
		btnNewButton_1_9_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		kontrol.add(btnNewButton_1_9_4);
	}
}
