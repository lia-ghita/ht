package habittracker;

import java.awt.Color;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import dao.BadgeHistoryDAO;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import javax.swing.JButton;

public class BadgeList extends JFrame {
	private JPanel contentPane;
	private ArrayList<Badge> badges;
	private Badge b;
	private JPanel panel = new JPanel();
	
	public BadgeList() {
	
	
		String text=" ";
		badges=BadgeHistoryDAO.getBadges(CurrentUser.id);
		      for (int i = 0; i < badges.size();i++) 
		      { 	b=badges.get(i)	;    
		   //   System.out.println(b.getName());
		          b.Print();	
		         text= b.toString() + "\n";
		      
		    panel.add(b.DisplayWithLayout());
		  		
		      }   
		      
	    this.setVisible(true);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(CustomSize.width/4, CustomSize.height/4, 581, 441);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lista de insigne");
		lblNewLabel.setBounds(47, 25, 161, 14);
		contentPane.add(lblNewLabel);
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.setBackground(new Color(255, 204, 204));
		
		
		panel.setBounds(10, 50, 545, 308);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);
		
		JButton btnNewButton = new JButton("Inapoi la meniul principal");
		btnNewButton.setBounds(338, 368, 217, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				UserMenu uM = new UserMenu();

			}
		});
		
		
	}
}
