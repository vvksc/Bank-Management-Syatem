package BankManagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Transation  extends JFrame implements ActionListener{
			JButton deposit,withdrawl,fastcash,ministatement,pinchange,balanceenq,exit;
			String pinnumber;
	public Transation(String pin) {
		pinnumber=pin;
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);
		
		JLabel text=new JLabel("Please select your Transation");
		text.setBounds(210, 280, 700, 35);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System",Font.BOLD,18));
		image.add(text);
		
		 deposit=new JButton("Deposit");
		deposit.setBounds(150, 388, 150, 30);
		deposit.addActionListener(this);
		image.add(deposit);
	
		withdrawl=new JButton("Cash Withdrawl");
		withdrawl.setBounds(350, 388, 150, 30);
		withdrawl.addActionListener(this);
		image.add(withdrawl);
		
		fastcash=new JButton("Fast Cash");
		fastcash.setBounds(150, 425, 150, 30);
		fastcash.addActionListener(this);
		image.add(fastcash);
		
		 ministatement=new JButton("Mini-Statement");
		ministatement.setBounds(350, 425, 150, 30);
		ministatement.addActionListener(this);
		image.add(ministatement);
		
		pinchange=new JButton("Pin Change");
		pinchange.setBounds(150, 460, 150, 30);
		pinchange.addActionListener(this);
		image.add(pinchange);
		
		balanceenq=new JButton("Balance Enquery");
		balanceenq.setBounds(350, 460, 150, 30);
		balanceenq.addActionListener(this);
		image.add(balanceenq);
		
		 exit=new JButton("Exit");
		exit.setBounds(350, 493, 150, 30);
		exit.addActionListener(this);
		image.add(exit);
		
		
		
		
		
			setSize(900,900);
			setLocation(300, 0);
			setUndecorated(true);
			getContentPane().setBackground(Color.WHITE);
			setVisible(true);
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==exit) {
			System.exit(0);
		}else if(e.getSource()==deposit) {
			setVisible(false); new Deposit(pinnumber).setVisible(true);
		}else if(e.getSource()==withdrawl) {
			setVisible(false); new Withdrawl(pinnumber).setVisible(true);
		}else if(e.getSource()==fastcash) {
			setVisible(false); new FastCash(pinnumber).setVisible(true);
		}
	}
	public static void main(String[] args) {
		new Transation("");
	}

	
}
