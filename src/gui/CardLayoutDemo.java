package gui;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutDemo extends Frame {

	Panel pBody,pCard;
	TextField tf;
	
	public CardLayoutDemo(){
		initializer();
		initBody();
	}

	private void  initializer() {
		setExtendedState(MAXIMIZED_BOTH);
		setSize(600,478);	
	}

	private void initBody() {
		pBody=new Panel();
		
		pCard =new Panel();
		pCard.setBackground(Color.LIGHT_GRAY);
		pCard.setSize(300,267);
		//create CardLayout
		CardLayout layout=new CardLayout();
		layout.setHgap(10);
		layout.setVgap(10);
		pCard.setLayout(layout);
		
		//card 1
		Panel pTextField=new Panel();
		tf=new TextField(20);
		pTextField.add(tf);
		
		//card 2
		Panel pMessage=new Panel();
		Label lSms=new Label("Message",Label.CENTER);
		pMessage.add(lSms);
		
		//add tow cards above to card layout
		pCard.add(pTextField);
		pCard.add(pMessage);
		
		Button btnMessage=new Button("Send");
		
		//add card and button to panel body
		pBody.add(pCard);
		pBody.add(btnMessage);
	
		//add to frame
		add(pBody);
		
		btnMessage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lSms.setText(tf.getText().toString());
		
				CardLayout layout= (CardLayout) pCard.getLayout();
				layout.last(pCard);
			}
		});
		
	}
	public static void main(String[] args) {
		new CardLayoutDemo().setVisible(true);
	}
}
