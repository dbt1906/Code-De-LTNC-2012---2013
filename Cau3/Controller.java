package Cau3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
 View view ;
 	 public Controller(View view) {
 		 this.view=view;
 		 view.closeBtn.addActionListener(this);
 		 view.solveBtn.addActionListener(this);
 	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==view.closeBtn) {
			System.exit(1);}
		else if(e.getSource()==view.solveBtn) {
			int a=Integer.parseInt(view.numberATextField.getText());
			int b=Integer.parseInt(view.numberBTextField.getText());
			int c=Integer.parseInt(view.numberCTextField.getText());
			

			view.resultLabel.setText(solve(a, b, c));
			
		}
		
		
	}
	public static String solve(int a, int b , int c) {
		String result="";
		if(a==0) {
			if(b==0) {
				result="Phuong trinh vo nghiem";
			}
			else{
				result="Phuong trinh co nghiem x1="+(-c/b);
			}
		}
		double delta = b*b-4*a*c;
		double x1= (-b+Math.sqrt(delta))/(2*a);
		double x2= (-b-Math.sqrt(delta))/(2*a);
		if(delta<0) {
			result="Phuong trinh vo nghiem";}
		else if(delta>0) {
			
				result="X1="+(double)Math.round(x1*1000)/1000+";X2="+(double)Math.round(x2*1000)/1000;}
				else {
					result="X1=X2="+(double)Math.round(x1*100)/100;
				}
		return result;		
		}
	
 	 public static void main(String[] args) {
		new Controller(new View());
	}
}
