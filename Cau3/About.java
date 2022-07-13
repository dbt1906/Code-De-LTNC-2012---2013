package Cau3;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class About extends JFrame{
	JLabel mainLabel,iconLabel;
	JButton okBtn,a;
	ImageIcon myIcon;
	public About(){
		this.setTitle("About");
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		mainLabel = new JLabel("<html>Advanced Programming<br/>Version 1.0<br/>Copyright Minh<br/>FIT HCMUAF</html>");
		mainLabel.setBounds(180, 0, 300, 100);
		okBtn = new JButton("Ok");
		okBtn.setBounds(300, 220, 50, 25);
		myIcon = new ImageIcon("C:\\Users\\DBT19\\Downloads\\hinh.png");
		this.add(mainLabel);
		this.add(okBtn);
		a= new JButton();
		a.setIcon(myIcon);
		iconLabel= new  JLabel();
		iconLabel.setIcon(myIcon);
		iconLabel.setBounds(0,0,250,250);
		this.add(iconLabel);	
		
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		new About();
	}
}
