package gui;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import model.Person;

public class Form extends Frame{
	
	private Person person;
	private TextField tfName;
	private CheckboxGroup chGroup;
	private Checkbox chMale, chFemale;
	private Choice selectSchool;
	
	public Form(){
		init();
		initBanner();
		initForm();
		initfooter();
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
		tfName=new TextField(50);
		
		//radio button
		chGroup=new CheckboxGroup();
		chMale=new Checkbox("male",chGroup,true);
		chFemale=new Checkbox("female",chGroup,false);
		Panel pRadio=new Panel();
		pRadio.add(lGender);
		pRadio.add(chMale);
		pRadio.add(chFemale);
		
		selectSchool=new Choice();
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
	
		
		System.out.println(person);
		
		add(pForm);
		
	}

	protected void initfooter(){
		Panel pFooter=new Panel();
		
		GridBagConstraints con=new GridBagConstraints();
		con.fill=GridBagConstraints.HORIZONTAL;
		
		Button btnOK=new Button("OK");
		Button btnCancel=new Button("Cancel");
		pFooter.add(btnOK,con);
		pFooter.add(btnCancel,con);
		add(pFooter);
		
		btnOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				setPerson();
			}
		});
	}
	
	public void setPerson(){
		person=new Person();
		String gender =chGroup.getSelectedCheckbox().getLabel();
		person.setGender(gender);
		
		String school=selectSchool.getSelectedItem();
		person.setSchool(school);
		
		System.out.println(person);
	}
	

	public static void main(String[] args) {
		new Form().setVisible(true);
	}
}
