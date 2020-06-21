package habittracker;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JTextArea;

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

	  public  JTextArea DisplayWithLayout () { 
		  Color g = new Color(10,2,2);
		  Dimension d = new Dimension(20,200);
		  
		  JTextArea jTA = new JTextArea();
		  jTA.setBounds(10,10,100,100);
		  String text= "You have won:\n " + name+ "\n\n "+ description; 
		  jTA.append(text);
		  return jTA; 
		  
		  }
	  
}
