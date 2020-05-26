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
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;

public class HabitTracker extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HabitTracker hT= new HabitTracker();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HabitTracker() {
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    setBounds(CustomSize.width/4, CustomSize.height/4, 581, 441);
	//	frame.setSize(500, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblHabitTracker = new JLabel("Habit tracker by Lia");
		lblHabitTracker.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHabitTracker.setForeground(Color.GRAY);
		
		JButton btnUserLogin = new JButton("Login");
		btnUserLogin.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216)));
		btnUserLogin.setBackground(new Color(216, 191, 216));
		btnUserLogin.setForeground(new Color(0, 0, 0));
		btnUserLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserLogin uL= new UserLogin();
				dispose();
			}
		});
		
		JButton btnCreateUser = new JButton("Inregistreaza-te");
		btnCreateUser.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216)));
		btnCreateUser.setBackground(new Color(216, 191, 216));
		btnCreateUser.setForeground(new Color(0, 0, 0));
		btnCreateUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserForm uF = new UserForm();
			dispose();
			}
		});
		
		
		
		
		btnUserLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCreateUser.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel = new JLabel("Nu ai cont?");
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(186)
					.addComponent(lblHabitTracker)
					.addContainerGap(216, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(240, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addGap(237))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(175)
					.addComponent(btnUserLogin, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
					.addGap(192))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(198)
					.addComponent(btnCreateUser, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(220, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(63)
					.addComponent(lblHabitTracker)
					.addGap(76)
					.addComponent(btnUserLogin, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addGap(31)
					.addComponent(btnCreateUser, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(31))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
