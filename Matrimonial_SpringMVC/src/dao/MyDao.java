package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.UserBean;



public class MyDao {
	//my sql connection code
			public Connection start()
			{
				Connection con=null;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
				}catch(Exception e)
				{
					System.out.println(e);
				}
				return con;
			}
			//insert user information
			public int insertUser(UserBean e)
			{ 
				int x=0;
				
				try {
					
					Connection con=start();
					PreparedStatement ps1=con.prepareStatement("insert into user_inform values(?,?,?,?,?,?,?,?,?,?)");
				    
				    ps1.setString(1,e.getName());
				    ps1.setString(2, e.getGender());
				    java.sql.Date sqlDate = new java.sql.Date(e.getDob().getTime());
				    ps1.setDate(3,sqlDate);
				    ps1.setString(4,e.getReligion());
				    ps1.setString(5,e.getTongue());
				    ps1.setString(6,e.getCaste());
				    ps1.setString(7,e.getCountry());
				    ps1.setInt(8,e.getMnumber());
				    ps1.setString(9,e.getEmail());
				    ps1.setString(10,e.getPassword());
				   			    
				    x=ps1.executeUpdate(); //it not return 0 or 1 .It return no.of rows affected.
				    con.close();
				    }catch(Exception w)
				{
				    	System.out.println(w);
				}
				
			return x;
				
			}
			public int userCheck(String email,String pwd)
			{
				int x=0;
				
				try {
					Connection con=start();
					PreparedStatement ps=con.prepareStatement("select * from user_inform where email=? and password=?");
					ps.setString(1, email);
					ps.setString(2, pwd);
					ResultSet rs=ps.executeQuery();
					
					if(rs.next())
						x=1;
					con.close();
					}catch(  SQLException e)
				{
						System.out.println(e);
				}
				
				return x;
			}
			public ArrayList<UserBean>   viewUser(String gender)
			{
				ArrayList<UserBean> list=new ArrayList<>();
				try(Connection con=start()) {
					
					PreparedStatement ps=con.prepareStatement("select * from user_inform where gender!=?");
					ps.setString(1,gender);
					ResultSet rs=ps.executeQuery();
					while(rs.next())
					{ 
					    UserBean e=new UserBean();
						e.setName(rs.getString("name"));
						e.setGender(rs.getString("gender"));
						e.setDob(rs.getDate("dob"));
						e.setReligion(rs.getString("religion"));
						e.setTongue(rs.getString("tongue"));
						e.setCaste(rs.getString("caste"));
						e.setCountry(rs.getString("country"));
						e.setMnumber(rs.getInt("mnumber"));
						e.setEmail(rs.getString("email"));
						
						list.add(e);
				     }
					//con.close();
				}catch( SQLException w)
					{
					  System.out.println(w);
					}
			return list;
				
			}
			public String getGender(String email)
			{
				String gender=null;
				
				try {
					Connection con=start();
					PreparedStatement ps=con.prepareStatement("select gender from user_inform where email=?");
					ps.setString(1, email);
					
					ResultSet rs=ps.executeQuery();
					
					if(rs.next())
					{
						gender=rs.getString(1);
					}
					con.close();
					}catch(  SQLException e)
				{
						System.out.println(e);
				}
				
				return gender;
			}
	

}
