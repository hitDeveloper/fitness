package page;
import java.sql.*;
import java.util.*;
import java.io.*;
import com.opensymphony.xwork2.ActionContext;
public class displayAction
{
	private String gymName1;
	private String userName;
	private String booktime1;
	public void setGymName1(String gymName1)
	{
		this.gymName1=gymName1;
	}
	public String getGymName1()
	{
		return this.gymName1;
	}
	public void setBooktime1(String booktime1)
	{
		this.booktime1=booktime1;
	}
	public String getBooktime1()
	{
		return this.booktime1;
	}
	public void setUserName(String userName)
	{
		this.userName=userName;
	}
	public String getUserNane()
	{
		return this.userName;
	}
	public String execute() throws Exception 
	{
		try{
			Map attibutes = ActionContext.getContext().getSession();
			userName = (String)attibutes.get("userName");
			if(userName==null)
			{
				return null;
			}
			info1[] information1=new info1[14];
			int i=0;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_hitfitness","xwomyojjnm","1imik41h0yi1kmh0hmx02l3i01yz2203ilzikmh1");
			String sql1="select * from tb_book where userName=\""+userName+"\"";
			Statement st = (Statement) con.createStatement();
			ResultSet rs = st.executeQuery(sql1);
			while(rs.next())
	        {
				information1[i]=new info1();
				information1[i].gymName1 = rs.getString(1);
				information1[i].userName = rs.getString(2);
				information1[i].booktime1 = rs.getString(3);
				i++;
	        }
			attibutes.put("information1", information1);
            rs.close();
		}catch(SQLException e)
		{
			return null;
		}catch(ClassNotFoundException e)
		{
			return null;
		}
		return null;
	}
}
class info1 implements Serializable
{
	public String gymName1;
	public String userName;
	public String booktime1;
}