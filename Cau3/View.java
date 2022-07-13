package Cau3;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class View extends JFrame {
	JLabel mainLabel,numberALabel,numberBLabel,numberCLabel,resultLabel;
	JTextField numberATextField,numberBTextField,numberCTextField;
	JButton solveBtn, closeBtn;
	JPanel solvePanel;
	public View(){
		init();
		this.setVisible(true);
	}

	public void init() {
		this.setTitle("Sovle Quadratic Equation");
		this.setSize(400,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		
		// init and add main label to frame
		mainLabel = new JLabel("Enter factors of equation");
		mainLabel.setFont(new Font("Century",Font.BOLD, 20));
		mainLabel.setHorizontalAlignment(SwingConstants.CENTER);
		 
		// init solve panel to frame
		solvePanel = new JPanel();
		solvePanel.setLayout(new GridLayout(4,2));
		
		numberATextField = new JTextField();
		numberBTextField = new JTextField();
		numberCTextField = new JTextField();
		numberALabel = new JLabel("Enter number a");
		solvePanel.add(numberALabel);
		solvePanel.add(numberATextField);
		numberBLabel = new JLabel("Enter number b");
		solvePanel.add(numberBLabel);
		solvePanel.add(numberBTextField);
		numberCLabel = new JLabel("Enter number c");
		solvePanel.add(numberCLabel);
		solvePanel.add(numberCTextField);
		solveBtn = new JButton("Solve");
		solvePanel.add(solveBtn);
		resultLabel = new JLabel("");
		solvePanel.add(resultLabel);
		
		closeBtn = new JButton("Close");
		this.add(mainLabel,BorderLayout.NORTH);
		this.add(solvePanel,BorderLayout.CENTER);
		this.add(closeBtn,BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		new View();
	}
}
