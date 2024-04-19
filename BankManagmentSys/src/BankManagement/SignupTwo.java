package BankManagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SignupTwo extends JFrame implements ActionListener {
//	long random;
	JTextField pan,aadhar;
	JButton next;
	JRadioButton syes,sno,eyes,eno;
	JComboBox religion,category,income,education,occupation;
	String formno;
public SignupTwo(String form) {
	this.formno=form;
	setLayout(null);
	JLabel formno=new JLabel("New Account Application Page: 2");
		formno.setFont(new Font("Raleway",Font.BOLD,30));	
		formno.setBounds(140, 20, 600, 40);
		add(formno);
		
		JLabel additionalDetails=new JLabel("Page 2: Persnol Details ");
		additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));	
		additionalDetails.setBounds(290, 80,400,30);
		add(additionalDetails);
		
		JLabel name=new JLabel("Religion :");
		name.setFont(new Font("Raleway",Font.BOLD,20));	
		name.setBounds(100,140,100,30);
		add(name);
		String valReligion[]={"Hindu","Muslim","Sikh","Christian","Other"};
		 religion= new JComboBox(valReligion);
		religion.setBounds(300,140,400,30);
		religion.setBackground(Color.WHITE);
		add(religion);
		
		
		
	
			
		JLabel fname=new JLabel("Category :");
		fname.setFont(new Font("Raleway",Font.BOLD,20));	
		fname.setBounds(100,190,200,30);
		add(fname);
		
		String valCategory[]={"General","Obc","Sc","St","Other"};
		 category= new JComboBox(valCategory);
		category.setBounds(300,190,400,30);
		category.setBackground(Color.WHITE);
		add(category);
		
		
		
		JLabel dob=new JLabel("Income:");
		dob.setFont(new Font("Raleway",Font.BOLD,20));	
		dob.setBounds(100,240,200,30);
		add(dob);
		
		String incomeCategory[]={"Null","<1,50,000","<2,00,000","<5,00,000","Upto 10,00,000"};
		 income= new JComboBox(incomeCategory);
		income.setBounds(300,240,400,30);
		income.setBackground(Color.WHITE);
		add(income);
		
		JLabel gender=new JLabel("Educational");
		gender.setFont(new Font("Raleway",Font.BOLD,20));	
		gender.setBounds(100,290,150,30);
		add(gender);
		
		
		
		JLabel email=new JLabel("Qualification:");
		email.setFont(new Font("Raleway",Font.BOLD,20));	
		email.setBounds(100,315,200,30);
		add(email);
		
		String educationCategory[]={"Non-Graduate","Graduate","Post-Graduation","Doctor","Other"};
		 education= new JComboBox(educationCategory);
		education.setBounds(300,300,400,30);
		education.setBackground(Color.WHITE);
		add(education);
		
		
		
		JLabel marital=new JLabel("Occupation:");
		marital.setFont(new Font("Raleway",Font.BOLD,20));	
		marital.setBounds(100,390,200,30);
		add(marital);
		
		String occupationCategory[]={"Salaried","Self-employed","Businessman","Student","Retired","Other"};
		occupation= new JComboBox(occupationCategory);
		occupation.setBounds(300,390,400,30);
		occupation.setBackground(Color.WHITE);
		add(occupation);
		
		
		
		JLabel address=new JLabel("Pan Number:");
		address.setFont(new Font("Raleway",Font.BOLD,20));	
		address.setBounds(100,440,150,30);
		add(address);
		
		 pan=new JTextField();
		pan.setFont(new Font("Raleway",Font.BOLD,20));	
		pan.setBounds(300,440,400,30);
		add(pan);
		
		JLabel city=new JLabel("Aadhar Number:");
		city.setFont(new Font("Raleway",Font.BOLD,20));	
		city.setBounds(100,490,180,30);
		add(city);
		
		 aadhar=new JTextField();
		aadhar.setFont(new Font("Raleway",Font.BOLD,20));	
		aadhar.setBounds(300,490,400,30);
		add(aadhar);
		
		JLabel state=new JLabel("Senior Citizen:");
		state.setFont(new Font("Raleway",Font.BOLD,20));	
		state.setBounds(100,540,150,30);
		add(state);
		
		 syes=new JRadioButton("Yes");
			syes.setBounds(300, 540, 90, 30);
			syes.setBackground(Color.WHITE);
			add(syes);
			
			 sno=new JRadioButton("No");
			 sno.setBounds(450, 540, 100, 30);
			sno.setBackground(Color.WHITE);
			add(sno);
			
			ButtonGroup marriagegroup=new ButtonGroup();
			marriagegroup.add(syes);
			marriagegroup.add(sno);
		
		
			JLabel pincode=new JLabel("Existing Account:");
		pincode.setFont(new Font("Raleway",Font.BOLD,20));	
		pincode.setBounds(100,590,180,30);
		add(pincode);
		

		 eyes=new JRadioButton("Yes");
			eyes.setBounds(300, 590, 90, 30);
			eyes.setBackground(Color.WHITE);
			add(eyes);
			
			 eno=new JRadioButton("No");
			 eno.setBounds(450, 590, 100, 30);
			 eno.setBackground(Color.WHITE);
			add(eno);
			
			ButtonGroup emarriagegroup=new ButtonGroup();
			emarriagegroup.add(eyes);
			emarriagegroup.add(eno);
		
		
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
	//String formno=""+random;
	String sreligion=(String)religion.getSelectedItem();
	String scategory=(String)category.getSelectedItem();
	String sincome=(String)income.getSelectedItem();
	String seducation=(String)education.getSelectedItem();
	String soccupation=(String)occupation.getSelectedItem();
	String seniorCitizen=null;
	if(syes.isSelected())seniorCitizen="Yes";
	else seniorCitizen="No";
	String existingAccount=null;
	if(eyes.isSelected())existingAccount="Yes";
	else existingAccount="No";
	String span=pan.getText();
	String saadhar=aadhar.getText();
	try {
		
			Conn c=new Conn();
			String query="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+seniorCitizen+"','"+existingAccount+"','"+span+"','"+saadhar+"')";
			c.st.executeUpdate(query);
			setVisible(false);
			new SignupThree(formno).setVisible(true);
		
		
		
	}catch(Exception ae) {
		System.out.println(ae);
	}
	
	
	
	
}

public static void main(String[] args) {
	

     new SignupTwo("");
}

}

