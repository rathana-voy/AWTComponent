package gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventDemo extends Frame implements ActionListener{
	
	Button btnShow ,btnCancel;
	public EventDemo() {
	
		setSize(500,300);
		setLayout(new BorderLayout());
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we){
				dispose();
			}
		});
		
		Panel pButton=new Panel();
		btnShow=new Button("Show Message");
		btnCancel=new Button("Cancel");
		pButton.add(btnShow);
		pButton.add(btnCancel);
		add(pButton,BorderLayout.CENTER);
		
		btnShow.addActionListener(this);
		btnCancel.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new EventDemo().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(btnShow ==e.getSource()){
			Dialog dialog=new Dialog(this);
			dialog.setSize(200,150);
			dialog.setTitle("Message");
			dialog.show();
		}else if(btnCancel==e.getSource()){
			dispose();
		}
				
		
	}

}
