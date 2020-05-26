package habittracker;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.sql.*;
import javax.swing.border.BevelBorder;
import javax.swing.JSeparator;
public class AdminSuccess extends JFrame {

	private JPanel contentPane;

	public AdminSuccess() {
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(CustomSize.width/3, CustomSize.height/3, 581, 441);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAdminSection = new JLabel("Administrare");
		lblAdminSection.setBounds(229, 11, 151, 40);
		lblAdminSection.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblAdminSection.setForeground(Color.GRAY);
		
		JButton btnCreeazaCont = new JButton("Creaza un cont nou");
		btnCreeazaCont.setBounds(72, 73, 181, 49);
		btnCreeazaCont.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216)));
		btnCreeazaCont.setBackground(new Color(216, 191, 216));
		btnCreeazaCont.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCreeazaCont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			UserForm nF = new UserForm();
			dispose();
			}
		});
		
		JButton btnViewUsers = new JButton("Date despre utilizatori");
		btnViewUsers.setBounds(309, 73, 181, 49);
		btnViewUsers.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216)));
		btnViewUsers.setBackground(new Color(216, 191, 216));
		btnViewUsers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewUser vU= new ViewUser();
			}
		});
		btnViewUsers.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(199, 299, 181, 49);
		btnLogout.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216)));
		btnLogout.setBackground(new Color(216, 191, 216));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HabitTracker.main(new String[]{});
				dispose();
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(97, 157, 369, 2);
		
		JButton btnObiceiuri = new JButton("Obiceiuri");
		btnObiceiuri.setBounds(72, 199, 183, 35);
		btnObiceiuri.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnObiceiuri.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216)));
		btnObiceiuri.setBackground(new Color(216, 191, 216));
		btnObiceiuri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			AdminViewHabits nF = new AdminViewHabits();
			}
		});
		
		JButton btnBadges = new JButton("Badges");
		btnBadges.setBounds(309, 199, 179, 34);
		btnBadges.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBadges.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216)));
		btnBadges.setBackground(new Color(216, 191, 216));
		
		
		
		
		
		contentPane.setLayout(null);
		contentPane.add(btnLogout);
		contentPane.add(separator);
		contentPane.add(btnCreeazaCont);
		contentPane.add(btnViewUsers);
		contentPane.add(btnObiceiuri);
		contentPane.add(btnBadges);
		contentPane.add(lblAdminSection);
	}
}
