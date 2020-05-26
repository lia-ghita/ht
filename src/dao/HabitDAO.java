package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import habittracker.CurrentUser;

public class HabitDAO {
	
	public static String data[][]=null;
	public static String column[]=null;
	
	public static int getHabits(int id){
		int status=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("select id, name from habits where user_id=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			String userid=String.valueOf(CurrentUser.id);
			ps.setString(1,userid);
			
			ResultSet rs=ps.executeQuery();
			
			ResultSetMetaData rsmd=rs.getMetaData();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
			
public static int save(String name){
	int status=0;
	try{
		Connection con=DB.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into habits(name, user_id) values(?,?)");
		String userid=String.valueOf(CurrentUser.id);
		ps.setString(1,name);
		ps.setString(2,userid);
		status=ps.executeUpdate();
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}


public static String getName(String id){
	int status=0;
	String name="";
	try{
		Connection con=DB.getConnection();
		PreparedStatement ps=con.prepareStatement("select name from habits where id= ?");
		ps.setString(1,id);
		//status=ps.executeUpdate();
		ResultSet rs=ps.executeQuery();
		while (rs.next()) {
			 name=rs.getString("name");
		}
		con.close();
	}catch(Exception e){System.out.println(e);}
	return name;
}

public static int delete(String id){
	int status=0;
	try{
		Connection con=DB.getConnection();
		PreparedStatement ps=con.prepareStatement("delete from habits where id=?");
		ps.setString(1,id);
		status=ps.executeUpdate();
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}


public static void getHabits(String id){

try{
	Connection con=DB.getConnection();
	PreparedStatement ps=con.prepareStatement("select id, name from habits where user_id=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	String userid=String.valueOf(CurrentUser.id);
	ps.setString(1,userid);
	
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

}












}
