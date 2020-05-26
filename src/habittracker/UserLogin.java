package habittracker;
import java.awt.BorderLayout;
import java.awt.EventQueue;

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
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;

public class UserLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtNume;
	private JPasswordField passwordField;

	public UserLogin() {
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(CustomSize.width/4, CustomSize.height/4, 581, 441);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAdminLoginForm = new JLabel(" Login");
		lblAdminLoginForm.setForeground(Color.GRAY);
		lblAdminLoginForm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblEnterName = new JLabel("Nume");
		
		JLabel lblEnterPassword = new JLabel("Parola");
		
		txtNume = new JTextField();
		txtNume.setToolTipText("Nume");
		txtNume.setBackground(new Color(255, 255, 255));
		txtNume.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(216, 191, 216));
		btnLogin.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216)));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String name=txtNume.getText();
			String password=String.valueOf(passwordField.getPassword());
			//System.out.println(name+" "+password);
			if(name.equals("admin")&&password.equals("admin123")){
				CurrentUser.role=1;
				AdminSuccess aS = new AdminSuccess();
				dispose();}
			else
			if(UserDAO.validate(name, password)){
				CurrentUser.role=0;
				CurrentUser.id=UserDAO.getUserId(name);
				System.out.println(CurrentUser.id);
				new UserMenu();	
				dispose();
			}else{
				JOptionPane.showMessageDialog(UserLogin.this, "Nume sau parola incorecte","Login Error!", JOptionPane.ERROR_MESSAGE);
				txtNume.setText("");
				passwordField.setText("");
			}
			}
		});
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Parola");
		passwordField.setBackground(new Color(255, 255, 255));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(250, Short.MAX_VALUE)
					.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addGap(219))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(126)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEnterName)
						.addComponent(lblEnterPassword))
					.addGap(47)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(passwordField)
						.addComponent(txtNume, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
					.addContainerGap(109, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(262, Short.MAX_VALUE)
					.addComponent(lblAdminLoginForm)
					.addGap(244))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(42)
					.addComponent(lblAdminLoginForm)
					.addGap(59)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnterName)
						.addComponent(txtNume, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnterPassword)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
					.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(45))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
