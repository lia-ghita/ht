package habittracker;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import dao.HabitDAO;
import dao.HabitHistoryDAO;
import java.awt.Color;
import java.awt.Font;

public class Statistics extends JFrame{
	private JPanel contentPane;
	private String habit;

	public Statistics(String habit) {
		
	    this.setVisible(true);
	    this.habit=habit;
	    
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(CustomSize.width/4, CustomSize.height/4, 581, 441);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setForeground(new Color(128, 0, 128));
		lblNewLabel.setText(HabitDAO.getName(habit));
		lblNewLabel.setBounds(258, 11, 106, 14);
		getContentPane().add(lblNewLabel);
		
		//Zile logate in total
		
		JLabel lblNewLabel_1 = new JLabel("0");
		lblNewLabel_1.setBounds(49, 278, 59, 14);
		lblNewLabel_1.setText(HabitHistoryDAO.getDaysLogged(habit, CurrentUser.id));
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("zile logate in total");
		lblNewLabel_2.setForeground(new Color(128, 0, 128));
		lblNewLabel_2.setBounds(105, 278, 242, 14);
		getContentPane().add(lblNewLabel_2);
		
		// Zile logate in anul curent
		
		JLabel label = new JLabel("0");
		label.setBounds(49, 203, 59, 14);
		label.setText(HabitHistoryDAO.getDaysLoggedCurrentYear(habit, CurrentUser.id));
		contentPane.add(label);
		
		JLabel lblZileLogateAnul = new JLabel("zile logate anul acesta");
		lblZileLogateAnul.setForeground(new Color(128, 0, 128));
		lblZileLogateAnul.setBounds(105, 203, 242, 14);
		contentPane.add(lblZileLogateAnul);
		
		// Zile logate consecutiv - Streak
		
		JLabel label_2 = new JLabel("");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_2.setBounds(288, 100, 59, 25);
		label_2.setText(HabitHistoryDAO.getStreak(habit, CurrentUser.id));
		contentPane.add(label_2);
		
		JLabel lblZileLogateConsecutiv = new JLabel("Streak");
		lblZileLogateConsecutiv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblZileLogateConsecutiv.setForeground(new Color(128, 0, 128));
		lblZileLogateConsecutiv.setBounds(223, 100, 242, 25);
		contentPane.add(lblZileLogateConsecutiv);
		
		// Maximum steak
		

		JLabel label_4 = new JLabel("0");
		label_4.setBounds(49, 239, 59, 14);
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		double numOfDays = (double) cal.getActualMaximum(Calendar.DAY_OF_YEAR);	
		String nrDaysLogged=HabitHistoryDAO.getDaysLoggedCurrentYear(habit, CurrentUser.id);
		double intNrOfDaysLogged= (double) Integer.parseInt(nrDaysLogged);		
		float rate= (float) (intNrOfDaysLogged/numOfDays);
		label_4.setText(String.format("%.2f", rate) + "%");
		contentPane.add(label_4);
		
		JLabel lblMaximumDeZile = new JLabel("progres pe anul curent");
		lblMaximumDeZile.setForeground(new Color(128, 0, 128));
		lblMaximumDeZile.setBounds(105, 239, 242, 14);
		contentPane.add(lblMaximumDeZile);
		
		//Zile logate luna curenta
		
		
		JLabel label_1 = new JLabel(""); 
		label_1.setBounds(49, 163, 59, 14);
		label_1.setText(HabitHistoryDAO.dayLoggedCurrentMonth(habit, CurrentUser.id)); 
		contentPane.add(label_1);
		
		JLabel lblZileLogateLuna = new JLabel("zile logate luna aceasta");
		lblZileLogateLuna.setForeground(new Color(128, 0, 128));
		lblZileLogateLuna.setBounds(105, 163, 242, 14);
		contentPane.add(lblZileLogateLuna);
		
	}



	/*
	 * public String getHabitName(String id) { String name=""; return name; }
	 */
}
