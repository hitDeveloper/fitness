package back;
import java.sql.*;
import java.util.*;
import java.io.Serializable;

import com.opensymphony.xwork2.ActionContext;

public class orderDisAction
{
	private String userName;
	private String booktime;
	public String getUserName() 
	{
		return userName;
	}
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}
	public String getBooktime() 
	{
		return booktime;
	}
	public void setBooktime(String booktime) 
	{
		this.booktime = booktime;
	}
	public String execute() throws Exception 
	{
		try{
			Map attibutes = ActionContext.getContext().getSession();
			String gymName = null;
			gymName = (String)attibutes.get("gymName");
			info[] information=new info[30];
			int i=0;
			for(i=0;i<30;i++)
				information[i]=new info();
			i=0;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_hitfitness","xwomyojjnm","1imik41h0yi1kmh0hmx02l3i01yz2203ilzikmh1");
			String sql1="select * from tb_book where gymName=\""+gymName+"\"";
			Statement st = (Statement) con.createStatement();
			ResultSet rs = st.executeQuery(sql1);
			while(rs.next())
	        {
				information[i].userName=rs.getString(2);
				information[i].booktime=rs.getString(3);
				i++;
	        }
			attibutes.put("information", information);
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
class info implements Serializable
{
	public String userName;
	public String booktime;
}