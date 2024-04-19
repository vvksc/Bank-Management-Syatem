package BankManagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class SignupOne extends JFrame implements ActionListener {
		long random;
		JTextField namefield,fatherfield,dobfield,emailfield,addresfield,cityfield,statefield,pinfield;
		JButton next;
		JRadioButton male,female,married,unmarried;
	public SignupOne() {
		
		setLayout(null);
		Random ram=new Random();
		 random=Math.abs((ram.nextLong()%9000l)+1000l);
		JLabel formno=new JLabel("Application form number. "+random);
			formno.setFont(new Font("Raleway",Font.BOLD,38));	
			formno.setBounds(140, 20, 600, 40);
			add(formno);
			
			JLabel persnolDetails=new JLabel("Page 1: Persnol Details ");
			persnolDetails.setFont(new Font("Raleway",Font.BOLD,22));	
			persnolDetails.setBounds(290, 80,400,30);
			add(persnolDetails);
			
			JLabel name=new JLabel("Name :");
			name.setFont(new Font("Raleway",Font.BOLD,20));	
			name.setBounds(100,140,100,30);
			add(name);
			
			namefield=new JTextField();
			namefield.setFont(new Font("Raleway",Font.BOLD,14));	
			namefield.setBounds(300,140,400,30);
			add(namefield);
		
				
			JLabel fname=new JLabel("Father's Name :");
			fname.setFont(new Font("Raleway",Font.BOLD,20));	
			fname.setBounds(100,190,200,30);
			add(fname);
			
			 fatherfield=new JTextField();
			fatherfield.setFont(new Font("Raleway",Font.BOLD,20));	
			fatherfield.setBounds(300,190,400,30);
			add(fatherfield);
			
			JLabel dob=new JLabel("Date Of Birth:");
			dob.setFont(new Font("Raleway",Font.BOLD,20));	
			dob.setBounds(100,240,200,30);
			add(dob);
			
			 dobfield=new JTextField();
			dobfield.setFont(new Font("Raleway",Font.BOLD,20));	
			dobfield.setBounds(300,240,400,30);
			add(dobfield);
			
			JLabel gender=new JLabel("Gender:");
			gender.setFont(new Font("Raleway",Font.BOLD,20));	
			gender.setBounds(100,290,100,30);
			add(gender);
			
			 male=new JRadioButton("Male");
			male.setBounds(300, 290, 60, 30);
			male.setBackground(Color.WHITE);
			add(male);
			
			 female=new JRadioButton("Female");
			female.setBounds(450, 290, 100, 30);
			female.setBackground(Color.WHITE);
			add(female);
			
			ButtonGroup gendergroup=new ButtonGroup();
			gendergroup.add(female);
			gendergroup.add(male);
			
			JLabel email=new JLabel("Email Address:");
			email.setFont(new Font("Raleway",Font.BOLD,20));	
			email.setBounds(100,340,200,30);
			add(email);
			
			 emailfield=new JTextField();
			emailfield.setFont(new Font("Raleway",Font.BOLD,20));	
			emailfield.setBounds(300,340,400,30);
			add(emailfield);
			
			JLabel marital=new JLabel("Marital Status:");
			marital.setFont(new Font("Raleway",Font.BOLD,20));	
			marital.setBounds(100,390,200,30);
			add(marital);
			
			 married=new JRadioButton("Married");
			married.setBounds(300, 390, 90, 30);
			married.setBackground(Color.WHITE);
			add(married);
			
			 unmarried=new JRadioButton("Unmarried");
			unmarried.setBounds(450, 390, 100, 30);
			unmarried.setBackground(Color.WHITE);
			add(unmarried);
			
			ButtonGroup marriagegroup=new ButtonGroup();
			marriagegroup.add(married);
			marriagegroup.add(unmarried);
			
			JLabel address=new JLabel("Address:");
			address.setFont(new Font("Raleway",Font.BOLD,20));	
			address.setBounds(100,440,100,30);
			add(address);
			
			 addresfield=new JTextField();
			addresfield.setFont(new Font("Raleway",Font.BOLD,20));	
			addresfield.setBounds(300,440,400,30);
			add(addresfield);
			
			JLabel city=new JLabel("City:");
			city.setFont(new Font("Raleway",Font.BOLD,20));	
			city.setBounds(100,490,100,30);
			add(city);
			
			 cityfield=new JTextField();
			cityfield.setFont(new Font("Raleway",Font.BOLD,20));	
			cityfield.setBounds(300,490,400,30);
			add(cityfield);
			
			JLabel state=new JLabel("State:");
			state.setFont(new Font("Raleway",Font.BOLD,20));	
			state.setBounds(100,540,100,30);
			add(state);
			
			 statefield=new JTextField();
			statefield.setFont(new Font("Raleway",Font.BOLD,20));	
			statefield.setBounds(300,540,400,30);
			add(statefield);
			
			JLabel pincode=new JLabel("Pin Code:");
			pincode.setFont(new Font("Raleway",Font.BOLD,20));	
			pincode.setBounds(100,590,100,30);
			add(pincode);
			
			 pinfield=new JTextField();
			pinfield.setFont(new Font("Raleway",Font.BOLD,20));	
			pinfield.setBounds(300,590,400,30);
			add(pinfield);
			
			 next=new JButton("Next");
			next.setBackground(Color.BLACK);
			next.setForeground(Color.WHITE);
			next.setFont(new Font("Raleway", Font.BOLD,14));
			next.setBounds(620,660, 80, 30);
			next.addActionListener(this);
			add(next);
			
			
				getContentPane().setBackground(Color.WHITE);
		
		setSize(850,800);
	setLocation(350, 10);
	setVisible(true);
	
	
	
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String formno=""+random;
		String name=namefield.getText();
		String fname=fatherfield.getText();
		String dob=dobfield.getText();
		String gender=null;
		if(male.isSelected())gender="Male";
		else gender="Female";
		String email=emailfield.getText();
		String marital=null;
		if(married.isSelected())marital="Married";
		else marital="Unmarried";
		String address=addresfield.getText();
		String city=cityfield.getText();
		String state=statefield.getText();
		String pin=pinfield.getText();
		
		
		try {
			if(name.equals("")) {
				JOptionPane.showMessageDialog(null,"Name is Required");
			}
			if(fname.equals("")) {
				JOptionPane.showMessageDialog(null,"Fname is Required");
			}
			if(dob.equals("")) {
				JOptionPane.showMessageDialog(null,"dob is Required");
			}
			if(gender.equals("")) {
				JOptionPane.showMessageDialog(null,"gender is Required");
			}
			if(email.equals("")) {
				JOptionPane.showMessageDialog(null,"Email is Required");
			}
			else {
				Conn c=new Conn();
				String query="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
				c.st.executeUpdate(query);
				setVisible(false);
				new SignupTwo(formno).setVisible(true);
			}
			
			
		}catch(Exception ae) {
			System.out.println(ae);
		}
	}
	
	public static void main(String[] args) {
		
	
	new SignupOne();
}

	}
