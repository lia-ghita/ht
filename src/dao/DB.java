package dao;


import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	public static Connection getConnection(){
		Connection con=null;
		try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/habittracker?useSSl=false","habittracker","HTpassword123");
		//con=DriverManager.getConnection("jdbc:mysql://hosting2095618.online.pro:3306/00324868_habittracker?useSSL=false","00324868_habittracker","00324868_habittracker");
		}catch(Exception e){System.out.println(e);}
		return con;
	}

}
