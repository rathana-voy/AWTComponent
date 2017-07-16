package gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.TextField;

public class GridBagLayoutDemo extends Frame{
	
	public GridBagLayoutDemo(){
		setSize(600,300);
		setLayout(new GridBagLayout());
		
		initailizer();
	}
	
	public void initailizer(){
		
		GridBagConstraints con=new GridBagConstraints();
		
		con.fill=GridBagConstraints.HORIZONTAL;
		
		con.gridx=1;
		con.gridy=1;
		con.insets=new Insets(0, 0, 5, 5);
		Button btn1=new Button("button 1");
		add(btn1,con);
		
		con.gridx=2;
		con.gridy=1;
		con.ipady=10;
		con.ipadx=10;
		Button btn2=new Button("button 2");
		add(btn2,con);
		
		con.gridx=1;
		con.gridy=2;
		TextField tfText=new TextField(20);
		add(tfText,con);
		
		
		con.gridx=1;
		con.gridy=3;
		con.gridheight=2;
		con.gridwidth=2;
		TextField tfText2=new TextField(20);
		add(tfText2,con);
		
	}
	public static void main(String[] args) {
		new GridBagLayoutDemo().setVisible(true);
	}

}
