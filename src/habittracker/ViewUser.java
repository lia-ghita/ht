package habittracker;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import dao.DB;
import dao.HabitDAO;
import dao.HabitHistoryDAO;
import dao.UserDAO;

import javax.swing.JTable;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class ViewUser extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel lblNewLabel;
	private JButton btnSterge;


	public ViewUser() {
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(CustomSize.width/4, CustomSize.height/4, 581, 441);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		String data[][]=null;
		String column[]=null;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from users",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=ps.executeQuery();
			
			ResultSetMetaData rsmd=rs.getMetaData();
			int cols=rsmd.getColumnCount();
			column=new String[cols];
			for(int i=1;i<=cols;i++){
				column[i-1]=rsmd.getColumnName(i);
			}
			
			rs.last();
			int rows=rs.getRow();
			rs.beforeFirst();

			data=new String[rows][cols];
			int count=0;
			while(rs.next()){
				for(int i=1;i<=cols;i++){
					data[count][i-1]=rs.getString(i);
				}
				count++;
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		
		table = new JTable(data,column);
		JScrollPane sp=new JScrollPane(table);
		
		lblNewLabel = new JLabel("Pentru a sterge un user, selectati-l din tabel si apasati butonul \"Sterge\"");
		
		btnSterge = new JButton("Sterge");
		btnSterge.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216)));
		btnSterge.setBackground(new Color(216, 191, 216));
		
		final int column1 = 0;
		btnSterge.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e)
		{ int row = table.getSelectedRow(); 
		String value = table.getModel().getValueAt(row, column1).toString();
	
		int i=UserDAO.delete(value);
	
	//	System.out.println(value);
		if (i>0) {
			JOptionPane.showMessageDialog(null, "Userul a fost sters cu succes");
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Nu am putut sterge userul");
		}
		}});
				
		
		GroupLayout groupLayout = new GroupLayout(contentPane);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(sp, GroupLayout.PREFERRED_SIZE, 555, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnSterge, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(422, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 497, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(58, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(33)
					.addComponent(sp, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addComponent(btnSterge)
					.addContainerGap(184, Short.MAX_VALUE))
		);
		contentPane.setLayout(groupLayout);
	}
}
