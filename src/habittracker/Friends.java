package habittracker;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.HabitDAO;
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
	private ArrayList<String> myFriendsList = new ArrayList<String> ();
	private ArrayList<String> otherFriendList= new ArrayList<String> ();
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
					  System.out.println("Prieten adaugat");	  
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
				ResultSet myFriends=UserDAO.getMyFriends(friend);
				ResultSet otherFriends=UserDAO.getFriendsOfOthers(friend);
			
				try {
					while(myFriends.next()){
					String	id = myFriends.getString("friend_id");
					myFriendsList.add(id);
					PrieteniComuni.setText("Prieteni:\n");
					//PrieteniComuni.append(id + "\n");
					  }
					while(otherFriends.next()) {
						String	id2 = otherFriends.getString("friend_id");
						otherFriendList.add(id2);
					//	PrieteniComuni.append(id2 + "\n");
					}
					
						
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}}
				
				 myFriendsList.retainAll( otherFriendList );
			        System.out.println( myFriendsList );
			        for (int i=0; i<myFriendsList.size(); i++){
			String name=UserDAO.getUserName(myFriendsList.get(i));
			        	PrieteniComuni.append(name + "\n");
		}
			        
			}
		});
		
       
		
		btnVeziPrieteniComuni.setForeground(Color.BLACK);
		btnVeziPrieteniComuni.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216)));
		btnVeziPrieteniComuni.setBackground(new Color(216, 191, 216));
		btnVeziPrieteniComuni.setBounds(223, 210, 164, 23);
		getContentPane().add(btnVeziPrieteniComuni);
		
		
	}
}


