package BankManagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class Login extends JFrame implements ActionListener {
	JButton login,clear,signup;
	JTextField cardfield;JPasswordField  pinfield;
	
Login(){
	setLayout(null);//making default position null
	setTitle("Banking Managment System");//giving name for frame
	ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("logo.jpg"));//loading image from pc
	Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);//setting size of image
	ImageIcon i3=new ImageIcon(i2);//converting sized imamge to new icon 
	JLabel label=new JLabel(i3);//adding image to frame
	label.setBounds(70, 10, 100, 100);//setting location of iamge
	add(label);//adding image
	
	JLabel text=new JLabel("Welcome to Atm");//creating welcome note
	text.setFont(new Font("Osward",Font.BOLD,38));
	text.setBounds(200, 40, 400, 40);//setting position and height width of welcome note
	add(text);//adding welcome
	
	
	
	JLabel cardtext=new JLabel("Card no :");
	cardtext.setFont(new Font("relway",Font.BOLD,30));
	cardtext.setBounds(200, 150, 400, 40);
	add(cardtext);
	
	 cardfield=new JTextField();//creating text field for cardnjumber
	cardfield.setBounds(350,160,250,30);//setting cardfield bounds and position
	cardfield.setFont(new Font("Arial", Font.BOLD, 20));
	add(cardfield);//adding card field
	
	JLabel pintext=new JLabel("Pin no :");
	pintext.setFont(new Font("relway",Font.BOLD,30));
	pintext.setBounds(200, 250, 400, 40);
	add(pintext);
	
	 pinfield=new JPasswordField();
	pinfield.setBounds(350,260,250,30);
	pinfield.setFont(new Font("Arial", Font.BOLD, 17));
	add(pinfield);
	 login=new JButton("Sign In");//creating login button
	login.setBounds(360, 320,100, 30);//setting bounds for login button
	login.setBackground(Color.BLACK);//setting background color for login button
	login.setForeground(Color.WHITE);//setting font color  for login button
	login.addActionListener(this);//performing action
	add(login);//adding button
	
	 clear=new JButton("Clear");
	clear.setBounds(500, 320,100, 30);
	clear.setBackground(Color.BLACK);
	clear.setForeground(Color.WHITE);
	clear.addActionListener(this);
	add(clear);
	
	 signup=new JButton("Sign Up");
	signup.setBounds(360, 360,240, 30);
	signup.setBackground(Color.BLACK);
	signup.setForeground(Color.WHITE);
	signup.addActionListener(this);
	add(signup);
	
	
	
	
	
	getContentPane().setBackground(Color.WHITE);
	setSize(800,480);//setting size of frame
	setVisible(true);//making frame visible
	setLocation(350,200);//setting location of screen
	
} 


public void actionPerformed(ActionEvent ae) {
	//if(ae.getSource()==login) {}
	 if(ae.getSource()==clear) {
		cardfield.setText("");
		pinfield.setText("");
	}
	else if(ae.getSource()==login) {
		Conn con=new Conn();
		String cardnumber=cardfield.getText();
		String pinnumber=pinfield.getText();
		String sql="select * from login where cardnumber = '"+cardnumber+"' and pinnumber ='"+pinnumber+"'";
		try {
			ResultSet res=con.st.executeQuery(sql);
			if(res.next()) {
				setVisible(false);
				new Transation(pinnumber).setVisible(true);
			}else {
				JOptionPane.showMessageDialog(null, "Incorrect Card or Pin Number");
			}
		}catch (Exception e) {
                System.out.println(e);		}
	}else if(ae.getSource()==signup) {
		setVisible(false);
		new SignupOne().setVisible(true);
	}
	
}


	public static void main(String[] args) {
		new Login();
	}




	

}
