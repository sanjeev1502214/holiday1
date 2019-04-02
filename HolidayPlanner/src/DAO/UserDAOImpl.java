package DAO;
import Model.ConnectionClass;
import Model.User;
import java.util.*;
import java.sql.*;
public class UserDAOImpl implements UserDAO {
	public UserDAOImpl () {}
public void Create_UserDet(User u_obj) throws ClassNotFoundException, SQLException {
	try { 
		Connection con = ConnectionClass.getConnection();
		String qry="Insert into user values(?,?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(qry);
		System.out.println(u_obj.getF_name());
		ps.setString(1, u_obj.getF_name());
		ps.setString(2, u_obj.getL_name());
		ps.setInt(3, u_obj.getAge());
		ps.setString(4, u_obj.getGender());
		ps.setLong(5, u_obj.getContact_num());
		ps.setString(6, u_obj.getE_Mail());
		ps.setString(7, u_obj.getPassword());
		long count=ps.executeUpdate();
		System.out.println(count + " Row(s) Inserted");
		
		con.close();
	}
	catch(Exception E) {
		System.out.println("Error: "+E);
	}
}

public void Update_UserDet(User u_obj)  throws ClassNotFoundException, SQLException{
	try {
		Connection con = ConnectionClass.getConnection();
		    String qry="Update User set First_Name=?,Last_Name=?,Gender=?,Email=?,contactno=?,Age=?,"
		    		+ "Password=?";
		    PreparedStatement ps=con.prepareStatement(qry);
		    
		    ps.setString(1, u_obj.getF_name());
			ps.setString(2, u_obj.getL_name());
			ps.setInt(3, u_obj.getAge());
			ps.setString(4, u_obj.getGender());
			ps.setLong(5, u_obj.getContact_num());
			ps.setString(6, u_obj.getE_Mail());
			ps.setString(7, u_obj.getPassword());
		    
		    long count=ps.executeUpdate();
		    System.out.println(count+" Row(s) Updated");
		    
		    con.close();
	}catch(Exception E) {
		System.out.println("Error: "+E);
	}
	
}

public User ViewUserbyId(String u_id) throws ClassNotFoundException, SQLException{
	User u_obj=new User();
	try {
		Connection con = ConnectionClass.getConnection();
		String qry="Select * from User where EmailID='"+u_id+"'";
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(qry);
	
		while(rs.next()) {
			String f_name=rs.getString(1); 
			String l_name=rs.getString(2); 
			int age=rs.getInt(3);
			String gender=rs.getString(4);
			long contact_num=rs.getLong(5);
			String e_Mail=rs.getString(6);
			String password=rs.getString(7);
			u_obj=new User(f_name, l_name, gender, e_Mail, contact_num, age, password);
			con.close();
			
			
		
		}
	}catch(Exception E) {
		System.out.println("Exception "+E);
	}
	
	return u_obj;

}

public List<User> ListAllUsers() throws ClassNotFoundException, SQLException{
	List<User> Users_View=new ArrayList<>(); 
	try{
		
		Connection con = ConnectionClass.getConnection();
	String qry="Select * from User";
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery(qry);
	while(rs.next()) {
	
		String f_name=rs.getString(1); 
		String l_name=rs.getString(2); 
		int age=rs.getInt(3);
		String gender=rs.getString(4);
		long contact_num=rs.getLong(5);
		String e_Mail=rs.getString(6);
		String password=rs.getString(7);
		Users_View.add(new User(f_name, l_name, gender, e_Mail, contact_num, age, password));
	}
	}catch(Exception E) {
		System.out.println("Exception : E");
	}
	
	return Users_View;
	}

@Override
public boolean checkLoginField(String u_id, String pwd) {
	{
		boolean resp=false;

		try{
			Connection con = ConnectionClass.getConnection();
		    String qry="Select UserId,Password from User where UserId='"+u_id+"'";
		    Statement stmt=con.createStatement();
		    ResultSet rs=stmt.executeQuery(qry);
		    rs.next();
		    String cu_id=rs.getString(1);
		    String cpwd=rs.getString(2);
		    
		    if(cu_id.equals(u_id) && cpwd.equals(pwd)) {
		    	resp=true;
		    }
		    else resp=false;  
		}catch(Exception E) {
			System.out.println("Error : "+E);
		}
	    return resp;
	}

}

@Override
public int getCustomerId() {
	int id=0;
	try {
		Connection con = ConnectionClass.getConnection();
		String qry="Select Customer_Id from user";
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(qry);
		rs.last();
		id=rs.getInt(1);
		if(id==0)id=32998820;
		}catch(Exception E) {
		System.out.println("Exception : "+E);
	}
return id;
}

@Override
public int getCustomerId(User obj) {
	int id=0;
	try {
		Connection con = ConnectionClass.getConnection();
		String qry="Select Customer_Id from user where UserId='"+obj.getE_Mail()+"'";
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(qry);
		rs.next();
		id=rs.getInt(1);
	}catch(Exception E) {
		System.out.println("Exception : "+E);
	}
	return id;
}
}