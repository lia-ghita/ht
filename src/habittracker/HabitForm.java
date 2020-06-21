package habittracker;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.HabitDAO;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;
import javax.swing.border.BevelBorder;

public class HabitForm extends JFrame {
	

	private JTextField textField_1;

	public HabitForm() {
		getContentPane().setBackground(new Color(255, 255, 255));
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setBounds(CustomSize.width/4, CustomSize.height/4, 581, 441);
		
		textField_1 = new JTextField();
		textField_1.setBounds(136, 101, 335, 25);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnCreateHabit = new JButton("Creaza obicei");
		btnCreateHabit.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216)));
		btnCreateHabit.setBackground(new Color(216, 191, 216));
		btnCreateHabit.setForeground(new Color(0, 0, 0));
		btnCreateHabit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{ String name=textField_1.getText();  int i=HabitDAO.save( name);
				textField_1.setText("");
				if(i>0){
					  UserMenu uM= new UserMenu();
					  dispose();
					  
					  }}
			}
		});
		btnCreateHabit.setBounds(136, 162, 164, 23);
		getContentPane().add(btnCreateHabit);
		
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
		
		JLabel lblNewLabel = new JLabel("Creaza un obicei nou");
		lblNewLabel.setBounds(239, 76, 103, 14);
		getContentPane().add(lblNewLabel);
	}

		
	
}


