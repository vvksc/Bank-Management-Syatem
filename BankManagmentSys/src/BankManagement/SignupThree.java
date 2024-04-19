package BankManagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class SignupThree extends JFrame implements ActionListener{

	JRadioButton r1,r2,r3,r4;
	JCheckBox c1,c2,c3,c4,c5,c6,c7;
	JButton submit,cancel;
		String formno;
	
	
	public SignupThree(String s) {this.formno=s;
		setLayout(null);
		JLabel l1=new JLabel("Page 3 : Account Details ");
		l1.setFont(new Font("Raleway",Font.BOLD,22));
		l1.setBounds(300,40,400,40);
		add(l1);
		
		JLabel type=new JLabel("Account Type : ");
		type.setFont(new Font("Raleway",Font.BOLD,22));
	    type.setBounds(100,140,200,30);
		add(type);
		
		r1=new JRadioButton("Saving Account");
		r1.setFont(new Font("Raleway",Font.BOLD,16));
		setBackground(Color.WHITE);
		r1.setBounds(100, 180, 150, 20);
		add(r1);
		

		r2=new JRadioButton("Fixed Deposit");
		r2.setFont(new Font("Raleway",Font.BOLD,16));
		setBackground(Color.WHITE);
		r2.setBounds(350, 180, 150, 20);
		add(r2);
		

		r3=new JRadioButton("Current Account");
		r3.setFont(new Font("Raleway",Font.BOLD,16));
		setBackground(Color.WHITE);
		r3.setBounds(100, 220, 150, 20);
		add(r3);
		

		r4=new JRadioButton("Recurring Deposit Account");
		r4.setFont(new Font("Raleway",Font.BOLD,16));
		setBackground(Color.WHITE);
		r4.setBounds(350, 220, 150, 20);
		add(r4);
		
		ButtonGroup bt=new ButtonGroup();
		bt.add(r1);
		bt.add(r2);
		bt.add(r3);
		bt.add(r4);
		
		JLabel card=new JLabel("Card Number");
		card.setFont(new Font("Raleway",Font.BOLD,22));
	    card.setBounds(100,300,200,30);
		add(card);
		JLabel carddetail=new JLabel("Your ATM Card Number");
		carddetail.setFont(new Font("Raleway",Font.BOLD,12));
	    carddetail.setBounds(100,330,200,20);
		add(carddetail);
		
		JLabel number=new JLabel("XXXX-XXXX-XXXX-4123");
		number.setFont(new Font("Raleway",Font.BOLD,22));
	    number.setBounds(330,300,330,30);
		add(number);
		

		JLabel pin=new JLabel("Pin Number");
		pin.setFont(new Font("Raleway",Font.BOLD,22));
	    pin.setBounds(100,370,200,30);
		add(pin);
		JLabel pindetail=new JLabel("Your ATM Card  Pin Number");
		pindetail.setFont(new Font("Raleway",Font.BOLD,12));
	    pindetail.setBounds(100,400,200,20);
		add(pindetail);
		
		JLabel pnumber=new JLabel("XXXX");
		pnumber.setFont(new Font("Raleway",Font.BOLD,22));
	    pnumber.setBounds(330,370,330,30);
		add(pnumber);
		
		JLabel services=new JLabel("Services Required:");
		services.setFont(new Font("Raleway",Font.BOLD,22));
	    services.setBounds(100,450,250,30);
		add(services);
		
		c1=new JCheckBox("ATM Card");
		c1.setBackground(Color.WHITE);
		c1.setFont(new Font("Raleway",Font.BOLD,16));
		c1.setBounds(100, 500, 200, 30);
		add(c1);
		c2=new JCheckBox("Internet Banking");
		c2.setBackground(Color.WHITE);
		c2.setFont(new Font("Raleway",Font.BOLD,16));
		c2.setBounds(350, 500, 200, 30);
		add(c2);
		c3=new JCheckBox("Mobile Banking");
		c3.setBackground(Color.WHITE);
		c3.setFont(new Font("Raleway",Font.BOLD,16));
		c3.setBounds(100, 550, 200, 30);
		add(c3);
		c4=new JCheckBox("Email & Sms Alert");
		c4.setBackground(Color.WHITE);
		c4.setFont(new Font("Raleway",Font.BOLD,16));
		c4.setBounds(350, 550, 200, 30);
		add(c4);
		c5=new JCheckBox("Check Book");
		c5.setBackground(Color.WHITE);
		c5.setFont(new Font("Raleway",Font.BOLD,16));
		c5.setBounds(100, 600, 200, 30);
		add(c5);
		c6=new JCheckBox("E-Statement");
		c6.setBackground(Color.WHITE);
		c6.setFont(new Font("Raleway",Font.BOLD,16));
		c6.setBounds(350, 600, 200, 30);
		add(c6);
		c7=new JCheckBox("I here by declare that the entered detail are corrcet.");
		c7.setBackground(Color.WHITE);
		c7.setFont(new Font("Raleway",Font.BOLD,16));
		c7.setBounds(130, 700, 500, 30);
		add(c7);
		
		submit=new JButton("Submit");
		submit.setBackground(Color.BLACK);
		submit.setForeground(Color.WHITE);
		submit.setFont(new Font("Raleway",Font.BOLD,14));
		submit.setBounds(250,730,100,30);
		submit.addActionListener(this);
		add(submit);
		cancel=new JButton("Cancel");
		cancel.setBackground(Color.BLACK);
		cancel.setForeground(Color.WHITE);
		cancel.setFont(new Font("Raleway",Font.BOLD,14));
		cancel.setBounds(420,730,100,30);
		cancel.addActionListener(this);
		add(cancel);
		
		
		
		setSize(850,820);
		setLocation(350, 0);
		setVisible(true);
		getContentPane().setBackground(Color.WHITE);
	
	}
	
	
	
	
	public static void main(String[] args) {
	new SignupThree("");
}




	@Override
	public void actionPerformed(ActionEvent e) {
if(e.getSource()==submit) {
	String accountType=null;
	if(r1.isSelected())accountType="Saving Account";
	else if(r2.isSelected())accountType="Fixed Deposit Account";
	else if(r3.isSelected())accountType="Current Account";
	else if(r4.isSelected())accountType="Recurring Deposit Account";
	
	Random random=new Random();
	String cardnuber=""+Math.abs((random.nextLong()%90000000l)+5040936000000000l);
	String pinnumber=""+Math.abs((random.nextLong()%9000l)+1000l);
	
	String facility="";
	if(c1.isSelected())facility+=" ATM Card";
	else if(c2.isSelected())facility+=" Internet Banking";
	else if(c3.isSelected())facility+=" Mobile  Banking";
	else if(c4.isSelected())facility+=" Email & Sms Alert";
	else if(c5.isSelected())facility+=" Check Book";
	else if(c6.isSelected())facility+=" E.Statement";
	
	try {
		if(accountType.equals(""))JOptionPane.showMessageDialog(null,"Account type is required");
		else {
			Conn conn=new Conn();
			String sql="insert into signupthree values('"+formno+"','"+accountType+"','"+cardnuber+"','"+pinnumber+"','"+facility+"')";
			String sql2="insert into login values('"+formno+"','"+cardnuber+"','"+pinnumber+"')";
			conn.st.executeUpdate(sql);
			conn.st.executeUpdate(sql2);
			
			JOptionPane.showMessageDialog(null, "Card Number is :"+cardnuber+"\n Pin: "+pinnumber);
			System.out.println("done");
			setVisible(false);
			new Deposit(pinnumber).setVisible(true);
			
		}
		
	}catch(Exception ae) {
		System.out.println(ae);
	}
	
	
}else if(e.getSource()==cancel) {
	setVisible(false);
	new Login().setVisible(true);
}
	}
}
