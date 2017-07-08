package gui;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class Form extends Frame{
	
	public Form(){
		init();
		initBanner();
		initForm();
	}
	
	protected void init(){ 
		setSize(500,350);
		setLayout(new GridLayout(3, 1));
	}
	
	protected void initBanner(){
		Panel lLabel=new Panel();
		Label lBanner=new Label("Register",Label.CENTER);
		lLabel.add(lBanner);
		add(lLabel);
	}
	
	protected void initForm(){
		Label lName=new Label("Name :",Label.RIGHT);
		Label lGender=new Label("Gender :",Label.RIGHT);
		Label lSchool=new Label("School :",Label.RIGHT);
		
		//textField
		TextField tfName=new TextField(50);
		
		//radio button
		CheckboxGroup chGroup=new CheckboxGroup();
		Checkbox chMale=new Checkbox("male",chGroup,true);
		Checkbox chFemale=new Checkbox("female",chGroup,false);
		Panel pRadio=new Panel();
		pRadio.add(lGender);
		pRadio.add(chMale);
		pRadio.add(chFemale);
		
		Choice selectSchool=new Choice();
		selectSchool.add("HRD");
		selectSchool.add("RUPP");
		selectSchool.add("SETEC");
		selectSchool.add("Norton");
		
		Panel pForm=new Panel();
		pForm.add(lName);
		pForm.add(tfName);
		pForm.add(pRadio);
		pForm.add(lSchool);
		pForm.add(selectSchool);
		
		add(pForm);
		
	}

	public static void main(String[] args) {
		new Form().setVisible(true);
	}
}
