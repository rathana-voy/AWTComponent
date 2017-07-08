package gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainWindow extends Frame{
	
	public MainWindow() {
		init();
		initButton();
	}
	
	public void initButton(){
		Panel pButton=new Panel();
		Button btnCancel=new Button("Cancel");
		Button btnShowWindow= new Button("Show Window");
		//btnCancel.inside(10, 10);
		System.out.println(btnCancel.getHeight());
		
		Button btnShowDialog= new Button("Show Dialog");
		
		btnShowDialog.setFocusable(true);
		pButton.add(btnCancel);
		
		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		btnShowWindow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				initWindow();
			}
		});
		
		btnShowDialog.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				initDialog();
			}
		});
		
		add(btnShowWindow);
		add(btnShowDialog);
		add(pButton);
		
	}
	
	public void initDialog(){
		Dialog dialog=new Dialog(this);
		Label lmessage=new Label("Show Dialog",Label.CENTER);
		dialog.add(lmessage);
		dialog.setSize(200,150);
		dialog.setVisible(true);
		
		dialog.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we){
				dialog.dispose();
			}
		});
	}
	public void init(){
		setSize(540,378);
		setTitle("HRD center");
		Image image=Toolkit.getDefaultToolkit().getImage("assets/img/ico_launcher.png");
		setIconImage(image);
		//setLayout(new FlowLayout());
		//setLayout(new BorderLayout());
		setLayout(new GridLayout(3, 1));
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we){
				dispose();
			}
		});
	}
	
	public void initWindow(){
		Window window=new Window(this);
		Label linfo=new Label("window container");
		Button btnCloseWindow=new Button("close");
		window.add(linfo);
		window.add(btnCloseWindow,BorderLayout.SOUTH);
		
		window.setBackground(Color.DARK_GRAY);
		window.setSize(100,100);
		window.setVisible(true);
		
		btnCloseWindow.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				window.dispose();
			}
		});
		
	}
}
