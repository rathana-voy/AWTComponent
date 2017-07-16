package gui;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;

public class BorderLayoutDemo extends Frame{
	
	public BorderLayoutDemo() {
		setExtendedState(MAXIMIZED_BOTH);
		setSize(500,378);
		
		setLayout(new BorderLayout());
		
		Label lNorth=new Label("North" , Label.CENTER);
		Label lSouth=new Label("South" , Label.CENTER);
		Label lCenter=new Label("Center");
		Label lWest=new Label("West" , Label.CENTER);
		Label lEast=new Label("East" , Label.CENTER);
		
		add(lNorth,BorderLayout.NORTH);
		add(lSouth,BorderLayout.SOUTH);
		add(lCenter,BorderLayout.CENTER);
		add(lWest,BorderLayout.WEST);
		add(lEast,BorderLayout.EAST);
	}

	public static void main(String[] args) {
		new BorderLayoutDemo().setVisible(true);
	}
}
