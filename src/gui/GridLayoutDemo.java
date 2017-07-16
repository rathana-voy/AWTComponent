package gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

public class GridLayoutDemo extends Frame{
	
	public GridLayoutDemo(){
		setSize(590,357);
		setLayout(new GridLayout(2,1,10,10));
		
		initComponent();
		
	}
	
	private void initComponent(){
		Button btn1=new Button("Button 1");
		Button btn2=new Button("Button 2");
		Button btn3=new Button("Button 3");
		Button btn4=new Button("Button 4");
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
	}
	
	public static void main(String[] args) {
		new GridLayoutDemo().setVisible(true);
	}
}
