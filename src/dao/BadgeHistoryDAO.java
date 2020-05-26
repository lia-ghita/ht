package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import habittracker.Badge;


public class BadgeHistoryDAO {

	
	public static ArrayList<Badge> getBadges(int user_id){
	
		ArrayList<Badge> badges = new ArrayList<Badge>();
		String description="";
		String name="";
		try{
			Connection con=DB.getConnection();
		//	PreparedStatement ps=con.prepareStatement("select name, description from badges where id in(select badge_id from badge_history where user_id=?)");
			PreparedStatement ps=con.prepareStatement("call badges(?,@bname, @bdescription)");
			ps.setInt(1,user_id);
		
			ResultSet rs=ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
		
			/*
			 * while (rs.next()) { for (int i = 1; i <= columnsNumber; i++) { if (i > 1)
			 * System.out.print(",  "); String columnValue = rs.getString(i);
			 * System.out.print(columnValue);
			 * 
			 * } System.out.println("");
			 * 
			 * 
			 * name = rs.getString("name"); System.out.println(name); description =
			 * rs.getString("description"); System.out.println(description); Badge badge=
			 * new Badge(name, description); badges.add(badge); }
			 */
			badges.clear();
					
			while (rs.next()) {
				name = rs.getString("name");
				
			 //   System.out.println(name);
				description = rs.getString("description");
			//	System.out.println(description);
				Badge badge= new Badge(name, description);
				badges.add(badge);
			}
			
			
			
			
			con.close();
		}catch(Exception e){System.out.println(e);}
		
		return badges;
	}



	}

	
	