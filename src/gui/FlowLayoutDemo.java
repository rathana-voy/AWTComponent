package gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class FlowLayoutDemo extends Frame{

	public FlowLayoutDemo() {
		setSize(500,379);
		setLayout(new FlowLayout(FlowLayout.RIGHT,20,20));
		
		
		Label lEmail=new Label("Email : " ,Label.RIGHT);
		Label lPassword=new Label("Password : " ,Label.RIGHT);
		
		TextField tfEmail=new TextField(20);
		TextField tfPass=new TextField(20);
		
		Button btnLogin=new Button("Login");
		
		add(lEmail);
		add(tfEmail);
		add(lPassword);
		add(tfPass);
		add(btnLogin);
		
	}
	public static void main(String[] args) {
		new FlowLayoutDemo().setVisible(true);
	}
}
