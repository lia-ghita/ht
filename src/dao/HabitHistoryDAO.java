package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import habittracker.CurrentUser;

public class HabitHistoryDAO {

public static int track(String value){
	int status=0;
	try{
		Connection con=DB.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into habit_history(habit_id, user_id, date_marked, marked_as) values(?,?,curdate(),?)");
		String userid=String.valueOf(CurrentUser.id);
		ps.setString(1,value);
		ps.setString(2,userid);
		ps.setString(3,"1");
		status=ps.executeUpdate();
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}


public static int delete(String id){
	int status=0;
	try{
		Connection con=DB.getConnection();
		PreparedStatement ps=con.prepareStatement("delete from habit_history where habit_id=?");
		ps.setString(1,id);
		status=ps.executeUpdate();
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}



public static String getDaysLogged(String habit_id, int user_id){
	int status=0;
	String count="0";
	try{
		Connection con=DB.getConnection();
		PreparedStatement ps=con.prepareStatement("select count(habit_id) as done from habit_history where habit_id=? and user_id =? and marked_as=1");
		ps.setString(1,habit_id);
		ps.setInt(2,user_id);
		ResultSet rs=ps.executeQuery();
		while (rs.next()) {
			 count=rs.getString("done");
		}
		
		con.close();
	}catch(Exception e){System.out.println(e);}
	return count;
}

public static String getDaysLoggedCurrentYear(String habit_id, int user_id){
	int status=0;
	String count="0";
	try{
		Connection con=DB.getConnection();
		//PreparedStatement ps=con.prepareStatement("select count(habit_id) as done from habit_history where habit_id=? and user_id =? and marked_as=1 and year(date_marked)=YEAR(CURDATE())");
		PreparedStatement ps=con.prepareStatement("call zileLogateAnCurent(?,?,@days)");
		ps.setString(1,habit_id);
		ps.setInt(2,user_id);
		ResultSet rs=ps.executeQuery();
		while (rs.next()) {
			 count=rs.getString("done");
		}
		
		con.close();
	}catch(Exception e){System.out.println(e);}
	return count;
}

public static String dayLoggedCurrentMonth(String habit_id, int user_id){
	int status=0;
	String count="0";
	try{
		Connection con=DB.getConnection();
		//PreparedStatement ps=con.prepareStatement("select count(habit_id) as done from habit_history where habit_id=? and user_id =? and marked_as=1 and year(date_marked)=YEAR(CURDATE())");
		PreparedStatement ps=con.prepareStatement("call zileLogateLunaCurenta(?,?,@done)");
		ps.setString(1,habit_id);
		ps.setInt(2,user_id);
		ResultSet rs=ps.executeQuery();
		while (rs.next()) {
			 count=rs.getString("done");
		}
		
		con.close();
	}catch(Exception e){System.out.println(e);}
	return count;
}


public static String getStreak(String habit_id, int user_id){
	int status=0;
	String count="";
	try{
		Connection con=DB.getConnection();
		//PreparedStatement ps=con.prepareStatement("select count(habit_id) as done from habit_history where habit_id=? and user_id =? and marked_as=1 and year(date_marked)=YEAR(CURDATE())");
		//PreparedStatement ps=con.prepareStatement("call Streak(?,?,@streak)");
	//	PreparedStatement ps=con.prepareStatement("select currentStreak(?,?) as streak");
		PreparedStatement ps=con.prepareStatement("call currentStreak(?,?,@streak)");
		ps.setString(1,habit_id);
		ps.setInt(2,user_id);
		ResultSet rs=ps.executeQuery();
		while (rs.next()) {
			 count=rs.getString("streak");
		}
		
		con.close();
	}catch(Exception e){System.out.println(e);}
	return count;
}



































}
