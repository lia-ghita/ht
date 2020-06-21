package habittracker;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.UserDAO;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;
import javax.swing.border.BevelBorder;
import javax.swing.JTextArea;

public class Friends extends JFrame {
	

	private JTextField textField_1;  
	private static ArrayList<String> myFriendsList = new ArrayList<String> ();
	private static ArrayList<String> otherFriendList= new ArrayList<String> ();
	private static ArrayList<Friendship> allFriendsList= new ArrayList<Friendship> ();
	public Friends() {
		getContentPane().setBackground(new Color(255, 255, 255));
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setBounds(CustomSize.width/4, CustomSize.height/4, 581, 441);
		
		textField_1 = new JTextField();
		textField_1.setBounds(136, 101, 335, 25);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JTextArea PrieteniComuni = new JTextArea();
		PrieteniComuni.setBounds(138, 259, 333, 121);
		getContentPane().add(PrieteniComuni);
		
		JButton btnAdd = new JButton("Adauga prieten");
		btnAdd.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216)));
		btnAdd.setBackground(new Color(216, 191, 216));
		btnAdd.setForeground(new Color(0, 0, 0));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{ String friend=textField_1.getText(); 
				int uid=UserDAO.getUserId(friend);
				int i=UserDAO.addFriend(uid);
				textField_1.setText("");
				if(i>0){
					JOptionPane.showMessageDialog(null, "Prietenul a fost adaugat cu succes!");  
					  }
				else JOptionPane.showMessageDialog(null, "Prietenul exista deja!");
				}
				
			}
		});
		btnAdd.setBounds(136, 162, 164, 23);
		getContentPane().add(btnAdd);
		
		JButton btncancel = new JButton("Cancel");
		btncancel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216)));
		btncancel.setBackground(new Color(216, 191, 216));
		btncancel.setForeground(new Color(0, 0, 0));
		btncancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new UserMenu();	
				dispose();
			}
		});
		btncancel.setBounds(310, 162, 161, 23);
		getContentPane().add(btncancel);
		
		JLabel lblNewLabel = new JLabel("Prieteni");
		lblNewLabel.setBounds(273, 60, 103, 14);
		getContentPane().add(lblNewLabel);
		
		JButton btnVeziPrieteniComuni = new JButton("Vezi prieteni comuni");
		btnVeziPrieteniComuni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{ String friend=textField_1.getText(); 		
				int uid=UserDAO.getUserId(friend);	
				ResultSet allFriends=UserDAO.getAllFriends();			
				try {
					while(allFriends.next()) {
						String	user = allFriends.getString("user_id");
						String uFriend =allFriends.getString("friend_id");
						Friendship fr = new Friendship(user, uFriend);		
						allFriendsList.add(fr);	
					}
					findCommonFriends(CurrentUser.id,uid);				
					PrieteniComuni.setText("Prieteni comuni:\n\n");
				} catch (SQLException e1) {
					
					e1.printStackTrace();					
				}}
				if (myFriendsList.size()>0){
			 for (String entry:myFriendsList){
			 String name=UserDAO.getUserName(entry);
			 PrieteniComuni.append(name + "\n"); 	
		     }	        
			} else PrieteniComuni.append("Nu exista prieteni comuni\n"); 
			}
		});
				
		btnVeziPrieteniComuni.setForeground(Color.BLACK);
		btnVeziPrieteniComuni.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216)));
		btnVeziPrieteniComuni.setBackground(new Color(216, 191, 216));
		btnVeziPrieteniComuni.setBounds(223, 210, 164, 23);
		getContentPane().add(btnVeziPrieteniComuni);
		String userName=(UserDAO.getUserName(String.valueOf(CurrentUser.id)));
		JLabel lblUser = new JLabel("User: " + userName);
		
		lblUser.setBounds(419, 11, 103, 14);
		getContentPane().add(lblUser);
	
	}
	
	public static void findCommonFriends(int user, int friend) {
		myFriendsList.clear();
		otherFriendList.clear();
		for (Friendship f:allFriendsList) {			
			String u= f.getUser();			
			if (u.contentEquals(String.valueOf(user))) {
				myFriendsList.add(f.getFriend());
			}
			else if (u.contentEquals(String.valueOf(friend))) {
				otherFriendList.add(f.getFriend());
			}
		}	 
		myFriendsList.retainAll(otherFriendList);
	}
	
	
	
	
}


