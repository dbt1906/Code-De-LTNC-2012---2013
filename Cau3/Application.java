package Cau3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Application extends JFrame implements ActionListener,KeyListener{
	JMenuBar bar;
	JMenu tools, helps;
	JMenuItem solve, exit, about;
	public Application() {
		this.setTitle("My Application");
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		bar = new JMenuBar();
		tools = new JMenu("Tools");
		helps = new JMenu("Help");
		solve = new JMenuItem("Solve Quadratic Equation Crt+T");
		solve.setIcon(new ImageIcon("C:\\Users\\DBT19\\Downloads\\solve.png"));
		exit = new JMenuItem("Exit Crt+X");
		exit.setIcon(new ImageIcon("C:\\Users\\DBT19\\Downloads\\exit.png"));
		tools.add(solve);
		tools.add(exit);
	
		about = new JMenuItem("About");
		helps.add(about);
		bar.add(tools);
		bar.add(helps);
		this.setJMenuBar(bar);
		addAction();
		this.setVisible(true);
	}
	public void addAction() {
		solve.addActionListener(this);
		about.addActionListener(this);
		exit.addActionListener(this);
		this.addKeyListener(this);
	}
	public static void main(String[] args) {
		new Application();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==exit) {
			System.exit(1);
		}
		else if (e.getSource()==solve ) {
			new Controller(new View());
		}
		else if (e.getSource()==about) {
			new About();
		}
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.isControlDown()&&e.getKeyCode()==KeyEvent.VK_T) {
			new Controller(new View());
		}
		else if (e.isControlDown()&&e.getKeyCode()==KeyEvent.VK_X) {
			System.exit(1);
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
