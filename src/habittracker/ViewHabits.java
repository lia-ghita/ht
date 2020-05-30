package habittracker;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import dao.DB;
import dao.HabitDAO;
import dao.HabitHistoryDAO;

import javax.swing.JTable;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class ViewHabits extends JFrame {

	private JPanel contentPane;
	private JTable table;
	static String data[][] = null;
	static String column[] = null;

	public ViewHabits() {
		this.setVisible(true);

		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(CustomSize.width/4, CustomSize.height/4, 581, 441);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		// Incarcarea tabelului
		loadTable();

		table = new JTable(data, column);
		 table = new JTable(new AbstractTableModel() {
			 
			 @Override
			 public String getColumnName(int column) {
			     return null;
			 }
			    @Override
			    public int getRowCount() {
			        return data.length;
			    	//return 100_000_000;
			    }
			    @Override
			    public int getColumnCount() {
			    	return 1;
			        //return 5;
			    }
			    
			    @Override
			    public Object getValueAt(int rowIndex, int columnIndex) {
			        return data[rowIndex][1];
			    	//return rowIndex + " : " + columnIndex;
			    }
			});
		JScrollPane sp = new JScrollPane(table);
		sp.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(216, 191, 216), new Color(216, 191, 216),
				new Color(216, 191, 216), new Color(216, 191, 216)));
		sp.setBackground(new Color(255, 255, 255));

		// Actiunile butoanelor

		JButton log = new JButton("Log");
		log.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(216, 191, 216), new Color(216, 191, 216),
				new Color(216, 191, 216), new Color(216, 191, 216)));
		log.setBackground(new Color(216, 191, 216));
		JButton stats = new JButton("Statistici");
		stats.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(216, 191, 216), new Color(216, 191, 216),
				new Color(216, 191, 216), new Color(216, 191, 216)));
		stats.setBackground(new Color(216, 191, 216));
		int column1 = 0;
		log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				
					int i = HabitHistoryDAO.track(data[row][0]);
				// System.out.println(value);
				if (i > 0) {
					JOptionPane.showMessageDialog(null, "Felicitari!");
				} else {
					JOptionPane.showMessageDialog(null, "Acest obicei a fost deja marcat ca efectuat astazi!");
				}
			}
		});

		stats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				//String value = table.getModel().getValueAt(row, column1).toString();
				Statistics s = new Statistics(data[row][0]);

			}
		});

		JButton btnSterge = new JButton("Sterge");
		btnSterge.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(216, 191, 216), new Color(216, 191, 216),
				new Color(216, 191, 216), new Color(216, 191, 216)));
		btnSterge.setBackground(new Color(216, 191, 216));
		btnSterge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				String value = data[row][0];
				int j = HabitHistoryDAO.delete(value);
				int i = HabitDAO.delete(value);
				loadTable();
				// table.repaint();
				AbstractTableModel tableModel = (AbstractTableModel) table.getModel();
				tableModel.fireTableDataChanged();
				

				// System.out.println(value);
				if (i > 0) {
					JOptionPane.showMessageDialog(null, "Obiceiul a fost sters cu succes");

				} else {
					JOptionPane.showMessageDialog(null, "Nu am putut sterge obiceiul");
				}
			}
		});

		// Inapoi la meniul principal

		JButton btnInapoiLaMeniul = new JButton("Inapoi la meniul principal");
		btnInapoiLaMeniul.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(216, 191, 216),
				new Color(216, 191, 216), new Color(216, 191, 216), new Color(216, 191, 216)));
		btnInapoiLaMeniul.setBackground(new Color(216, 191, 216));
		btnInapoiLaMeniul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				UserMenu uM = new UserMenu();

			}
		});

		// Layout

		JLabel lblNewLabel = new JLabel(
				"Selecteaza un obicei din lista si apasa log pentru a marca obiceiul ca si indeplinit pentru astazi");
		JLabel lblPentruASterge = new JLabel("Pentru a sterge un obicei, selecteaza-l din lista si apasa \"Sterge\"");
		JLabel lblAtentieStergereaUnui = new JLabel(
				"Atentie! Stergerea unui obicei implica stergerea tuturor datelor logate despre acesta!");

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false).addComponent(lblNewLabel)
						.addComponent(sp, GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(log, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(stats, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblPentruASterge, GroupLayout.PREFERRED_SIZE, 444, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSterge, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAtentieStergereaUnui, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE))
				.addContainerGap(26, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap(253, Short.MAX_VALUE)
						.addComponent(btnInapoiLaMeniul, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
						.addGap(37)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addComponent(lblNewLabel).addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(sp, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE).addGap(18)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(log).addComponent(stats))
				.addGap(18).addComponent(lblPentruASterge).addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(lblAtentieStergereaUnui).addGap(18).addComponent(btnSterge).addGap(29)
				.addComponent(btnInapoiLaMeniul).addGap(25)));
		contentPane.setLayout(gl_contentPane);

	}

	static void loadTable() {

		try {
			Connection con = DB.getConnection();
			PreparedStatement ps = con.prepareStatement("select id, name from habits where user_id=?",
					ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			String userid = String.valueOf(CurrentUser.id);
			ps.setString(1, userid);

			ResultSet rs = ps.executeQuery();

			ResultSetMetaData rsmd = rs.getMetaData();
			int cols = rsmd.getColumnCount();
			column = new String[cols];
			for (int i = 1; i <= cols; i++) {
				column[i - 1] = rsmd.getColumnName(i);
			}

			rs.last();
			int rows = rs.getRow();
			rs.beforeFirst();

			data = new String[rows][cols];
			int count = 0;
			while (rs.next()) {
				for (int i = 1; i <= cols; i++) {
					data[count][i - 1] = rs.getString(i);
				}
				count++;
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
