package back;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.io.Serializable;

import com.opensymphony.xwork2.ActionContext;

public class deleteBookAction
{
	private String userName;

	public String getUserName() 
	{
		return userName;
	}
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}
	public String execute() throws Exception 
	{
		try{
			Map attibutes = ActionContext.getContext().getSession();
			String gymName;
			gymName = (String)attibutes.get("gymName");
			System.out.println(gymName);
			System.out.println(userName);
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_hitfitness","xwomyojjnm","1imik41h0yi1kmh0hmx02l3i01yz2203ilzikmh1");
			String sql1="delete from tb_book where userName=\""+userName+"\" and gymName=\""+gymName+"\"";
			Statement st = (Statement) con.createStatement();
			st.executeUpdate(sql1);
			st.close();
		}catch(SQLException e)
		{
			return "INPUT";
		}catch(ClassNotFoundException e)
		{
			return "INPUT";
		}
		return "SUCCESS";
	}
}
