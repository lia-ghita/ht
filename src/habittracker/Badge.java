package habittracker;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import dao.BadgeHistoryDAO;

public class Badge {
	
	private String name;
	private String description;

	public Badge(String name, String description) {
		this.name=name;
		this.description=description;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void Print () {
		System.out.println(getName());
		System.out.println(getDescription());
	}
		
	  public  String toString() {  
		  String text= "You have won: " + name+ " "+ description; 
		  return text; 		  
		  }
	  	  
	  public  JPanel DisplayWithLayout ()  { 	  
		  JPanel panel = new JPanel();
		  JTextArea jTA = new JTextArea();
		  jTA.setBounds(10,10,100,100);
		  String text= "You have won:\n " + name+ "\n\n "+ description; 
		  jTA.append(text); 	  
		  panel.add(jTA, BorderLayout.PAGE_END);
		  BufferedImage im = null;
		try {
			im = ImageIO.read(BadgeHistoryDAO.getBadgeImage(this.name));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		JLabel picLabel = new JLabel(new ImageIcon(im));
		  panel.add(picLabel, BorderLayout.PAGE_START);
		  return panel; 
		  }	  
}
