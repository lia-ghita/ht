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
import java.awt.Dimension;

import javax.swing.border.BevelBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollBar;

public class AdminViewHabits extends JFrame {


		private JPanel contentPane;
		private JTable table;
		private JLabel lblNewLabel;
		private JButton btnSterge;


		public AdminViewHabits() {
		
			setBounds(CustomSize.width/3, CustomSize.height/3, 581, 441);
			
			this.setVisible(true);
			setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
			contentPane = new JPanel();
			contentPane.setBackground(new Color(255, 255, 255));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			String data[][]=null;
			String column[]=null;
			try{
				Connection con=DB.getConnection();
				PreparedStatement ps=con.prepareStatement("select * from habits",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
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
			
			lblNewLabel = new JLabel("Pentru a sterge un obicei, selectati-l din tabel si apasati butonul \"Sterge\"");
			
			btnSterge = new JButton("Sterge");
			btnSterge.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216)));
			btnSterge.setBackground(new Color(216, 191, 216));
			
			final int column1 = 0;
			btnSterge.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e)
			{ int row = table.getSelectedRow(); 
			String value = table.getModel().getValueAt(row, column1).toString();
			int i=HabitHistoryDAO.delete(value);
			int j=HabitDAO.delete(value);
		
		//	System.out.println(value);
			if (i>0) {
				JOptionPane.showMessageDialog(null, "Obiceiul a fost sters cu succes");
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Nu am putut sterge obiceiul");
			}
			}});
					
			
			GroupLayout groupLayout = new GroupLayout(contentPane);
			groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(sp, GroupLayout.PREFERRED_SIZE, 555, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 497, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnSterge, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(49, Short.MAX_VALUE))
			);
			groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addGap(62)
						.addComponent(lblNewLabel)
						.addGap(18)
						.addComponent(sp, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
						.addGap(18)
						.addComponent(btnSterge)
						.addContainerGap())
			);
			contentPane.setLayout(groupLayout);
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

