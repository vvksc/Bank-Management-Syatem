package BankManagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FastCash  extends JFrame implements ActionListener{
			JButton deposit,withdrawl,fastcash,ministatement,pinchange,balanceenq,exit;
			String pinnumber;
	public FastCash(String pin){
		pinnumber=pin;
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);
		
		JLabel text=new JLabel("Select Withdrawl Amount");
		text.setBounds(210, 280, 700, 35);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System",Font.BOLD,18));
		image.add(text);
		
		 deposit=new JButton("100");
		deposit.setBounds(150, 388, 150, 30);
		deposit.addActionListener(this);
		image.add(deposit);
	
		withdrawl=new JButton("500");
		withdrawl.setBounds(350, 388, 150, 30);
		withdrawl.addActionListener(this);
		image.add(withdrawl);
		
		fastcash=new JButton("1000");
		fastcash.setBounds(150, 425, 150, 30);
		fastcash.addActionListener(this);
		image.add(fastcash);
		
		 ministatement=new JButton("2000");
		ministatement.setBounds(350, 425, 150, 30);
		ministatement.addActionListener(this);
		image.add(ministatement);
		
		pinchange=new JButton("5000");
		pinchange.setBounds(150, 460, 150, 30);
		pinchange.addActionListener(this);
		image.add(pinchange);
		
		balanceenq=new JButton("10000");
		balanceenq.setBounds(350, 460, 150, 30);
		balanceenq.addActionListener(this);
		image.add(balanceenq);
		
		 exit=new JButton("Back");
		exit.setBounds(350, 493, 150, 30);
		exit.addActionListener(this);
		image.add(exit);
		
		
		
		
		
			setSize(900,900);
			setLocation(300, 0);
			setUndecorated(true);
			//getContentPane().setBackground(Color.WHITE);
			setVisible(true);
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==exit) {
			setVisible(false); new Transation(pinnumber).setVisible(true);
		}
		else {
			String amount=((JButton)e.getSource()).getText();
			//System.out.println(amount);
			Conn con=new Conn();
			
			try {
			
			ResultSet rs=con.st.executeQuery("select * from bank where pin ='"+pinnumber+"'");
			int balance=0;
			while(rs.next()) {
				if(rs.getString("type")==("Deposit")) {
					balance+=Integer.parseInt(rs.getString(amount));
				}else {
					balance-=Integer.parseInt(rs.getString(amount));
				}
			}if(e.getSource()!=exit || balance< Integer.parseInt(amount)) {
				JOptionPane.showMessageDialog(null, "Insufficient Balance");
				return;
			}
			String type="withdraw";
			Date date=new Date();
			String sql2="insert into bank values('"+pinnumber+"','"+date+"','Withdraw','"+amount+"')";
			con.st.executeUpdate(sql2); 
			JOptionPane.showMessageDialog(null,"Rs "+amount+" Debited Successfully");
			setVisible(false);
			new Transation(pinnumber).setVisible(true);
				
			}catch(Exception ae) {
				System.out.println(ae);
			}
		}
	}
	public static void main(String[] args){
		new FastCash("");
		
		/* hello sir my name is vivek singh and i'm a bca graduate
		 *  from ravindranath university bhopal with 7.2 cgpa along with my graduation
		 *   i have also worked as a froont desk executive at narmada hospital.
 my strength is java and i have good knowledge of oops and data  structures along
  with java i also have good knoiwlwdgw in css html and mysql by using 
  these skills i developed a desktop based application and multiple
   ui templates where i used java for backend mysql for storiing data 
   and css html for creating attractive user interface.  
		 */
	}

	
}

