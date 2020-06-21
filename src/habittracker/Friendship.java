package habittracker;

public class Friendship {
	
	private String user;
	private String friend;
	
	Friendship(String user, String friend){
		this.user=user;
		this.friend=friend;
	}
	
	public String toString(){
		String friendship= this.user+ " " + this.friend;	
		return friendship;
	}
	
	public String getUser() {
		return this.user;
	}
	
	public String getFriend() {
		return this.friend;
	}


}
